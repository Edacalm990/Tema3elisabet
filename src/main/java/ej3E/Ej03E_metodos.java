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
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        final String MENU= """
                     ¿Qué deseas hacer?
                     1-> Realizar cálculos
                     salir -> Salir del programa
                     """;
        final String MATERIA_PRIMA="""
                                   Precio de la materia prima que se gasta 
                                   en fabricar una unidad
                                   """;
        // coste mano de obra dependien del tipo de producto
        final double COSTE_MANO_INICIO = 0.15;
        final double COSTE_MANO_FIN = 0.9;
        // porcentaje de produccion dependien del tipo de producto
        final double BENEFICIO_PRODUCCION_M1_M2_P1 = 0.5;
        final double BENEFICIO_PRODUCCION_T1_T2 = 0.65;
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
        int opcion=0;
        String producto = "";
        double costeManoObra = 0;
        
        do {
            // leer menu y filtrar
            opcion=menuInicial(MENU);
            
            
            // leer materia prima y filtrar
            precioMateriaPrima=numeroEntreRangos(PRECIO_INICIO, PRECIO_FINAL, MATERIA_PRIMA);
            
            
        } while (!(opcion==-1));
        
    }
    
    
    
    
    private static void mensaje(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
        
    private static int pedirNumero (String texto){
        String mensaje = texto.isBlank() ? "Introduce un número" : texto;
        final String FRASE_ERROR = "El número introducido no es correcto, debe ser un número entero";
        int numero=0;
        do {
            try {
            String numeroString=JOptionPane.showInputDialog(mensaje);
            numero = numeroString.equalsIgnoreCase("salir") 
                    ? -1
                    : Integer.parseInt(numeroString);
            return numero;
            } catch (Exception e) {
                teclado.nextLine();
                mensaje(FRASE_ERROR);
            };
        } while (true);
    };
    
        private static double pedirNumeroDouble (String texto) {
        String mensaje = texto.isBlank() ? "Introduce un número" : texto;
        final String FRASE_ERROR = "El número introducido no es correcto, debe ser un número entero";
        double numero=0;
        do {
            try {
            numero=Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            return numero;
            } catch (Exception e) {
                teclado.nextLine();
                mensaje(FRASE_ERROR);
            };
        } while (true);
    };
    
    private static boolean rangos(int num, int min, int max) {
    return (num>=min&&num<=max);
    }
    
    private static boolean rangos(double num, double min, double max) {
    return (num>=min&&num<=max);
    }
    
    private static int menuInicial(String text) {
        int opcion;
        do {
            opcion=pedirNumero(text);
            System.out.println(opcion);
        } while (!(opcion==-1 || opcion==1));
        
        return opcion;
    }
    
    private static double numeroEntreRangos(double min, double max, String texto){
        double num=0;
        boolean rango;
        do {
           num=pedirNumeroDouble(texto);
           rango = rangos(num, min,max);
        } while (!rango);
        return num;
    }
    
    
}
