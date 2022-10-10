/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasRepeticion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/*5.- Implementa el programa del ejercicio 2 usando un do – while.*/
public class Ej05 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        
        do {
                        
          System.out.print(x);
          System.out.print(" -- ");
          x = x + 1; 
              
        } while (x<=n);
        
}

}
