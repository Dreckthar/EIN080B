/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author alexi
 */
public class ConversionesDeTipos {
    public static void main(String[] args) {
        /*Conversiones implícitas (de var de poca capacidad a var de mayor capacidad)*/
        
        byte unByte = 10;
        int unInt = unByte;
        
        //La conversión se realiza automáticamente (implícita)
        
        /*Conversiones explícitas (de var de mayor capacidad a una de menor tamaño)*/
        //unByte = unInt;  /*Arroja error: incompatible types: possible lossy conversion from int to byte*/
        
        /*La solución es hacer una conversión explícita (Casting) */
        unByte = (byte) unInt;  /*Convierto el contenido de unInt a byte antes de asignarlo a unByte*/
        
        /*Parsing: Conversión desde string a número*/
        
        //int unNumero = "123"; /*Arroja error: incompatible types: String cannot be converted to int*/
        
        /*La solución es hacer una conversión string-número (Parsing) */
        int numero = Integer.parseInt("123");
        
        //Otros ejemplos:
        unByte = Byte.parseByte("23");
        float unFloat = Float.parseFloat("3.14");
    }
}
