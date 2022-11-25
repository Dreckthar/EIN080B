/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author PGC
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Perro{"  + "nombre=" + super.nombre + '}';
    }

    @Override
    public String comunicar() {
        return "guau!";
    }
    
    public String comunicar(int n){
        String ladrido = "";
        for (int i = 0; i < n; i++) {
            ladrido += "guau ";
        }
        
        return ladrido;
    }
    
    
    
    
     
}
