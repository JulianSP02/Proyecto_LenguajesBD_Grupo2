package Biblioteca.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.io.FileWriter;

@SpringBootApplication
public class CasaDeLasPalabrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasaDeLasPalabrasApplication.class, args);
                try{
                    FileWriter BiblioWeb = new FileWriter("index.html");
                    
                   BiblioWeb.write("<!DOCTYPE html>");
                   BiblioWeb.write("<html>");
                   BiblioWeb.write("<head>");
                   BiblioWeb.write("<title> Biblioteca Casa De Las Palabras</title>");
                   BiblioWeb.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Estilo.css\">");
                   BiblioWeb.write("</head>");
                   BiblioWeb.write("<body>");
                   BiblioWeb.write("<div class=\"menu\">");
                   BiblioWeb.write("<ul>");
                   BiblioWeb.write("<<li><a href= \"#\">Opcion 1</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\">Opcion 2</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\">Opcion 3</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\">Opcion 4</a></li>>");
                   BiblioWeb.write("<h1>Bienvenido a Biblioteta Casa De Las Palabras</h1>");
                   BiblioWeb.write("<p>Contenido por agregar </p>");
                   BiblioWeb.write("</body>");
                   BiblioWeb.write("</html>");
                   
                   BiblioWeb.close();
                   
                   System.out.println("Archivo html creado correctamente");
     
                } catch (IOException e){
                    System.out.println("Error al crear el archivo"+ e.getMessage());
                }
	}
}
