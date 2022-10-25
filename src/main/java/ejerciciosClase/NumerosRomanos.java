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
// la tercera será salir. El programa debe ejecutarse hasta que el usuario decida salir.

public class NumerosRomanos {
    public static void main(String[] args) {
        // declaramos la variable opcion que corresponde a la opcion que se le pide al usuario
        int opcion;
        do {
            // instanciamos opcion entre 3 posibles, el programa se despide y termina si se elige la 3 opcion
            // si se elige una opcion que no existe salta una frase que pone error y vuelve a pedirte que elijas opción
            // pero si es un string falla
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                 Elige una opción
                                                 ---------------------
                                                 1 - Representar un número Romano
                                                 2 - Contar el nº de vocales de una palabra
                                                 3- Terminar
                                                 """));                
                
            switch (opcion) {
                case 1 -> {
                    // si es el caso 1 solicitamos el número
                int numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Pon un número entero del 1 al 10"));
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
                        default -> "error";
                    };
                        JOptionPane.showMessageDialog(null,"""
                                El número %d se expresa en número romanos -> %s
                                                           """.formatted(numero, numeroRomano));
                }
                // si es el caso 2 solicitamos la palabra para contar vocales
                case 2 -> {
                    String palabra = JOptionPane.showInputDialog("""
                                                                 Dame una palabra""");
                    
                    // declaramos e instanciamso el contador a 0, que se encargará de contabilizar las vocales
                    int contador=0;
                    // recorremos la palabra caracter a caracter y realizamos una comparacion
                    // y la comparacion es coincidente se añade 1 al contador
                    // cuando hemos recorrido la palabra el programa muestra el resultado
                    for (int i = 0; i < palabra.length(); i++) {
                        char caracter = palabra.toLowerCase().charAt(i);
                        
                        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                            contador ++;
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, """
                                                        La palabra %s tiene %d vocales
                                                        """.formatted(palabra, contador));
                }
                // si es la opcion 3 nos despedimos
                case 3 -> JOptionPane.showMessageDialog(null, "Adios");
                
                default -> { 
                JOptionPane.showMessageDialog(null, """
                                                        Error debes elegir una opción valida
                                                        """);
                }
            }   
        } while (opcion!=3);
    }
}
