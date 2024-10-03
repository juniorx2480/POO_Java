public class Motor {
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;

    // Constructor
    public Motor(int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Cilindrada: " + cilindrada + ", VelocidadMax: " + velocidadMax 
                           + ", CaballosFuerza: " + caballosFuerza + ", TipoCombustible: " + tipoCombustible);
    }

    // Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
