/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
public class ParesNones {

    public static void main(String[] args) {
        // se declaran las variables y se instancia peticionJugar
        int peticionJugar = 1;
        int rondasTotales = 1;
        int ronda = 0;
        int nones;
        int numDedosHumano;
        int numDedosMaquina;

        String nombreJugador="";
        String ganadorRonda="";

        int partidadGanadasHumano;
        int partidadGanadasMaquina;

        final String RONDAS = "Cuantas rondas quieres jugar?";
        final String PETICION_DEDOS = "Cuantas dedos quieres sacar?";
        final int DEDOS_TOTALES = 5;
        final int MAX_RONDAS=10;

        // se arranca el programa hasta que se cancele o no se quiera jugar
        do {
            // se solicita si el jugador quiere jugar
            if (ronda==0) peticionJugar = peticionJugar();

            // si quiere jugar continua el programa
            if (peticionJugar == 0) {
                if(ronda==0) {
                // se pide las rondas que se desea jugar
                rondasTotales = pedirNumero(RONDAS, MAX_RONDAS);
                // se solicita el nombre del jugador
                nombreJugador = nombreJugador();
                };
                
                // se pregunta al jugador si quiere nones
                nones = nones();
                // se solicita el numero de dedos que saca el jugador
                numDedosHumano = pedirNumero(PETICION_DEDOS, DEDOS_TOTALES);
                // maquina saca un numero random
                numDedosMaquina = pedirNumeroRandom(DEDOS_TOTALES);
                // se estable quien gana 
                ganadorRonda = quienGana(nombreJugador, nones, numDedosHumano, numDedosMaquina);
                // se mira se ha llegado al máximo de rondas
                ronda++;

            }

        } while (peticionJugar == JOptionPane.YES_OPTION && ronda != rondasTotales);

    }

    private static int peticionJugar() {
        return JOptionPane.showConfirmDialog(null, "¿Quieres jugar?");
    }

    private static String nombreJugador() {
        return JOptionPane.showInputDialog("Como te llamas?");
    }

    private static int nones() {
        return JOptionPane.showConfirmDialog(null, "¿Quieres nones?");
    }

    private static int pedirNumero(String texto, int maximo) {
        int numero = -1;
        boolean condicion = false; 
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(texto));
                condicion = (numero >= 0 && numero <= maximo);
                if (!condicion) JOptionPane.showMessageDialog(null, """
                                                                    El numero debe estar entre 0 y %d
                                                                    """.formatted(maximo, maximo));
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Debes poner un número entero");
            }
        } while (!condicion);

        return numero;
    }

    private static int pedirNumeroRandom(int dedos) {
        int numRandom = 0;
        Random random = new Random();
        numRandom = random.nextInt(0, dedos + 1);
        return numRandom;
    }

    private static String quienGana(String nombreJugador, int nones, int numDedosHumano, int numDedosMaquina) {
        int dedosTotales = numDedosHumano + numDedosMaquina;
        String eleccion = (nones == 0) ? "nones" : "pares";
        boolean resultado = (nones == 0)
                ? dedosTotales % 2 != 0
                : dedosTotales % 2 == 0;

        String ganador = (resultado) ? nombreJugador : "Máquina";
        JOptionPane.showMessageDialog(null, """
                                            Has elegido = %s
                                            Tu has sacado = %d dedos
                                            Máquina ha sacado = %d dedos
                                            Total= %d dedos
                                            
                                            Ha ganado %s
                                            """.formatted(eleccion, numDedosHumano, numDedosMaquina, dedosTotales, ganador));
        return ganador;
    }

}
