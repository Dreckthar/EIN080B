
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinf
 */
public class Gimnasio {
    private ArrayList<Socio> socios;

    public Gimnasio() {
        this.socios = new ArrayList<>();  
    }
    
    public void add(Socio s){
        socios.add(s);
    }
    
    public ArrayList<Socio> getSocios(){
        return socios;
    }
    
}
