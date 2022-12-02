/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author PGC
 */
public class Color {
    private String nombre;
    public int r;
    public int g;
    public int b;

    public Color() {
    }

    public Color(String nombre, int r, int g, int b) {
        this.nombre = nombre;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
