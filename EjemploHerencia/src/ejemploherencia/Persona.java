/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author CETECOM
 */
public class Persona {
    
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    public void imprimir(){
    
        System.out.println("Hola soy "+ this.nombre + " "+ this.apellido);
    
    }
     public void calcularDescuento(){
        
         System.out.println("No hay descuento para Personas");
    
    }
}
