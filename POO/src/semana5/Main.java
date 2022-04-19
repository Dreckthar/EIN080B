/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author Pamela Gatica Caballero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Objeto creado usando constructor por defecto
        Persona persona1 = new Persona();
        
        persona1.setRut("12345678-9");
        persona1.setNombre("Pedro");
        persona1.setApellido("Parker");

        System.out.println(persona1.saludar());
        
        //Objeto creado usando constructor personalizado
        Persona persona2 =  new Persona("11223344-5","Antonio","Stark");
        
        System.out.println(persona2.saludar());
    }

}
