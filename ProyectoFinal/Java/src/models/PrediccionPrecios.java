package models;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrediccionPrecios {
    public static double predecir(double valor) {
        try {
            Process process = new ProcessBuilder("./prediccion_cpp", String.valueOf(valor)).start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return Double.parseDouble(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}

