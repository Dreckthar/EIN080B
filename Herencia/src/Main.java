/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setColor("blanco");
        System.out.println("Animal: " + animal.comunicar());

        Gato gato = new Gato();
        gato.setColor("negro");
        System.out.println(gato);
        System.out.println("Gato: " + gato.comunicar());

        Perro perro = new Perro();
        perro.setNombre("Frank");
        perro.setColor("Beige");
        System.out.println(perro);
        System.out.println("Perro: " + perro.comunicar());
        System.out.println("Perro: " + perro.comunicar(3));
        
        Perro otroPerro = new Perro("Boby");
        otroPerro.setColor("negro");
        System.out.println(otroPerro);

    }

}
