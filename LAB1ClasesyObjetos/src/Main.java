/**
 * Prueba clase Vehiculo
 * @version 1.0, 18/04/22
 * @author Pamela Gatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo(150, 6);
        
        auto.setPatente("DDJJ88");
        auto.setMarca("Kia");
        auto.setModelo("Rio");
        
        System.out.println(auto.getInfo());
        
        auto.acelerar();
        
        System.out.println(auto.getInfo());
        
        auto.subirMarcha();
        auto.acelerar();
        
        System.out.println(auto.getInfo());
    
        Conductor c = new Conductor();
        c.setRut("12345678-9");
        c.setNombre("Bruno");
        c.setApellido("Diaz");
        c.setLicencia('B');
        
        System.out.println(c);
        
        auto.setConductor(c);
        
        System.out.println("Conductor: " + auto.getConductor().getNombre());
    
        System.out.println(auto);
    }
    
}
