/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Conductor {
    private String rut;
    private String nombre;
    private String apellido;
    private char licencia;

    public Conductor() {
    }

    public Conductor(String rut, String nombre, String apellido, char licencia) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.licencia = licencia;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getLicencia() {
        return licencia;
    }

    public void setLicencia(char licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", licencia=" + licencia + '}';
    }
    
    
    
}
