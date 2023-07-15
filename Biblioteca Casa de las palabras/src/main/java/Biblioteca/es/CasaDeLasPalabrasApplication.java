package Biblioteca.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.io.FileWriter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class CasaDeLasPalabrasApplication {
    
    @Configuration
@EnableWebMvc
public class StaticResourceConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}

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
                   BiblioWeb.write("<<li><a href= \"#\"><img src=\"Opcion Catalogo.png\" alt=\"Catalogo\">Catalogo</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\"><img src=\"socios.png\" alt=\"Socios\">Socios</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\"><img src=\"tarjeta-de-miembro.png\" alt=\"Membresías\">Membresías</a></li>>");
                   BiblioWeb.write("<<li><a href= \"#\"><img src=\"personas.png\" alt=\"Equipo\">Equipo</a></li>>");
                   BiblioWeb.write("<h1>Bienvenido a Biblioteta Casa De Las Palabras</h1>");
                   BiblioWeb.write("<p><img src=\"trabajo-en-contruccion.png\" alt=\"Construccion\">Sitio Web En Construcción...</p>");
                   BiblioWeb.write("</body>");
                   BiblioWeb.write("</html>");
                   
                   BiblioWeb.close();
                   
                   System.out.println("Archivo html creado correctamente");
     
                } catch (IOException e){
                    System.out.println("Error al crear el archivo"+ e.getMessage());
                }
	}
}
