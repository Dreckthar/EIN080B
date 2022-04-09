/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Arreglos {

    public static void main(String[] args) {
        int LARGO = 10;
        int numeros[] = new int[LARGO];

        System.out.println("EJERCICIO 1");
        System.out.println("NIVEL 1");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("\nNIVEL 2");
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }

        System.out.println("\nNIVEL 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa valores para cada celda del arreglo: ");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print("[" + i + "]= ");
//            numeros[i] = scan.nextInt();
//        }
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        
        System.out.println("\n\nEJERCICIO 2");
        System.out.println("NIVEL 1");
        
        String palabra ="programacion";
        
      /*  for (char letra : palabra) {   //Arroja error: foreach no puede usarse para recorrer strings (solo arreglos y otros iterables)
            
        }
    */
      
      //Soluciones:
      //Convertir la palabra a arreglo con el metodo toCharArray()
        for (char letra : palabra.toCharArray()) {
            System.out.print(letra + " ");
        }
        System.out.println("");
        //Recorrer la palabra con for en vez de foreach
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i)+ " ");
            
        }
        
        System.out.println("\nNIVEL 2");
        System.out.print("Ingresa una palabra: ");
        palabra = scan.nextLine();
        
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras");
        System.out.println("Comienza con la letra " + palabra.charAt(0));
        System.out.println("Termina con la letra " + palabra.charAt(palabra.length()-1));
        System.out.println("En mayúsculas: " + palabra.toUpperCase());
        System.out.println("En minúsculas: " + palabra.toLowerCase());
        System.out.println("Tipo título: " + palabra.toUpperCase().charAt(0)+ palabra.substring(1).toLowerCase());
    }
}
