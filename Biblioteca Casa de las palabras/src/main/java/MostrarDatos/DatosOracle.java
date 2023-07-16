package MostrarDatos;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatosOracle {
    
    public static void main(String[] args){
        String sSQL = "";
        ConexionBD conexion = new ConexionBD();
        
        try{
            sSQL = "SELECT * FROM categoria";
            Connection con = conexion.conectar();
            Statement cn = con.createStatement();
            ResultSet res = cn.executeQuery(sSQL);
            
            while(res.next()){
                System.out.println("-----------------");
                System.out.println(res.getInt("categoria_id"));
                System.out.println(res.getString("nombre_categoria"));
            }
            
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
