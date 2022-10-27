/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3E;

import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class Ej3E {

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

                do {
                    // solicitamos el producto
                    // si no está entre las opciones se vuelve a solicitar, si la opcion es salir el programa se para
                    String productoMin = JOptionPane.showInputDialog("""
                                                    M1 -> Mantecados de Limón
                                                    P1 -> Polvorones
                                                    T1 -> Turrón de chocolate
                                                    T2 -> Turrón clásico
                                                    M2 -> Mazapanes
                                                    SALIR -> Salir del programa
                                                    """);
                    producto = productoMin.toUpperCase();
                    // si el producto = "salir" el programa sale sin hacer nada mas cambiado la variable opcion
                    if (producto.equalsIgnoreCase("salir")) {
                        opcion = "salir";
                    } else {
                        // si la opcion está entre las permitidas se solicita el precio de la materia prima
                        switch (producto) {
                            case "M1", "P1", "T1", "T2", "M2":
                                do {
                                    // si el precio de la materia prima no está en el rango el prorama te lo vuelve a solicitar
                                    precioMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog("""
                                                                                   Precio de la materia prima que se gasta 
                                                                                   en fabricar una unidad
                                                                                   """));

                                    if (precioMateriaPrima <= PRECIO_FINAL && precioMateriaPrima >= PRECIO_INICIO) {
                                        do {
                                            costeManoObra = Double.parseDouble(JOptionPane.showInputDialog("""
                                                                                   Precio de la mano de obra
                                                                                   """));
                                            if (costeManoObra >= COSTE_MANO_INICIO && costeManoObra <= COSTE_MANO_FIN) {
                                                precioUnitarioProduccion = precioMateriaPrima + costeManoObra;
                                            precioVentaUnitario = switch (producto) {
                                                case "M1", "M2", "P1" ->
                                                    precioUnitarioProduccion
                                                    + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_M1_M2_P1);
                                                case "T1", "T2" ->
                                                    precioUnitarioProduccion
                                                    + (precioUnitarioProduccion * BENEFICIO_PRODUCCION_T1_T2);
                                                default ->
                                                    0;
                                            };
                                            // cuantas unidades se deben obtener para conseguir el beneficio requerido (2500€)
                                            unidadesObtener = (int) Math.ceil(BENEFICIO_A_OBTENER / (precioVentaUnitario - precioUnitarioProduccion));
                                            JOptionPane.showMessageDialog(null, """
                                                    El precio de la opcion %s: 
                                                    Tiene un coste de produccion de %.2f
                                                    Tiene un precio de venta de %.2f
                                                    ------------------------------------------------------
                                                    Para llegar a un beneficio neto de 2500 € 
                                                    hay que producir %d unidades
                                                    """.formatted(producto, precioUnitarioProduccion, precioVentaUnitario, unidadesObtener));

                                            } else {
                                                {
                                                    JOptionPane.showMessageDialog(null,
                                                            """
                                            El precio de la mano de obra debe estar comprendido entre %.2f y %.2f
                                            """.formatted(COSTE_MANO_INICIO, COSTE_MANO_FIN)
                                                    );
                                                }
                                            }

                                        } while (!(costeManoObra >= COSTE_MANO_INICIO && costeManoObra <= COSTE_MANO_FIN));

                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                """
                                            El precio de la materia prima debe estar comprendido entre %.2f y %.2f
                                            """.formatted(PRECIO_INICIO, PRECIO_FINAL)
                                        );
                                    }

                                } while (!(precioMateriaPrima <= PRECIO_FINAL && precioMateriaPrima >= PRECIO_INICIO));
                        };
                    }

                } while (!producto.equalsIgnoreCase("M1")
                        && (!producto.equalsIgnoreCase("P1"))
                        && (!producto.equalsIgnoreCase("T1"))
                        && (!producto.equalsIgnoreCase("T2"))
                        && (!producto.equalsIgnoreCase("M2"))
                        && !producto.equalsIgnoreCase("salir"));

            } else {
                if (!opcion.equalsIgnoreCase("salir")) {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                };
            };

        } while ((!opcion.equalsIgnoreCase("salir")));
    }
}
