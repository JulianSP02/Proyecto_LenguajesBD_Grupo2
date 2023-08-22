/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Clases.principales.Socios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author July
 */
public class SociosBD {
    //Codigo para listar socios en la BD
    public ArrayList<Socios> ListSocios(){
        ArrayList<Socios> socio = new ArrayList();
        try{
            Connection cn = ConexionBD.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_USUARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO,"
                    + "  TIPO_MEMBRESIA FROM SOCIO ORDER BY 1  ");
            while(rs.next()){
                Socios sc = new Socios();
                sc.setId_usuario(rs.getInt("ID_USUARIO"));
                sc.setNombre(rs.getString("NOMBRE"));
                sc.setApellido(rs.getString("APELLIDO"));
                sc.setDireccion(rs.getString("DIRECCION"));
                sc.setTelefono(rs.getInt("TELEFONO"));
                sc.setTipo_membresia(rs.getString("TIPO_MEMBRESIA"));
                socio.add(sc);
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en el listado");
        }
        
        return socio;
    }
    
    public void insertarSocios(Socios socio){
        try{
            Connection cn = ConexionBD.getConnection();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO SOCIO(ID_USUARIO,NOMBRE,APELLIDO,DIRECCION,"
                    + "TELEFONO,TIPO_MEMBRESIA) VALUES (?,?,?,?,?,?)");
            pst.setInt(1, socio.getId_usuario());
            pst.setString(2, socio.getNombre());
            pst.setString(3, socio.getApellido());
            pst.setString(4, socio.getDireccion());
            pst.setInt(5, socio.getTelefono());
            pst.setString(6, socio.getTipo_membresia());
            pst.executeUpdate();
            
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error a la hora de insertar");
        }
    }
    
    private String mensaje  = "";
    
    public String modificarSocios(Connection cn, Socios socio){
        PreparedStatement pst = null;
        String sql = "UPDATE SOCIO SET NOMBRE = ?,APELLIDO = ?,DIRECCION = ?,TELEFONO = ?,TIPO_MEMBRESIA = ?"
                + "WHERE ID_USUARIO = ?";
        try{
            pst = cn.prepareStatement(sql);
            pst.setString(1, socio.getNombre());
            pst.setString(2, socio.getApellido());
            pst.setString(3, socio.getDireccion());
            pst.setInt(4, socio.getTelefono());
            pst.setString(5, socio.getTipo_membresia());
            pst.setInt(6, socio.getId_usuario());
            pst.execute();
            pst.close();
        }catch (SQLException e){
            mensaje = "No se pudo actualizar \n" + e.getMessage();
        }
        return mensaje;
    }
}
