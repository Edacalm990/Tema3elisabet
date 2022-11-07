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
    public static int pedirEntero(String texto, String opcionJOption) {
        int numero = 0;
        String frase = texto.isBlank() ? "Introduce un número sin decimales" : texto;
        String fraseError = "Es incorrecto, debe ser un número entero, introduce un número";
        do {
            try {

                if (!opcionJOption.equalsIgnoreCase("j")) {
                    mostrarMensaje(opcionJOption, frase);
                    numero = teclado.nextInt();
                } else {
                    numero = Integer.parseInt(JOptionPane.showInputDialog(frase));
                };
                break;
            } catch (Exception e) {
                System.out.println(e);
                teclado.nextLine();
                mostrarMensaje(opcionJOption, fraseError);
            }
        } while (true);

        return numero;
    }

    // pedir Entero y positivo
    public static int esEnteroPositivo(String texto, String opcionJOption) {
        String frase = "";
        if (!texto.isBlank()) {
            frase = texto;
        }

         return Math.abs(pedirEntero(frase, opcionJOption));
    }

    // pedir y comprobar si es double
    public static double pedirDouble(String texto, String opcionJOption) {
        double numero = 0;
        String frase = texto.isBlank() ? "Introduce un número" : texto;
        String fraseError = "Dato incorrecto, introduce un número";
        do {
            try {
                if (!opcionJOption.equalsIgnoreCase("j")) {
                    mostrarMensaje(opcionJOption, frase);
                    numero = teclado.nextInt();
                } else {
                    numero = Double.parseDouble(JOptionPane.showInputDialog(frase));
                };

                break;
            } catch (Exception e) {
                teclado.nextLine();
                mostrarMensaje(opcionJOption, fraseError);
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
    public static int pedirEnteroEnRango(int min, int max, String texto, String opcionJOption) {
        int numero;
        boolean respuesta;
        String mensajeError = """
                                   El número introducido no está en el rango permitido,
                                   el rango debe estar entre %.2f y %.2f
                                   """.formatted(min, max);
        do {
            numero = pedirEntero(texto, opcionJOption);
            respuesta = rango(numero, min, max);

            if (!respuesta) {
                mostrarMensaje(opcionJOption, mensajeError);
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
    public static double generarNumRandomEntreRango(double num1, double num2Real) {
        double num2=sum1DecimalDouble(num2Real);
        System.out.println(num2Real + " " + num2);
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
    
    public static double sum1DecimalDouble (double num){     
        String numString =String.valueOf(num);
        int contador=0;
        String sumRandom="";
        double resto=0;
        double resultado;

        for (int i = (numString.length()-1); i != 0; i--) {
            char caracter = numString.charAt(i);
            
            if (caracter=='.'){
            break;
            }
            contador ++;
        }
        
        for (int i = 0; i <= contador; i++) {
            
            if(i==1){    
            sumRandom+=".";
            sumRandom +="0";
            } else if(i==contador){
            sumRandom+="1";
            } else {
            sumRandom +="0";
            }
        }
        
        resto = Double.parseDouble(sumRandom);
        resultado = resto+num;
        return resultado;
    
    }
    
    

    

}
