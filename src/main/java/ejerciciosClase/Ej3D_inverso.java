/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
// creamos un programa, solicitamos una palabra y la invertimos
// Restricciones: Se solicitará la palabra en bucle hasta que se escriba salir 
public class Ej3D_inverso {

    public static void main(String[] args) {
        // se guarda el valor true si el usuario desea salir
        // como en el ejercicio no podemos mirar internet no se porque si comparo String salir = "salir" me da false
        // TODO preguntar a Vico
        boolean salir = false;
        
        do {
            // solicitamos la palabra
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce una palabra");
            String palabra = (teclado.nextLine());
            
            StringBuilder palabraInvertida2 = new StringBuilder(palabra);     
            palabraInvertida2=palabraInvertida2.reverse();
 
            
            // compara la variable palabra con "salir", si es true da como resultado 0
            if (palabra.compareToIgnoreCase("salir") == 0) {
                // introducimos true en la variable salir, aquí el programa parará
                salir = true;
            } else {
                // declaramos e inicializamos la variable palabraInvertida donde se almacenará la palabra invertida
                // no la hemos inicializado arriba porque acumula resultados a medida que vas poniendo palabras.
                String palabraInvertida="";
                // recorremos palabra a la inversa, comenzando por el final 
                for (int i = palabra.length(); i > 0; i--) {
                    // vamos creando la palabra con cada caracter (comenzando por el final)
                    palabraInvertida += palabra.charAt(i - 1);
                }
                
                
                // mostramos el resultado
                System.out.println("""
                               La palabra '%s' si la invertimos es '%s' 
                               """.formatted(palabra, palabraInvertida));
            };

        } while (!salir);
    }
}
