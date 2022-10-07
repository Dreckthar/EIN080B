/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USM-JMC
 */
public class Persona {

    //ATRIBUTOS THIS
    private String nombre;
    private String apellido;
    private String rut;

    //CONSTRUCTORES
    public Persona() {
        nombre = "N.";
        apellido = "N";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre; 
        this.apellido = apellido;
    }

    //METODOS ACCESADORES Y MUTADORES (Getters y Setters)
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    //METODOS
    public void saludar(){
        System.out.println("Hola, soy " + this.nombre);
    }
}
