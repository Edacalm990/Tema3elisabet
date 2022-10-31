/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elisabet
 */
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);
     private static Random random= new Random();
    
    // pedir y comprobar si es entero
    public static int esEntero() {
        int numero;
        System.out.println("Dame un número Entero");
        do {
            try {
               numero = teclado.nextInt();
               break;
            } catch (Exception e) {
                System.out.println("El número es incorrecto, vuelve a introducirlo");
            }
        } while (true);

        return numero;
    }
    
    // si numero entero está en el rango
    public static boolean rangoEntero(int numero,int min, int max){
        boolean respuesta=false;
        if (numero>=min && numero <=max){
        respuesta=true;
        }
        
        return respuesta;
    }
    
    // si un numero es entero, y esta en un rango
    public static boolean esEnteroEstaEnRango(int min, int max) {
        int numero = esEntero();
        boolean respuesta=false;
        
        if(rangoEntero(numero, min, max)){
        respuesta=true;
        };
        return respuesta;
    
    }
    
    public static int generarNumRandomEntreRango(){
        int numero=0;
        int num1=esEntero();
        int num2=esEntero();
        numero=random.nextInt(num1, num2);
        
        return numero;
    }
            
    
    

}
