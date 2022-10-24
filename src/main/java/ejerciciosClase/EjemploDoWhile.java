/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Scanner;

/**
 *
 * @author elisabet
 */
public class EjemploDoWhile {
    
    // EL BUCLE DO WHILE SIEMPRE HACE ALMENOS UNA ITERACION
    public static void main(String[] args) {
        
        int num = 0;
        
        do{
            System.out.println(num);
            num ++;
        } while (num<=10);
        
        num=10;
        do {            
            System.out.println(num);
            num --;
        } while (num>=0);
        
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        do {
            System.out.println("Dame un numero entre 100 y 200");            
            valor=teclado.nextInt();
        } while (valor < 100 || valor > 200);
    }
    
}
