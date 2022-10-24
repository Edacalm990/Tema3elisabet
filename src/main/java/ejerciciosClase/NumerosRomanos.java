/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
//implementa un programa que muestre 3 opciones.
// La primera será la opción que representa un número romano a partir del número decimal (1-10)
// la segunda debe contar el nº de vocales que tiene un nombre.
// la tercera será salir. El usuario debe ejecutarse hasta que el usuario decida salir.

public class NumerosRomanos {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                 Elige una opción
                                                 ---------------------
                                                 1 - Representar un número Romano
                                                 2 - Contar el nº de vocales de una palabra
                                                 3- Terminar
                                                 """));
            switch (opcion) {
                case 1 -> {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Pon un número entero"));
                        String numeroRomano= switch (numero) {
                        case 1 -> "I";
                        case 2 -> "II";
                        case 3 -> "III";
                        case 4 -> "IV";
                        case 5 -> "V";
                        case 6 -> "VI";
                        case 7 -> "VII";
                        case 8 -> "VIII";
                        case 9 -> "IX";
                        case 10 -> "X";
                        default ->  throw new AssertionError("El número introducido es incorrecto");
                    };
                        JOptionPane.showMessageDialog(null,"""
                                El número %d se expresa en número romanos -> %s
                                                           """.formatted(numero, numeroRomano));
                }
                case 2 -> {
                    String palabra = JOptionPane.showInputDialog("""
                                                                 Dame una palabra
                                                                 """);
                    int contador=0;
                    for (int i = 0; i < palabra.length(); i++) {
                        char caracter = palabra.charAt(i);
                        
                        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                            contador ++;
                        }          
                    }
                    JOptionPane.showMessageDialog(null, """
                                                        La palabra %s tiene %d vocales
                                                        """.formatted(palabra, contador));
                }
            }   
        } while (opcion!=3);
    }
}
