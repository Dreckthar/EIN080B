/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

import java.util.ArrayList;

/**
 *
 * @author USM
 */
public class Listas {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();
        
        palabras.add("Hola");  //Agregar al final de la lista
        palabras.add("Mundo");
        
        System.out.println(palabras);
        palabras.add("Java");
        
        System.out.println(palabras);
        
        int pos = 0;
        palabras.add(pos, "Programación");  //Agregar en la posición "pos" de la lista
        
        System.out.println(palabras);
        
        int largo = palabras.size(); //Cantidad de elementos de la lista
        
        System.out.println("La lista tiene " + largo + " palabras");
        
        for (String palabra : palabras) {
            System.out.println(palabra);  //Recorre la lista e imprime cada palabra por pantalla    
        }
        
        palabras.remove(0); //Elimina la primera palabra del listado
        
        System.out.println(palabras);
        
        palabras.remove(palabras.size()-1); //Elimina la ultima palabra del listado
        
        System.out.println(palabras);
        
        
        
    }
}
