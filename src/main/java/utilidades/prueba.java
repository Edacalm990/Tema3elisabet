/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author elisabet
 */
public class prueba {
    public static void main(String[] args) {
        int num1= 1;
        int num2 = 2;
        double num1D=1.0;
        double num2D=5.0;
        int numeroInt= Utilidades.pedirEntero("", "");
        double numeroDouble = Utilidades.pedirDouble("Pon un numero decimal", "j");
        int random = Utilidades.generarNumRandomEntreRango(num1, num2);
        double randomD=Utilidades.generarNumRandomEntreRango(num1D, num2D);

        
        
        
    }
}
