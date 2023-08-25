
package Clases.principales;

public class Libro {
    private int id_libro;
    private String titulo;
    private String autor;
    private int categoria_id;
    
    public Libro(){}

    public Libro(int id_libro, String titulo, String autor, int categoria_id) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria_id = categoria_id;
    }

    /**
     * @return the id_libro
     */
    public int getId_libro() {
        return id_libro;
    }

    /**
     * @param id_libro the id_libro to set
     */
    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the categoria_id
     */
    public int getCategoria_id() {
        return categoria_id;
    }

    /**
     * @param categoria_id the categoria_id to set
     */
    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    
    
}
