/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3G;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class Ej03G {

    private static Random random = new Random();

    public static void main(String[] args) {

        String peticionJugar = "¿Quieres jugar?";
        String reglasJuego = """
                             Ahora te voy a pedir dos número.
                             El primero número -> es el que has elegido tu
                             El segundo número -> el total que crees que va a salir sumando tu número y el mio
                             Que gane el mejor !!!
                             """;
        final String NUMERO_JUGADOR = "¿Que número has elegido?";
        final String NUMERO_ADIVINA_JUGADOR="¿Que número crees que va a salir?";
        final String TEXTO_PENSAR="Ahora me toca a mi, dejame que piense...";
        final int  DEDOS_MIN=0;
        final int  DEDOS_MAX=10;
        
        int jugar = 0;
        int numJugador=0;
        int numAdivina =0;
        int numMaquina = 0;
        int numAdivinaMaquina = 0;

        do {
            jugar = mensajeConfirmacion(peticionJugar);
            if (jugar == 0) {

                // se muestra el mensaje de las reglas
                mostrarMensaje(reglasJuego);
                // se solicita el número que quiere el jugador humano
                numJugador = solicitarNumero(NUMERO_JUGADOR, 0, 10);
                // se obtiene el número que ha sacado la maquina
                numMaquina = numRandom(DEDOS_MIN, DEDOS_MAX);
                // se solicita el número que cree que va a salir
                numAdivina = solicitarNumero(NUMERO_ADIVINA_JUGADOR, 0, 20);
                // frase para dar ambiente
                mostrarMensaje(TEXTO_PENSAR);
                // se obtiene un número random que como mínimo tendrá el número que ha sacado la maquina
                numAdivinaMaquina = numRandom(numMaquina, (DEDOS_MAX*2));
                
                
                
                
                
            }

        } while (jugar != 0);

    }

    private static int numRandom(int inicio, int fin) {
        fin += 1;
        return random.nextInt(inicio, fin);
    }

    private static void mostrarMensaje(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    private static int mensajeConfirmacion(String text) {
        return JOptionPane.showConfirmDialog(null, text);
    }

    private static int solicitarNumero(String text, int min, int max) {
        int respuesta = -1;
        
        final String MENSAJE_ERROR_DATO = "El dato es incorrecto, debe ser un número entero";
        
        do {
            try {
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(text));
                if(!estaEnRango(respuesta, min, max)) {
                    String mensaje_error_rango = """
                                   Estamos jugando al juego morra, y aun que yo no tengo dedos,
                                   me gustaría simular que si, así que el mínimo es %d y el máximo %d
                                   así me sentiré más humano :D
                                   """.formatted(min, max);
                    mostrarMensaje(mensaje_error_rango);
                    
                }
            } catch (Exception e) {
                mostrarMensaje(MENSAJE_ERROR_DATO);
            }
            
        } while (estaEnRango(respuesta, min, max));
        return respuesta;
    }
    
    private static boolean estaEnRango (int num, int min, int max){
        return (num>=min && num<=max);
    }
    
    private static String  quienGana (String humano, int numJugador, int numMaquina, int numAdivina, int numAdivinaMaquina) {
        String ganador="";
        if (numAdivina == (numJugador+numMaquina)) {
            ganador = humano;
        } else if (numAdivinaMaquina == (numJugador+numMaquina)) {
            ganador = "Máquina";
        }
        return ganador;
    }

}
