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
        gato.setVidas(7);
        gato.setColor("negro");
        System.out.println("Gato: " + gato.comunicar());
    }

}
