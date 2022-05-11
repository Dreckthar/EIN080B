/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Full extends Socio {

    boolean personalizado;
    Entrenador entrenador;

    public Full() {
    }

    public Full(String rut, String nombre, int edad, boolean personalizado, Entrenador entrenador) {
        super(rut, nombre, edad);
        this.personalizado = personalizado;
        this.entrenador = entrenador;
    }

    @Override
    public int getMensualidad() {
        if (this.personalizado) {
            return super.getMensualidad() + 30000;
        }
        return super.getMensualidad();

    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPlan:\tFull"
                + "\nPersonalizado:\t" + (this.personalizado ? "Si" : "No")
                + (this.personalizado ? entrenador : "")
                + "\nMensualidad:\t$" + this.getMensualidad();

    }

}
