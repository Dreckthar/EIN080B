/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Alimento extends Carga {

    private boolean refrigerado;

    public Alimento() {
    }

    public Alimento(String fecha, float totalKg, boolean refrigerado) {
        super(fecha, totalKg);
        this.refrigerado = refrigerado;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    @Override
    public int getCosto() {
        if (this.isRefrigerado()) {
            return (int)(super.getCosto() * 1.2f);
        } else {
            return super.getCosto();
        }
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nTipo: Alimento" +
                "\nRefrigerado: " + (refrigerado?"Si":"No")+
                "\nCosto Total: $" + this.getCosto();
    }
    
    

}
