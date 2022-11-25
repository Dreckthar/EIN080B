/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomás Peña
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int number = input.nextInt();
        String numberLenght = number + "";
        int sum = 0;
        for (short i = 0; i < numberLenght.length(); i++) {
            sum = number % 10 + sum;
            number = number / 10;
        }
        System.out.println("La suma de los digitos del numero ingresado es:" + sum);
    }
}
