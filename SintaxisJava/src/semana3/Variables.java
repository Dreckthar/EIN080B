/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author alexi
 */
public class Variables {
    public static void main(String[] args) {
        //Declaración e inicialización de variables
        byte edad = 35;//Revisar tipos de datos, tamaños y rangos en PPT
        System.out.println("Hola! Tengo " + edad + " años");
        
        int edadEn2030 = (2030 - 2022) + edad;
        System.out.println("En el 2030 tendré " +  edadEn2030 + " años");
        
        float porcentajeEdad = edad*100/80;  //Se asume 80 años como la esperanza de vida promedio en Chile
        System.out.println("Ya he vivido el " + porcentajeEdad +"% de mi vida");
        
    }
}
