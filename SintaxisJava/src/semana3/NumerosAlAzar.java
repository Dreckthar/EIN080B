/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import java.util.Random;

/**
 *
 * @author alexi
 */
public class NumerosAlAzar {
    public static void main(String[] args) {
        
        Random rand = new Random();  //Similar a el funcionamiento de Scanner. No olvidar import java.util.Random
        
        System.out.println("Este es un número al azar: " + rand.nextInt());
        System.out.println("Este es un número al azar menor a 100: " + rand.nextInt(100)); //En general = rand.nextInt(cotaSuperior+1)
        System.out.println("Este es un numero al azar entre 10 y 20: " + (10 + rand.nextInt(10)));  //En general =  cotaInferior + rand.nextInt(cotaSuperior-cotaInferior+1)
        System.out.println("Este es un número decimal al azar: " + rand.nextFloat()); 
        System.out.println("Este es un boolean al azar: " + rand.nextBoolean());
    }
}
