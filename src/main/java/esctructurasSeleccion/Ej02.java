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
/*2.- Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:
Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se devolverá “menor”.
Las cadenas que se devuelven se guardarán en una variable llamada resultado.
Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que cero”, si no se imprimirá
“Mayor que cero”.
Guardar el valor absoluto de un número entero en una variable entera (sin usar la función Math.abs())
*/
public class Ej02 {
    public static void main(String[] args) {
        String resultado;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Pon un número entero"));
        resultado = x>=135 ? "mayor" : "menor";
        JOptionPane.showMessageDialog(null, """
                                            El número %d es %s que 135
                                            """.formatted(x, resultado));
        
        if (x>=0) {
            JOptionPane.showMessageDialog(null, "mayor que cero");
        } else {
            JOptionPane.showMessageDialog(null, "menor que cero");
        }
        
        int valorAbsoluto = Integer.parseInt(JOptionPane.showInputDialog("Pon un número entero"));
        valorAbsoluto=valorAbsoluto<0 ? valorAbsoluto*-1 : valorAbsoluto;
        
        System.out.println(valorAbsoluto);

    }
}
