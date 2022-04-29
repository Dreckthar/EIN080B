/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Perro extends Animal {

    private String nombre;

    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String comunicar() {
        return "Guau";
    }
    
    public String comunicar(int n){
        String ladridos = "";
        for (int i = 0; i < n; i++) {
            ladridos += "Guau ";
        }
        return ladridos;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + " " + super.toString() + '}';
    }
    
}
