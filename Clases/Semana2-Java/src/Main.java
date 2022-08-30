
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USM-JMC
 */
public class Main {
    public static void main(String args[]){
        
        Scanner read = new Scanner(System.in);
        
        String nombre = "Pamela";
        int n1, n2,suma;
        System.out.print("Numero 1: ");
        n1 = read.nextInt();
        
        System.out.print("Numero 2: ");
        n2 = read.nextInt();
        
        
        suma = n1+n2;
        short añoActual = 2022;
        short añoNacimiento = 1980;
        byte edad;
        
        edad = (byte) (añoActual - añoNacimiento);
        
        System.out.print("Hola Mundo\n");
        System.out.println("Lenguajes de Programación");
        System.out.println("Hola " + nombre);
        System.out.println(n1 + "+" + n2 + "=" + suma );
        
        boolean casada = false;
        String trato;
//        if (casada) {
//            trato = "Sra.";
//        }else{
//            trato = "Srta.";
//        }
//        
        trato = casada ? "Sra." : "Srta";
        System.out.println(trato);
        System.out.println(false?"Si":"No");
    }
}
