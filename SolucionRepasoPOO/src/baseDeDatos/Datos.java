/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;
import java.util.ArrayList;
import modelo.*;
/**
 *
 * @author LC
 */
public class Datos {
    private static ArrayList<Alumno> alAlumnos=new ArrayList<Alumno>();
    
    public static boolean agregar (Alumno alumno)
    {
        //esto agregar objetos con el mismo RUT...arreglar.
         boolean estado=false;
              
                if(alumno != null && buscar(alumno.getRut())==null)
                {    
                                     
                    alAlumnos.add(alumno);
                    estado=true;
                     
                }     
                
        return estado;         
    }
    
    public static Alumno buscar(String rut)
    {
          Alumno alumno=null;
    
          for(Alumno xx: alAlumnos)
          {
             if(xx.getRut().equals(rut) )
             {
                  alumno=xx;
                  break;
              }
             
          }
          return alumno;
    }
    
    public static boolean modificar(Alumno alumno)
    {
          boolean estado=false;
          int i=0;
                    
          for(Alumno xx: alAlumnos)
          {
             if(xx.getRut().equals(alumno.getRut()) )
             {
                  alAlumnos.set(i, alumno);
                  estado=true;
                  break;
              }
              i++; 
          }  
    
         return estado;
    }
    
    
    public static boolean eliminar(String rut)
    {
         boolean estado=false;
         
         for(Alumno xx: alAlumnos)
          {
             if(xx.getRut().equals(rut) )
             {
                  alAlumnos.remove(xx);
                  estado=true;
                  break;
              }
           }
        return estado;
    }
       
    public  static  ArrayList<Alumno>  listar()
    {
       return alAlumnos;
    
    }
    
    public static void llenar()
    {
            agregar(new Alumno("1-1", "Susana", 22, 'M',false));
            agregar(new Alumno("2-2","Andrea", 27,'F',false));
            agregar(new Alumno("3-3","Carlos",20,'M',false));
    }
}









