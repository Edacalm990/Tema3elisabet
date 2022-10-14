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
public class Ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la letra");
        String letraBuscar = teclado.nextLine();

        // si laletra está contenida en el nombre
        // mostrar el número de caracteres que tiene el nombre y la posición
        //donde está la letra 
        // En otro caso, mostrar si el número de letras es par o impar
        int numChar=nombre.length();
        
        // v1
        if (nombre.contains(letraBuscar)) {
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("""
                               El número de carcateres es: %d
                               La posición de la letra "%s" es: %d
                               """.formatted(numChar, letraBuscar, posicion));
        } else {
            String parImpar = (numChar %2==0) ? "par": "impar";
            System.out.println("""
                               El número es %s
                               """.formatted(parImpar));
        }
        
        //v2
        if (nombre.contains(letraBuscar)) {
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("""
                               El número de carcateres es: %d
                               La posición de la letra "%s" es: %d
                               """.formatted(numChar, letraBuscar, posicion));
        } else if (numChar %2==0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }

}
