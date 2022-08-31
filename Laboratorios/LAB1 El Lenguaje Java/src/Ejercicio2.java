/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomás Peña
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad numerica a generar: ");
        int number = input.nextInt();
        int sumPair = 2;
        System.out.println("Pares:");
        for (int i = 0; i < number; i++) {
            System.out.println(sumPair);
            sumPair += 2;
        }
        int sumOdd = 1;
        System.out.println("Impares:");
        for (int i = 0; i < number; i++) {
            System.out.println(sumOdd);
            sumOdd += 2;
        }
        int primeNumber = 2;
        int numberForPrimeLoop = number;
        System.out.println("Primos:");
        for (int i = 0; i < numberForPrimeLoop; i++) {
            boolean print = true;
            for (int o = 2; o < primeNumber; o++) {
                if (primeNumber % o == 0) {
                    numberForPrimeLoop++;
                    print = false;
                    break;
                }
            }
            if (print == true) {
                System.out.println(primeNumber);
            }
            primeNumber++;

        }
    }
}
