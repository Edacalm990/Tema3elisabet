/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepeticion;

/**
 *
 * @author Usuario
 */
/*10.- Implementa un programa Java que permita visualizar todas las letras minúsculas, desde la 'a' hasta la 'z', usando un for.*/
public class Ej10 {
    public static void main(String[] args) {
        final String ABC= "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < ABC.length(); i++) {
            char letra = ABC.charAt(i);
            System.out.println(letra);        
        }
        
        for (char letra = 'a' ;  letra <= 'z'; letra++) {
            System.out.println(letra);
        }
        
        for (char letra = 97 ;  letra <= 122; letra++) {
            if (letra == 111){
                char especial = 241;
                System.out.println(especial);
            }
            System.out.println(letra);
            
        }
        
    }
}
