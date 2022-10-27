/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

/**
 *
 * @author elisabet
 */
// imprime 35 primeros terminos de la siguiente serie
// f0=0
// f1=1
// fn = fn-1 + fn-2
public class Ej_clase {

    public static void main(String[] args) {
        int primero = 0;
        int segundo = 1;

        for (int i = 0; i < 35; i++) {
            primero +=segundo;
            System.out.println(primero);
            segundo +=primero;
            System.out.println(segundo);
        }

    }
}
