/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);
    private static Random random = new Random();

    // pedir y comprobar si es entero
    public static int pedirEntero(String texto, String opcion) {
        int numero = 0;
        String frase = texto.isBlank() ? "Introduce un número sin decimales" : texto;
        String fraseError = "Es incorrecto, debe ser un número entero, introduce un número";
        do {
            try {

                if (!opcion.equalsIgnoreCase("j")) {
                    mostrarMensaje(opcion, frase);
                    numero = teclado.nextInt();
                } else {
                    numero = Integer.parseInt(JOptionPane.showInputDialog(frase));
                };
                break;
            } catch (Exception e) {
                System.out.println(e);
                teclado.nextLine();
                mostrarMensaje(opcion, fraseError);
            }
        } while (true);

        return numero;
    }

    // pedir Entero y positivo
    public static int esEnteroPositivo(String texto, String opcion) {
        String frase = "";
        if (!texto.isBlank()) {
            frase = texto;
        }

         return Math.abs(pedirEntero(frase, opcion));
    }

    // pedir y comprobar si es double
    public static double pedirDouble(String texto, String opcion) {
        double numero = 0;
        String frase = texto.isBlank() ? "Introduce un número" : texto;
        String fraseError = "Dato incorrecto, introduce un número";
        do {
            try {
                if (!opcion.equalsIgnoreCase("j")) {
                    mostrarMensaje(opcion, frase);
                    numero = teclado.nextInt();
                } else {
                    numero = Double.parseDouble(JOptionPane.showInputDialog(frase));
                };

                break;
            } catch (Exception e) {
                teclado.nextLine();
                mostrarMensaje(opcion, fraseError);
            }
        } while (true);

        return numero;

    }

    // si numero entero está en el rango
    public static boolean rango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }

    // si el numero double está en el rango
    public static boolean rango(double numero, double min, double max) {
        return numero >= min && numero <= max;
    }

    // pedir un número entero, y esta en un rango
    public static int pedirEnteroEnRango(int min, int max, String texto, String opcion) {
        int numero;
        boolean respuesta;
        String mensajeError = """
                                   El número introducido no está en el rango permitido,
                                   el rango debe estar entre %.2f y %.2f
                                   """.formatted(min, max);
        do {
            numero = pedirEntero(texto, opcion);
            respuesta = rango(numero, min, max);

            if (!respuesta) {
                mostrarMensaje(opcion, mensajeError);
            }

        } while (!respuesta);

        return numero;

    }

    // pedir un número double, y esta en un rango
    public static double pedirDoubleEnRango(double min, double max, String texto, String opcion) {
        double numero;
        boolean respuesta;
        String mensajeError = """
                                   El número introducido no está en el rango permitido,
                                   el rango debe estar entre %.2f y %.2f
                                   """.formatted(min, max);
        do {
            numero = pedirDouble(texto, opcion);
            respuesta = rango(numero, min, max);

            if (!respuesta) {
                mostrarMensaje(opcion, mensajeError);
            }

        } while (!respuesta);

        return numero;

    }

    // generar número aleatorio entero entre rangos enteros
    public static int generarNumRandomEntreRango(int num1, int num2) {
        num2++;
        return random.nextInt(num1, num2);
    }

    // generar número aleatorio double entre rangos double
    public static double generarNumRandomEntreRango(double num1, double num2) {
        return random.nextDouble(num1, num2);
    }

    // como mostrar mensaje
    private static void mostrarMensaje(String opcion, String mensaje) {
        if (opcion.equalsIgnoreCase("j")) {
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            System.out.println(mensaje);
        }
    }
    
    

    

}
