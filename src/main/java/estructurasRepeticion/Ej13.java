/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepeticion;

/**
 *
 * @author elisabet
 */
/*13.- Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) 
de cada una de las letras.*/
public class Ej13 {
    public static void main(String[] args) {
        final String ABC= "abcdefghijklmnñopqrstuvwxyz";
        int i = 0;
        do {            
           char letra = ABC.toUpperCase().charAt(i);
           int letraInt = letra;
           System.out.println("""
                               La letra %s se corresponde con el char %d
                               """.formatted(letra, letraInt));
           i++;
        } while (i<ABC.length());
        
        for (char letra = 97; letra <= 122; letra ++) {
            int caracter2 = (int)letra;
            System.out.println("la letra "+ letra + " es el caracter " + caracter2);
        }

    }
}
