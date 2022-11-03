/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3E;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
//1. Mostrar mení
//2. leer codigo
//3. filtrar codigo
//4. leer materia prima
//5. filtrar materia prima
//6. leer mano de obra
//7. filtrar mano de obra
//8. calcular coste de produccion
//9. calcular precio de venta unitario
//10. calcular unidades
public class Ej03E_metodos {


    public static void main(String[] args) {
        final String MENU = """
                     ¿Qué deseas hacer?
                     calcular -> Realizar cálculos
                     salir -> Salir del programa
                     """;
        final String MENU_PRODUCTO ="""
                                                    M1 -> Mantecados de Limón
                                                    P1 -> Polvorones
                                                    T1 -> Turrón de chocolate
                                                    T2 -> Turrón clásico
                                                    M2 -> Mazapanes
                                                    SALIR -> Salir del programa
                                                    """;
        final String MATERIA_PRIMA = """
                                   Precio de la materia prima que se gasta 
                                   en fabricar una unidad
                                   """;
        final String MANO_OBRA = """
                                 Introduce el coste de la mano de obra
                                 """;
        
        final String MENSAJE_FINAL = """
                        El precio de la opcion %s: 
                        Tiene un coste de produccion de %.2f
                        Tiene un precio de venta de %.2f
                        ------------------------------------------------------
                        Para llegar a un beneficio neto de 2500 € 
                        hay que producir %d unidades
                        """;

        // coste mano de obra dependien del tipo de producto
        final double COSTE_MANO_INICIO = 0.15;
        final double COSTE_MANO_FIN = 0.9;
        // porcentaje de produccion dependien del tipo de producto
        final double BENEFICIO_1 = 0.5;
        final double BENEFICIO_2 = 0.65;
        // beneficio que se desea obtener
        final double BENEFICIO_A_OBTENER = 2500.0;
        // rango de preciosaEsteponeraMejorado
        final double PRECIO_INICIO = 0.1;
        final double PRECIO_FINAL = 1;
        // declaración e inicializamos las variables 
        double precioMateriaPrima = 0;
        double precioVentaUnitario = 0;
        double precioUnitarioProduccion = 0;
        int unidadesObtener = 0;
        int opcion = 0;
        int producto = -1;
        double costeManoObra = 0;

        do {
            // leer menu y filtrar
            opcion = opcionValida(MENU, "MENU");
            
            if (opcion!=-1){
            // leer menu producto y filtrar
            producto = opcionValida(MENU_PRODUCTO, "");
            
            if (producto!=-1){
            // pedir materia prima y filtrar
            precioMateriaPrima = numeroEntreRangos(PRECIO_INICIO, PRECIO_FINAL, MATERIA_PRIMA);
            // pedir mano de obra y filtrar
            costeManoObra = numeroEntreRangos(COSTE_MANO_INICIO, COSTE_MANO_FIN, MANO_OBRA);
            // calcular precio unitario
            precioUnitarioProduccion = precioUnitarioProduccion(precioMateriaPrima, costeManoObra);
            // calcular precio de venta unitario
            precioVentaUnitario = precioVentaUnitario(producto, precioUnitarioProduccion, BENEFICIO_1, BENEFICIO_2);
            // calcular cuantas unidades se deben obtener para conseguir el beneficio requerido (2500€)
            unidadesObtener = unidadesObtener(precioVentaUnitario, precioUnitarioProduccion, BENEFICIO_A_OBTENER);
            
            JOptionPane.showMessageDialog(null, """
                        Tiene un coste de produccion de %.2f
                        Tiene un precio de venta de %.2f
                        ------------------------------------------------------
                        Para llegar a un beneficio neto de 2500 € 
                        hay que producir %d unidades
                        """.formatted(precioUnitarioProduccion, precioVentaUnitario, unidadesObtener)); 
            }}
            
        } while (opcion!=-1 && producto!=-1 || producto!=-1);

    }

    private static void mensaje(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    private static int pedirNumero(String texto) {
        String mensaje = texto.isBlank() ? "Introduce un número" : texto;
        final String FRASE_ERROR = "El número introducido no es correcto, debe ser un número entero";
        do {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (Exception e) {
                mensaje(FRASE_ERROR);
            }
        } while (true);
    }

    private static String pedirPalabra(String texto) {
        String mensaje = texto.isBlank() ? "Introduce una palabra" : texto;
        return JOptionPane.showInputDialog(mensaje);
    }
         
    private static double pedirNumeroDouble(String texto) {
        String mensaje = texto.isBlank() ? "Introduce un número" : texto;
        final String FRASE_ERROR = "El número introducido no es correcto";
        do {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            } catch (Exception e) {
                mensaje(FRASE_ERROR);
            };
        } while (true);
    }

    
    private static boolean rango(int num, int min, int max) {
        return (num >= min && num <= max);
    }

    private static boolean rango(double num, double min, double max) {
        return (num >= min && num <= max);
    }

    private static int opcionValida(String text, String tipo) {
        final String FRASE_ERROR = "La opción no está disponible, porfavor elije otra";
        int resultado;
        String classificar;
        do {
                
                String opcion = pedirPalabra(text);
                if (opcion.equalsIgnoreCase("salir")) {
                    return -1;
                } else {
                    try {
                        classificar =  (tipo.equalsIgnoreCase("MENU")) 
                                ? clasificarMenu(opcion) 
                                : clasificarMenuProducto(opcion);
                        resultado = Integer.parseInt(classificar);
                        return resultado;
                    } catch (Exception e) {
                        mensaje(FRASE_ERROR);
                    }                  
                }
        } while (true);
    }

    private static double numeroEntreRangos(double min, double max, String texto) {
        final String FRASE_ERROR = """
                                  El numero no es correcto, debe estar entre %.2f y %.2f
                                   """.formatted(min,max);
        double num = 0;
        boolean rango;

        do {
            num = pedirNumeroDouble(texto);
            rango = rango(num, min, max);
            if (!rango) {
            mensaje(FRASE_ERROR);
            };
            
        } while (!rango);

        return num;
    }
    
    private static String clasificarMenu (String opcion){
        return switch (opcion.toUpperCase()) {
            case  "CALCULAR"-> "1";             
            default -> "noValido";
        };
    }

    private static String clasificarMenuProducto (String opcion){
        return switch (opcion.toUpperCase()) {
            case  "M1", "M2", "P1"-> "1";
            case "T1", "T2" -> "2";               
            default -> "noValido";
        };
    }
    
    
    
    private static double precioUnitarioProduccion (double precioMateriaPrima, double costeManoObra) {
        return precioMateriaPrima+costeManoObra;
    }
    
    private static double precioVentaUnitario(int producto, double precioUnitarioProduccion, double beneficio1, double beneficio2) {
        return switch (producto) {
            case 1 -> (precioUnitarioProduccion + (precioUnitarioProduccion * beneficio1));
            case 2 ->  (precioUnitarioProduccion + (precioUnitarioProduccion * beneficio2));
            default -> 0;
        };
    }
    
    private static int unidadesObtener (double precioVentaUnitario, double precioUnitarioProduccion, double beneficio) {
        return (int) Math.ceil(beneficio / (precioVentaUnitario - precioUnitarioProduccion));
    }
    
   
    

}
