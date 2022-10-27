package ejerciciosClase;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
// Ejercicio 1: 
// crear programa donde se estable si un año es bisiesto (se puede dividir entre 4) (no divisible entre 100 o 400)
// Restricciones: solo se podrá salir del programa si se pone un 0
// Restricciones: si el número introducido es negativo se convierte en positivo
public class Ej3D_bisiestos {

    public static void main(String[] args) {
        //declaramos las variables 
        //anno= año que se desea analizar
        //bisiestoTexto = Texto que se mostrará si es bisisiesto o no
        int anno;
        String bisiestoTexto;
        // introducimos un año
        do {
            anno = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Por favor introduce un año
                                                              -----------------------------------------------------
                                                              Si desea salir del programa introduzca 0
                                                              """));
            // si el año introducido es negativo lo pasamos a positivo
            if (anno < 0) {  
                anno = -(anno);
            };
            // comprobamos si es bisiesto
            // almacenamos el texto correspondiente
            bisiestoTexto = 
                    ((anno%4==0) && (anno%100!=0) && (anno%400!=0)) 
                    ? "es bisiesto"  : "no es bisiesto" ;
            
            JOptionPane.showMessageDialog(null, """
                                                El año %s
                                                """.formatted(bisiestoTexto));
         // el bucle se para si se introduce un 0
        } while (anno != 0);

    }
}
