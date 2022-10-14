/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esctructurasSeleccion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ha seleccionado calcular el área de un cuadrado dame un lado");
            double ladoCuadrado = teclado.nextDouble();
            double areaCuadrado = Math.pow(ladoCuadrado, 2);
            System.out.println("""
            El area del cuadrado es %.2f
            """.formatted(areaCuadrado));
        } else {
            if (opcion == 2) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ha seleccionado calcular el área de un triangulo dame la base");
                double baseTriangulo = teclado.nextDouble();
                System.out.println("Ha seleccionado calcular el área de un triangulo dame la altura");
                double alturaTriangulo = teclado.nextDouble();

                double areaTringulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("""
            El area del triangulo es %.2f
            """.formatted(areaTringulo));
            } else {
                if (opcion == 3) {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Ha seleccionado calcular el área de una circumferencia dame el radio");
                    double radioCirculo = teclado.nextDouble();
                    double areaCirculo = Math.PI * (Math.pow(radioCirculo, 2));
                    System.out.println("""
            El area del circulo es %.2f
            """.formatted(areaCirculo));
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }
    }
}
