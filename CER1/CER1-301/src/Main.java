/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio servicios = new Servicio();

        Alimento s1 = new Alimento();
        s1.setFecha("25/05/2022");
        s1.setTotalKg(1000);
        s1.setRefrigerado(true);

        Mudanza s2 = new Mudanza("24/05/2022", 500, true);
        Bulto b1 = new Bulto(1010, "Televisor");
        Bulto b2 = new Bulto(2000, "Refrigerador");
        Bulto b3 = new Bulto(3000, "Caja");
        s2.add(b1);
        s2.add(b2);
        s2.add(b3);

        servicios.add(s1);
        servicios.add(s2);
        
        for (Carga servicio : servicios.getServicios()) {
            System.out.println(servicio);
            System.out.println("");
        }
    }

}
