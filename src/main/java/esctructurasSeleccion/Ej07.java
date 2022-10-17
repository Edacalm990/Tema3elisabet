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
                double ladoCuadrado=Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Has seleccionado calcular el area de un cuadrado",
                        "Dame un lado"));
                double areaCuadrado= Math.pow(ladoCuadrado, 2);
                JOptionPane.showMessageDialog(null, """
                                                    El area del cudrado es %.2f
                                                    """.formatted(areaCuadrado));
                break;
                
            case "triangulo":
                double alturaTriangulo= Double.parseDouble(JOptionPane.showInputDialog(null, 
                        "Has seleccionado calcular el area de un triangulo", 
                        "Dame la altura"));
                double baseTriangulo= Double.parseDouble(JOptionPane.showInputDialog(null, 
                        "Has seleccionado calcular el area de un triangulo", 
                        "Dame la base"));
                
                double areaTringulo=(baseTriangulo*alturaTriangulo)/2;
                
                JOptionPane.showMessageDialog(null, """
                                                    El area del triangulo es %.2f
                                                    """.formatted(areaTringulo));
                break;
                        
            case "circulo":
                 double radioCirculo=Double.parseDouble(JOptionPane.showInputDialog(
                        null, 
                        "Has seleccionado el area de un circulo", 
                        "Dame el radio"));
                double areaCirculo= Math.PI*(Math.pow(radioCirculo, 2));
                JOptionPane.showMessageDialog(null, """
                                                    El area del circulo es %.2f
                                                    """.formatted(areaCirculo));
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
