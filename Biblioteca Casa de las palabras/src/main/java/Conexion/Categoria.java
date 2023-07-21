
package Conexion;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Categoria {
        @Id
    private int categoria_id;
    private String nombre_categoria;

    // Getters y setters

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
}

