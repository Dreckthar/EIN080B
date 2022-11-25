/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomás Peña
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor a 2: ");
        int result, past_result;
        result = 0;
        past_result = 1;
        int number = input.nextInt();
        int i = 0;
        System.out.println("Los primeros "+ number + " numeros de la serie Fibonacci:");
        System.out.println(result);
        while (i < number - 1) {
            result = result + past_result;
            past_result = result - past_result;
            System.out.println(result);
            i++;
        }
    }
}
