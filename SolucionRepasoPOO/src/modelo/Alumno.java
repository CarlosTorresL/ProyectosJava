/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LC
 */
public class Alumno {
   private String rut;
   private String nombre;
   private int edad;
   private char sexo;
   private boolean estadoCivil;

    public Alumno() {
    }

    public Alumno(String rut, String nombre, int edad, char sexo, boolean estadoCivil) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + '}';
    }

   
   
   
   
   
   
   
}
