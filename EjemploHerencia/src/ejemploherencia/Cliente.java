/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author CETECOM
 */
public class Cliente extends Persona {
    
    private int montoCompra;

    public Cliente(int montoCompra, String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
        this.montoCompra = montoCompra;
    }

    public Cliente() {
    }

    public int getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(int montoCompra) {
        this.montoCompra = montoCompra;
    }

    @Override
    public String toString() {
        return "Cliente{" +super.getNombre() + "montoCompra=" + montoCompra + '}';
    }
    
    
    @Override
    public void imprimir(){
    
        System.out.println("Hola soy "+ super.getNombre() + " "+ super.getApellido() + " Gasto: $"+this.montoCompra);
    
    }
    
    public void calcularDescuento(double desc){
        
        System.out.println(this.montoCompra*desc);
    
    }
    
}
