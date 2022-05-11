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
        Gimnasio gym = new Gimnasio();
        Estudiante estudiante = new Estudiante("11111111-1","Pedro Parker",17,5);
        Entrenador entrenador = new Entrenador("Marcelo Baeza","Calistenia");
        
        Full fullSimple = new Full("22222222-2","Antonio Stark",45,false,null);
        Full fullPersonalizado = new Full("33333333-3","Bruno Diaz",50,true,entrenador);
        
        gym.add(estudiante);
        gym.add(fullSimple);
        gym.add(fullPersonalizado);
        
        System.out.println("LISTADO DE SOCIOS");
        System.out.println("=================");
        for (Socio socio : gym.getSocios()) {
            System.out.println(socio);
            System.out.println("=================");
        }
    }

}
