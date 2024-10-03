package main.java;

import java.io.Console;

public class JuegoAhorcado {

    public void iniciarJuego() {
        Console console = System.console();

        if (console == null) {
            System.out.println("La consola no está disponible. Por favor, ejecute en una terminal.");
            return;
        }

        char[] palabraIngresada = console.readPassword("Profesor, ingrese una palabra: ");
        Palabra palabra = new Palabra(new String(palabraIngresada));
        Ahorcado ahorcado = new Ahorcado();

        System.out.println("\n\n\n\n\n\n\n\n\n");  // Limpiar la pantalla

        boolean juegoTerminado = false;

        while (!ahorcado.haPerdido() && !palabra.estaCompleta()) {
            palabra.mostrarPalabra();
            System.out.print("Estudiante, adivine una letra: ");
            char letra = console.readLine().toLowerCase().charAt(0);

            if (!palabra.intentarLetra(letra)) {
                ahorcado.incrementarFallos();
                ahorcado.mostrarAhorcado();
            }

            juegoTerminado = palabra.estaCompleta() || ahorcado.haPerdido();
        }

        if (palabra.estaCompleta()) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("La palabra era: " + palabra.getPalabraOriginal());
        }
    }

    public static void main(String[] args) {
        JuegoAhorcado juego = new JuegoAhorcado();
        juego.iniciarJuego();
    }
}
