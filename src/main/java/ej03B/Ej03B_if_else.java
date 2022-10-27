package ej03B;

import java.util.Arrays;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author elisabet
 */

public class Ej03B_if_else {

    public static void main(String[] args) {
        
        final String CODIGO_MANTECADOS[] = {"M1", "P1", "T1", "M2", "T2"}; // Codigos de los mantecados
        // coste mano de obra dependien del tipo de producto
        final double COSTE_MANO_M1_T1 = 0.15;
        final double COSTE_MANO_P1_T2_M2 = 0.22;
        // porcentaje de produccion dependien del tipo de producto
        final double BENEFICIO_PRODUCCION_M1_M2_P1=0.5;
        final double BENEFICIO_PRODUCCION_T1_T2=0.65;
        // beneficio que se desea obtener
        final double BENEFICIO_A_OBTENER=2500.0;
        // rango de preciosaEsteponeraMejorado
        final double PRECIO_INICIO=0.1;
        final double PRECIO_FINAL=1;
        // declaración e inicializamos las variables 
        double precioMateriaPrima=0;
        double precioVentaUnitario=0;
        double precioUnitarioProduccion=0;
        int unidadesObtener=0;
        double costeManoObra;

        // le pedidmo al usuario que introduzca un codigo
        String productoMin = JOptionPane.showInputDialog("""
                                                    M1 -> Mantecados de Limón
                                                    P1 -> Polvorones
                                                    T1 -> Turrón de chocolate
                                                    T2 -> Turrón clásico
                                                    M2 -> Mazapanes
                                                    """);
        String producto = productoMin.toUpperCase();
        // Comprobamos que el codigo introducido corresponde con un tipo de producto
        // sino es correcto se para el programa y te dice que no es correcto
        if (Arrays.asList(CODIGO_MANTECADOS).contains(producto)){
            precioMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog("""
                                                                                   Precio de la materia prima que se gasta 
                                                                                   en fabricar una unidad
                                                                                   """));
            // Comprobamos que se encuentra en el rango de precio especificado
            // sino es correcto se para el programa y te dice que no es correcto
            if (precioMateriaPrima <= PRECIO_FINAL && precioMateriaPrima >= PRECIO_INICIO) {

                precioVentaUnitario = switch (producto) {
                    case "M1" -> {
                        producto="Mantecados de Limón"; // nombre del producto para luego mostrarlo
                        // cuanto suesta producir una unidad sumando la mano de obra
                        precioUnitarioProduccion = precioMateriaPrima + COSTE_MANO_M1_T1;
                        // el precio de venta se calcula incluyendo el beneficio 
                        yield precioUnitarioProduccion + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_M1_M2_P1);
                    }
                    case "P1" -> {
                        producto="Polvorones";
                        precioUnitarioProduccion = precioMateriaPrima + COSTE_MANO_P1_T2_M2;
                        yield precioUnitarioProduccion + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_M1_M2_P1);
                    }
                    case "T1" -> {
                        producto="Turrón de chocolate";
                        precioUnitarioProduccion = precioMateriaPrima + COSTE_MANO_M1_T1;
                        yield precioUnitarioProduccion + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_T1_T2);
                    }
                    case "M2" -> {
                        producto="Mazapanes";
                        precioUnitarioProduccion = precioMateriaPrima + COSTE_MANO_P1_T2_M2;
                        yield precioUnitarioProduccion + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_M1_M2_P1);
                    }
                    case "T2" -> {
                        producto="Turrón clásico";
                        precioUnitarioProduccion = precioMateriaPrima + COSTE_MANO_P1_T2_M2;
                        yield precioUnitarioProduccion + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_T1_T2);
                    }
                    default ->
                        0;
                }; 
                // cuantas unidades se deben obtener para conseguir el beneficio requerido (2500€)
                unidadesObtener= (int)Math.ceil(BENEFICIO_A_OBTENER/(precioVentaUnitario-precioUnitarioProduccion));
                JOptionPane.showMessageDialog(null, """
                                                    El precio de la opcion %s: 
                                                    Tiene un coste de produccion de %.2f
                                                    Tiene un precio de venta de %.2f
                                                    ------------------------------------------------------
                                                    Para llegar a un beneficio neto de 2500 € 
                                                    hay que producir %d unidades
                                                    """.formatted(producto, precioUnitarioProduccion, precioVentaUnitario, unidadesObtener));
                
                } else {
            JOptionPane.showMessageDialog(null, 
                    "El precio de la materia prima no es correcto, debe estar comprendido entre 0.1-1");
        }
    }
        else {
            JOptionPane.showMessageDialog(null, 
                    "no existe el código introducido");
    }
        
}
}
