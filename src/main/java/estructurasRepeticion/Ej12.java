/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepeticion;

/**
 *
 * @author elisabet
 */
/*12.- Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) 
de cada una de las letras.*/
public class Ej12 {
    public static void main(String[] args) {
        final String ABC= "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < ABC.length(); i++) {
            char letra = ABC.charAt(i);
            System.out.println(letra);        
        }
    }
}
