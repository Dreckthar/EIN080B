/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author alexi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona p = new Persona();
      Persona p1= new Persona();
      
      p.rut = "12345678-9";
      p.nombre = "Pedro";
      p.apellido = "Parker";
      
      p1.rut = "13151618-1";
      p1.nombre ="Antonio";
      p1.apellido = "Stark";
      
       // System.out.println("Hola " + p.nombre + " " + p.apellido);
       // System.out.println("Hola " + p1.nombre);
       
        System.out.println(p.saludar());
        System.out.println(p1.saludar());
    }
    
}
