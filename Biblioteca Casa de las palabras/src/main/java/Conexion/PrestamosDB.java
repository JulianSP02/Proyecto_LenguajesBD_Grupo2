
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrestamosDB {
    private Connection conexion;
    private String idPrestamo;

    public PrestamosDB() {
        conexion = ConexionBD.getConnection();
    }
    public String obtenerEstadoPrestamo(String idPrestamo) throws SQLException {
        String consulta = "SELECT ESTADO FROM PRESTAMO WHERE ID_PRESTAMO = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, idPrestamo);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                return resultSet.getString("ESTADO");
            } else {
                return null;
            }
        }
    }
    public List<Prestamo> obtenerTodosLosPrestamos() throws SQLException {
    List<Prestamo> prestamos = new ArrayList<>();
    
    String query = "SELECT * FROM prestamo";
    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "adminBibli", "12345");
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {
        
        while (resultSet.next()) {
            Prestamo prestamo = new Prestamo();
            prestamo.setIdPrestamo(resultSet.getInt("ID_PRESTAMO"));
            prestamo.setIdLibro(resultSet.getInt("ID_LIBRO"));
            prestamo.setFechaPrestamo(resultSet.getString("FECHA_PRESTAMO"));
            prestamo.setFechaDevolucion(resultSet.getString("FECHA_DEVOLUCION"));
            prestamo.setIdUsuario(resultSet.getInt("ID_USUARIO"));
            prestamo.setEstado(resultSet.getString("ESTADO"));
            
            prestamos.add(prestamo);
        }
    }
    
    return prestamos;
}

    public String consultarPrestamo(String idPrestamo) throws SQLException {
        String consulta = "SELECT * FROM PRESTAMO WHERE ID_PRESTAMO = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, idPrestamo);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String idLibro = resultSet.getString("ID_LIBRO");
                String idUsuario = resultSet.getString("ID_USUARIO");
                String fechaPrestamo = resultSet.getString("FECHA_PRESTAMO");
                String fechaDevolucion = resultSet.getString("FECHA_DEVOLUCION");
                String estado = resultSet.getString("ESTADO");
                
                String resultado = "ID_PRESTAMO: " + idPrestamo + "\n"
                        + "ID_LIBRO: " + idLibro + "\n"
                        + "ID_USUARIO: " + idUsuario + "\n"
                        + "FECHA_PRESTAMO: " + fechaPrestamo + "\n"
                        + "FECHA_DEVOLUCION: " + fechaDevolucion + "\n"
                        + "ESTADO: " + estado;
                
                return resultado;
            } else {
                return "No se encontró un prestamo con ese ID";
            }
        }
    }

    public boolean desactivarActivarPrestamo(String idPrestamo, String nuevoEstado) throws SQLException {
        String update = "UPDATE PRESTAMO SET ESTADO = ? WHERE ID_PRESTAMO = ?";
        try (PreparedStatement statement = conexion.prepareStatement(update)) {
            statement.setString(1, nuevoEstado);
            statement.setString(2, idPrestamo);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    public boolean eliminarPrestamo(String idPrestamo) throws SQLException {
        String delete = "DELETE FROM PRESTAMO WHERE ID_PRESTAMO = ?";
        try (PreparedStatement statement = conexion.prepareStatement(delete)) {
            statement.setString(1, idPrestamo);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        }
    }
    
    public boolean agregarPrestamo(String idPrestamo, String idLibro, String idUsuario, String fechaPrestamo, String fechaDevolucion) throws SQLException {
    String insert = "INSERT INTO PRESTAMO (ID_PRESTAMO, ID_LIBRO, ID_USUARIO, FECHA_PRESTAMO, FECHA_DEVOLUCION, ESTADO) VALUES (?, ?, ?, ?, ?, 'Activo')";
    try (PreparedStatement statement = conexion.prepareStatement(insert)) {
        statement.setString(1, idPrestamo);
        statement.setString(2, idLibro);
        statement.setString(3, idUsuario);
        statement.setString(4, fechaPrestamo);
        statement.setString(5, fechaDevolucion);
        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;
    }
}


}