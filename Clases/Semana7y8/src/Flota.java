
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USM-JMC
 */
public class Flota {
    private ArrayList<Vehiculo> vehiculos;
    
    public Flota(){
        vehiculos = new ArrayList<>();
    }
    
    public void add(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public ArrayList<Vehiculo> getAll(){
        return vehiculos;
    }
}
