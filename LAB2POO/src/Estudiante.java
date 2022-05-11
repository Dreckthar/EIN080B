/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Estudiante extends Socio {

    private int cantidad_clases;

    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, int edad, int cantidad_clases) {
        super(rut, nombre, edad);
        this.cantidad_clases = cantidad_clases;
    }

    public int getCantidad_clases() {
        return cantidad_clases;
    }

    public void setCantidad_clases(int cantidad_clases) {
        if (cantidad_clases > 0) {
            this.cantidad_clases = cantidad_clases;
        }

    }

    @Override
    public int getMensualidad() {
        return super.getMensualidad() / 2 + 1000 * this.cantidad_clases;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPlan:\tEstudiante"
                + "\nCantidad Clases:" + this.cantidad_clases
                + "\nMensualidad:\t$" + this.getMensualidad();
    }
    
    

}
