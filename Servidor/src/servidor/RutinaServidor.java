
package servidor;
import java.io.*;
import java.util.Scanner;
import java.net.*;
import javax.swing.JOptionPane;

public class RutinaServidor {
    private static final String HOST= "localHost";
    private static final int PUERTO= 5000;
    private ServerSocket sc;
    private Socket cl;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private String mensajeRecibido="";
    
public void inicializarServidor(){
    Scanner lectura = new Scanner(System.in);
    try{
        sc=new ServerSocket(PUERTO);
        cl=new Socket();
        System.out.println("Estoy Esperando Conexion");
        cl=sc.accept();
        System.out.print("Se Conectó Un Cliente");
        entrada = new DataInputStream(cl.getInputStream());
        salida = new DataOutputStream(cl.getOutputStream());
        String mensaje = "";
        while (!mensaje.equals("Salir")){
            mensajeRecibido=entrada.readUTF();
            System.out.print("Mensaje Recibido:"+mensajeRecibido);
            System.out.print("Digite Su Respuesta");
            mensaje= lectura.nextLine();
            salida.writeUTF(mensaje);
            
        }
    }catch (IOException e01){
        JOptionPane.showMessageDialog(null,"Error En El Proceso De Conexión", "Error Al Conectar", JOptionPane.ERROR_MESSAGE);
    }
}
}


