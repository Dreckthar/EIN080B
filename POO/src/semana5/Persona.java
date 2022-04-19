/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author Pamela Gatica Caballero
 */
public class Persona {
    
    //Atributos
    private String rut;
    private String nombre;
    private String apellido;
    
    //Constructor por defecto
    public Persona() {
        this.nombre = "N";
        this.apellido = "N";
        this.rut = "1-0";
    }

    //Constructor personalizado
    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Accesadores y Mutadores
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Métodos
    public String saludar() {
        return "Hola mi nombre es " + nombre + " " + apellido;
    }
}
