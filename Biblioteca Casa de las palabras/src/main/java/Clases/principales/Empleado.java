/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.principales;

public class Empleado {

    private int id;
    private String nombre;
    private double salario;
    private String fechaContratacion;
    private String puesto;
    
    public Empleado(){}

    // Constructor
    public Empleado(int id, String nombre, double salario, String fechaContratacion, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.puesto = puesto;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
