
package cliente;

import java.io.*;
import java.util.Scanner;
import java.net.*;
import javax.swing.JOptionPane;

public class RutinaCliente {
    private static final String HOST="localHost";
    private static final int PUERTO=5000;
    private Socket sc;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private String mensajeRecibido="";
    
    public void inicializarCliente(){
        try{
            Scanner lectura = new Scanner(System.in);
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String mensaje="";
            while(!mensaje.equals("SALIR")){
                System.out.print("Digite su mensaje para enviar:");
                mensaje= lectura.nextLine();
                salida.writeUTF(mensaje);
                System.out.print(mensajeRecibido);
            }
        }catch(IOException e02){
            JOptionPane.showMessageDialog(null,"Error En El Proceso De Conexión", "Error Al Conectar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
