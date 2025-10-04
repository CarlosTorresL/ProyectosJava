/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author CETECOM
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p = new Persona("12345", "Juan", "Perez", 23);
        Cliente c = new Cliente(123, "19876", "Sofia", "Lopez", 45);

        p.imprimir();

        System.out.println("----------");
        System.out.println(c.getNombre());
        System.out.println("----------");
        c.imprimir();
        
        c.calcularDescuento(0.2);
        
        //Sobrecarga
        p.calcularDescuento();
        c.calcularDescuento(0.4);

    }

}
