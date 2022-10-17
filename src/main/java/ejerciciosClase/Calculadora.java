/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class Calculadora {
    public static void main(String[] args) {
        double resultado = 0;
        double operando1= Double.parseDouble(
                JOptionPane.showInputDialog("Introduce operador 1"));
        double operando2= Double.parseDouble(
                JOptionPane.showInputDialog("Introduce operador 2"));
        
        String menu= 
                """
                     ----------------------------------
                                Calculadora
                     ----------------------------------
                     1- SUMAR
                     2- RESTAR
                     3- MUTIPLICAR
                     4- DIVIDIR
                """;
        
        String opcion = JOptionPane.showInputDialog(menu);
        
        
        switch (opcion) {
            case "1":
                resultado = operando1 + operando2;
                break;
            case "2":
                resultado = operando1 - operando2;
                break;
            case "3":
                resultado = operando1 * operando2;
                break;
            case "4":
                resultado = operando1 / operando2;
                break;
                
            default:
                System.out.println("Error");;
        }
        
        
        
        System.out.println("""
                           El resultado es %.2f
                           """.formatted(resultado));
    }
}
