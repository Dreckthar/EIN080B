/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author PGC
 */
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + super.nombre + '}';
    }

    @Override
    public String comunicar() {
       return "miau!";
    }
    
    
}
