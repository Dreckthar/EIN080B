/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Socio {

    private String rut;
    private String nombre;
    private int edad;
    private int mensualidad_base;

    public Socio() {
        this.mensualidad_base = 30000;
    }

    public Socio(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.mensualidad_base = 30000;
    }

    public int getMensualidad_base() {
        return mensualidad_base;
    }

    public void setMensualidad_base(int mensualidad_base) {
        this.mensualidad_base = mensualidad_base;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public int getMensualidad() {
        return mensualidad_base;
    }

    @Override
    public String toString() {
        return "Rut:\t" + rut
                + "\nNombre:\t" + nombre
                + "\nEdad:\t" + edad;
    }

}
