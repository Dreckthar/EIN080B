/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class NumeroSecreto {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int secreto = rand.nextInt(100);
        //System.out.println(secreto);
        int oportunidades = 3;
        int intentos = 0;
        int adivina = 0;

        while (intentos < oportunidades && secreto != adivina) {
            System.out.print("Adivina el número secreto: ");
            adivina = scan.nextInt();

            if (adivina == secreto) {
               
                System.out.println("Adivinaste!");
            } else {
                if (secreto > adivina) {
                    System.out.println("El numero secreto es mayor");
                }else{
                    System.out.println("El numero secreto es menor");
                }
                intentos++;
            }
        }
        
        if (adivina != secreto) {
            System.out.println("Se acabaron los intentos! :(");
        }
         System.out.println("***FIN DEL JUEGO***");

    }

}
