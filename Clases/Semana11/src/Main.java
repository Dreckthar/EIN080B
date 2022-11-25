
import clases.Animal;
import clases.Gato;
import clases.Perro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PGC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("animalito");
        Gato gato = new Gato("cucho");
        Perro perro = new Perro("boby");
        //gato.setNombre("cucho");
        System.out.println(animal + " "+animal.comunicar());
        System.out.println(gato + " "+ gato.comunicar());
        System.out.println(perro + " " + perro.comunicar(5));
    }
    
}
