/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03B;

import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class Ej03B_break_continue {
    public static void main(String[] args) {
        
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
        String opcion;
        String producto;
        double costeManoObra = 0;
        
        
        do {
            // solicitamos la opcion 
            //si no está entre las opciones se vuelve a solicitar, si la opcion es salir el programa se para
            opcion = JOptionPane.showInputDialog("""
                                                    ¿Qué deseas hacer?
                                                    1-> Realizar cálculos
                                                    salir -> Salir del programa
                                                    """);
             if (opcion.equalsIgnoreCase("1")) {
                 continue;
             } else {
                if (!opcion.equalsIgnoreCase("salir")) {
                       JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                   };
             }
             
             
             
             
        } while ((!opcion.equalsIgnoreCase("salir")));

    }
}
