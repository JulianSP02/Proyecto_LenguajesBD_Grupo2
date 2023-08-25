/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;


import Clases.principales.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibrosBD {
    
    public ArrayList<Libro> ListLibro(){
        ArrayList<Libro> libro = new ArrayList();
        try{
            Connection cn = ConexionBD.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_LIBRO,TITULO,AUTOR,CATEGORIA_ID FROM LIBRO ORDER BY 1");
            while(rs.next()){
                Libro ct = new Libro();
                ct.setId_libro(rs.getInt("ID_LIBRO"));
                ct.setTitulo(rs.getString("TITULO"));
                ct.setAutor(rs.getString("AUTOR"));
                ct.setCategoria_id(rs.getInt("CATEGORIA_ID"));
                libro.add(ct);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Error en el listado");
        }
        
        return libro;
    }
    
    public void insertarLibros(Libro libro){
        try{
            Connection cn = ConexionBD.getConnection();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO LIBRO(ID_LIBRO,TITULO,AUTOR,CATEGORIA_ID) VALUES (?,?,?,?)");
            pst.setInt(1, libro.getId_libro());
            pst.setString(2, libro.getTitulo());
            pst.setString(3, libro.getAutor());
            pst.setInt(4, libro.getCategoria_id());
            pst.executeUpdate();
            
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error a la hora de insertar");
        }
    }
}
