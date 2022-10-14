/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructurasSeleccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
/*7.- Reescribe el programa anterior usando la estructura Switch.*/
public class Ej07 {
    public static void main(String[] args) {
        String  [] areas={"cuadrado", "triangulo","circulo","finalizar"};
        String opcion = (String)JOptionPane.showInputDialog(
                null, 
                "Que tipo de poligono deseas saber el area", 
                "Elige un poligono", 
                JOptionPane.QUESTION_MESSAGE, null, areas, areas[0]);
        
        switch (opcion) {
            case "cuadrado":
                JOptionPane.showMessageDialog(null, """
                                                    Has seleccionado calcular el area de un cuadrado
                                                    """);
                break;
            case "triangulo":
                JOptionPane.showMessageDialog(null, """
                                                    Has seleccionado calcular el area de un triangulo
                                                    """);
                break;
            case "circulo":
                JOptionPane.showMessageDialog(null, """
                                                    Has seleccionado calcular el area de un circulo
                                                    """);
                break;
            case "finalizar":
                JOptionPane.showMessageDialog(null, """
                                                    Has seleccionado finalizar
                                                    """);
                break;
            default:
               JOptionPane.showMessageDialog(null, """
                                                    Ha habido un error, vuelve a intentarlo
                                                    """);;
        }
  
    }
}
