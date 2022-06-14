
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author labinf
 */
public class Mudanza extends Carga {

    private ArrayList<Bulto> bultos;
    private boolean ayudante;

    public Mudanza() {
        bultos = new ArrayList<>();
    }

    public Mudanza(String fecha, float totalKg, boolean ayudante) {
        super(fecha, totalKg);
        bultos = new ArrayList<>();
        this.ayudante = ayudante;
    }

    public boolean isAyudante() {
        return ayudante;
    }

    public void setAyudante(boolean ayudante) {
        this.ayudante = ayudante;
    }

    public void add(Bulto bulto) {
        //Validación de reglas de negocio

        bultos.add(bulto);
    }

    public int getCount() {
        return bultos.size();
    }

    @Override
    public int getCosto() {
        if (ayudante) {
            return super.getCosto() + 3000 * this.getCount();
        } else {
            return super.getCosto();
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo: Mudanza"
                + "\nBultos:" + this.getCount()
                + "\nRequiere Ayudante:" + (ayudante ? "Si" : "No")
                + "\nCosto Total: $" + this.getCosto();
    }

}
