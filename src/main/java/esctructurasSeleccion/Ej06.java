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
public class Ej06 {
    public static void main(String[] args) {
        Object [] areas={"cuadrado", "triangulo", "circulo", "finalizar"};
        // JOpcion con desplegable
        Object opcion = JOptionPane.showInputDialog(null, 
                // mensaje que se incluye
                "Que tipo de poligono deseas saber el area?", 
                // titulo de la ventana
                "Elige una opción", 
                /*   - null, para icono predeterminado o el nombre de nuestra imagen para uso personalizado, 
                para colocar un imagen personalizada ver acá:
                             - nombre de nuestro vector inicializado.
                             - Opción que se quiere que este predeterminada en nuestra ventana, 
                el cero se puede cambiar por cualquier número mientras este en el rango del vector, 
                recordar que el primero es cero, luego viene el uno y así sucesivamente.*/
                JOptionPane.QUESTION_MESSAGE, 
                null, areas, areas[0]);
        final String TEXTO="Has seleccionado calcular el area de un ";
        if (opcion=="cuadrado") {
            JOptionPane.showMessageDialog(null, TEXTO + opcion);
        } else if (opcion=="triangulo") {
            JOptionPane.showMessageDialog(null, TEXTO + opcion);
        } else if (opcion=="circulo") {
            JOptionPane.showMessageDialog(null, TEXTO + opcion);
        } else {
            JOptionPane.showMessageDialog(null, "Ha seleccionado terminar");
        }
    }
    
}
