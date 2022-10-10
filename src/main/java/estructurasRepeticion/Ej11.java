/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepeticion;

/**
 *
 * @author Usuario
 */
/*11.- Implementa un programa Java que permita visualizar todas las letras mayúsculas, 
desde la 'A' hasta la 'Z', usando un do – while.*/
public class Ej11 {
    public static void main(String[] args) {
        final String ABC= "abcdefghijklmnñopqrstuvwxyz";
        int i = 0;
        do {            
           char letra = ABC.toUpperCase().charAt(i);
           System.out.println(letra);
           i++;
        } while (i<ABC.length());

    }
}
