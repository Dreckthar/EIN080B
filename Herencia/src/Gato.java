/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Gato extends Animal {

    private int vidas;

    public Gato() {
        this.vidas = 7;
    }
    
    
    
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String comunicar() {
        return "Miau!";
    }

    @Override
    public String toString() {
        return "Gato{" + "vidas=" + vidas + " " + super.toString() + '}';
    }

}
