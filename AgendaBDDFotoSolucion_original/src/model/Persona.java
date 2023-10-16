/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
//import view.*;
/**
 *
 * @author Administrador
 */
public class Persona {

    private String rut;
    private String nombre;
    private String fono;
    private String foto;

   public Persona(){
   }

   public Persona(String rut, String nombre, String fono)  {
        setRut(rut);
        setNombre(nombre);
        setFono(fono);
    }

    public Persona(String rut, String nombre, String fono, String foto) {
        setRut(rut);
        setNombre(nombre);
        setFono(fono);
        setFoto(foto);
    }
    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        
           this.rut = rut;
        
    }

    public String getFono() {
        return fono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String toString(){
        return getRut()+" "+getNombre()+" "+getFono();
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

}
