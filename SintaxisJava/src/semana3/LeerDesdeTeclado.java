/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class LeerDesdeTeclado {
    public static void main(String[] args) {
        
        /*Para capturar los datos ingresados por el teclado se necesita crear un objeto de la clase Scanner*/
        
        Scanner scan = new Scanner(System.in);  //No olvidar agregar import java.util.Scanner
        
        System.out.print("Cúal es tu nombre? : ");
        String nombre = scan.nextLine();
        
        
        System.out.print("Cúal es tu apellido? : ");
        String apellido = scan.nextLine();
        
        System.out.println("Hola " + nombre + " " + apellido + " bienvenido a Java");
        
        System.out.print("\nCuántos años tienes?  ");
        int edad = scan.nextInt();
        System.out.println("Tienes " + edad + " años");
        
               
        //Solución para lectura de string luego de un número 
        scan.nextLine();
        
        
        System.out.print("En qué ciudad vives? : ");
        String ciudad = scan.nextLine();
        System.out.println("Vives en " + ciudad);
    }
}
