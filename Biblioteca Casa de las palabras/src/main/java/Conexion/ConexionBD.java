package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionBD {
    
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String miBD = "jdbc:oracle:thin:@//localhost:1521/orcl";
            String user = "adminBibli";
            String password = "12345";
            
            Connection cn = DriverManager.getConnection(miBD, user, password);
            
            return cn;
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
