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
public class EjemploWhile {
    public static void main(String[] args) {
        int numero = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entre 100 y 200");
        int num=teclado.nextInt();
        
        while( num<100 || num >200){
        System.out.println("Introduce un número entre 100 y 200");
        num = teclado.nextInt(); // Inicializacion de vaiable de control
        }
        
        // Condicion del bucle
        // Mientras la condición del bucle sea true se repite el código entre {}
        
        while(numero<10) {
            System.out.println(numero);
            numero ++;
        // SIEMPRE DENTOR DLE BUCLE, hay que actualizar la variable de control
        }
        
        // del 20 al 0
        // inicialización 
        numero = 20;
        // condicion
        while (numero>=0) {
            System.out.println(numero);
            numero -- ;
        };
        
        // Del 50 al 70 de 3 en 3
        numero=50;
        while (numero <= 70){
            System.out.println(numero);
            numero +=3;
        } ;
        
        
        
        
        
    }
}
