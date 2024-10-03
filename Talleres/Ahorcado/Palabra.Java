package main.java;

public class Palabra {
    private String palabraOriginal;
    private char[] palabraAdivinada;

    public Palabra(String palabra) {
        this.palabraOriginal = palabra.toLowerCase();
        this.palabraAdivinada = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada[i] = '_';
        }
    }

    public boolean intentarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraOriginal.length(); i++) {
            if (palabraOriginal.charAt(i) == letra) {
                palabraAdivinada[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    public boolean estaCompleta() {
        for (char c : palabraAdivinada) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public void mostrarPalabra() {
        for (char c : palabraAdivinada) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public String getPalabraOriginal() {
        return palabraOriginal;
    }
}
