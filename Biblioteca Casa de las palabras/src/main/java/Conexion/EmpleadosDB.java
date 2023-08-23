
package Conexion;

import Conexion.ConexionBD;
import Conexion.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadosDB {

    public ArrayList<Empleado> listarEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            Connection cn = ConexionBD.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLEADOS");
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(rs.getInt("ID_EMPLEADO"));
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setSalario(rs.getDouble("SALARIO"));
                empleado.setFechaContratacion(rs.getString("FECHA_CONTRATACION"));
                empleado.setPuesto(rs.getString("PUESTO"));
                // Agregar más atributos si es necesario
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en el listado de empleados");
        }
        return empleados;
    }

    public void insertarEmpleado(Empleado empleado) {
        try {
            Connection cn = ConexionBD.getConnection();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO EMPLEADOS(ID_EMPLEADO, NOMBRE, SALARIO, FECHA_CONTRATACION, PUESTO) VALUES (?, ?, ?, ?, ?)");
            pst.setInt(1, empleado.getId());
            pst.setString(2, empleado.getNombre());
            pst.setDouble(3, empleado.getSalario());
            pst.setString(4, empleado.getFechaContratacion());
            pst.setString(5, empleado.getPuesto());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar empleado");
        }
    }

    public Empleado consultarEmpleadoPorId(int idEmpleado) {
        Empleado empleado = null;
        try {
            Connection cn = ConexionBD.getConnection();
            String query = "SELECT * FROM EMPLEADOS WHERE ID_EMPLEADO = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, idEmpleado);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("ID_EMPLEADO");
                String nombre = rs.getString("NOMBRE");
                double salario = rs.getDouble("SALARIO");
                String fechaContratacion = rs.getString("FECHA_CONTRATACION");
                String puesto = rs.getString("PUESTO");

                empleado = new Empleado(id, nombre, salario, fechaContratacion, puesto);
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar el empleado por ID");
        }

        return empleado;
    }

    public boolean eliminarEmpleadoPorId(int idEmpleado) {
        try {
            Connection cn = ConexionBD.getConnection();
            PreparedStatement pst = cn.prepareStatement("DELETE FROM EMPLEADOS WHERE ID_EMPLEADO = ?");
            pst.setInt(1, idEmpleado);
            int rowsAffected = pst.executeUpdate();
            pst.close();
            return rowsAffected > 0; // Si se eliminaron filas, el empleado fue eliminado
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar empleado por ID");
            return false;
        }
    }
}