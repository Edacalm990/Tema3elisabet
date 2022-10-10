/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package estructurasRepeticion;

/**
 *
 * @author Usuario
 */
/*3.- Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. 
No se introducen valores por teclado.*/
public class Ej03 {

    public static void main(String[] args) {
        int num = 15;
        for (int i = 0; i <26; i++) {
            System.out.println("""
                               %d - %d
                               """.formatted(i,num));
            num=num*2;
        }
    }
}
