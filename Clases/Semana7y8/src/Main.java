/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USM-JMC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flota miFlota = new Flota();
        Vehiculo vA = new Vehiculo();
        Conductor cA = new Conductor("Juan","Juan");
        vA.setPatente("AABB11");
        vA.setMarca("Kia");
        vA.setModelo("Morning");
        vA.setVelocidadMax(120);
        vA.setMarchaMax(5);
        vA.setConductor(cA);
        
        Vehiculo vB = new Vehiculo();
        vB.setPatente("BBCC22");
        vB.setMarca("Mazda");
        vB.setModelo("3");
        
        Conductor cB = new Conductor("Pedro","Pedro");
        vB.setConductor(cB);
        
        miFlota.add(vA);
        miFlota.add(vB);
        
        for (Vehiculo v : miFlota.getAll()) {
            System.out.println(v);
        }
        
        for (Vehiculo v : miFlota.getAll()) {
            System.out.println(v.getConductor().getNombre());
        }
        
        
    }

}
