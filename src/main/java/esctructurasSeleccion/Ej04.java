/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructurasSeleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ej04 {
    public static void main(String[] args) {

        int edad=Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad?"));
        
        String resultado= edad>=18 ? "mayor de edad" : "menor de edad";
        
        JOptionPane.showMessageDialog(null, """
                                            Eres %s
                                            """.formatted(resultado));
        
    }
}
