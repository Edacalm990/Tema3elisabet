/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class EjemplosSwitchRandom {
    public static void main(String[] args) {
        
        // si el usuario introduce A, B o C se debe guardar 
        // un aleatorio en 1 y 10
        // si introduce D, guardar aleatorio entre 11 y 25
        // si introduce E, aleatorio entre 26 y 33
        // en otro caso, aeatorio entre 34 y 100
        
        // Creo un objeto de tipo Random llamado generador
        // con el contructor de la clase Random
        Random generador = new Random();
        
        int numAleatorio;
        
        // Genero numero aleatorio dentro del rango de los enteros
        numAleatorio=generador.nextInt();
        System.out.println(numAleatorio);
        
        // Genera un número aleatorio entre 0 y 9
        numAleatorio=generador.nextInt(10);
        System.out.println(numAleatorio);
        
        // Genera un número aleatorio entre 1 y 20
        numAleatorio=generador.nextInt(19)+1;
        System.out.println(numAleatorio);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra A,B,C,D,E");
        String letra=teclado.nextLine();
        
        switch (letra) {
            case "A", "B", "C" -> {
                // un aleatorio en 1 y 10
                // generador.nextInt((numMaximo - numMinimo) +1) + 1
                numAleatorio = generador.nextInt(10)+1;
                System.out.println("""
                                   El número generado es %d
                                   """.formatted(numAleatorio));
            }
            case "D" -> {
                // si introduce D, guardar aleatorio entre 11 y 25
                numAleatorio = generador.nextInt(14+1)+11;
                System.out.println(numAleatorio);
            }
            case "E" -> {
                // si introduce E, aleatorio entre 26 y 33
                numAleatorio = generador.nextInt(7+1)+26;
                System.out.println(numAleatorio);
            }
            default -> {
                // en otro caso, aleatorio entre 34 y 100
                numAleatorio = generador.nextInt(66+1)+34;
                System.out.println(numAleatorio);
            }
            
            /*
            switch (letra) {
            case "A", "B", "C":
                numAleatorio = generador.nextInt(10)+1;
                System.out.println(numAleatorio);
                break;
            
            case "D":
                numAleatorio = generador.nextInt(14+1)+11;
                System.out.println(numAleatorio);
                break;
            
            case "E":
                numAleatorio = generador.nextInt(7+1)+26;
                System.out.println(numAleatorio);
                break;
            
            default:
                numAleatorio = generador.nextInt(66+1)+34;
                System.out.println(numAleatorio);

*/
            /*
            numAleatorio = switch(letra){
                case "A", "B", "C":
                yard = generador.nextInt(10)+1;
                System.out.println(numAleatorio);
                break;
            
            case "D":
                yard = generador.nextInt(14+1)+11;
                System.out.println(numAleatorio);
                break;
            
            case "E":
                yard = generador.nextInt(7+1)+26;
                System.out.println(numAleatorio);
                break;
            
            default:
                yard = generador.nextInt(66+1)+34;
                System.out.println(numAleatorio);
            
            }
            System.out.println(numAleatorio);
            */
    }

        
        
    }
}
