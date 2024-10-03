public class Vehiculo {
    private String placa;
    private String marca;
    private Motor motor;
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;

    // Constructor que recibe placa y marca
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(1400, 240, 4, "Diesel"); // Valores por defecto
    }

    // Constructor que recibe todos los parámetros
    public Vehiculo(String placa, String marca, int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(cilindrada, velocidadMax, caballosFuerza, tipoCombustible);
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Placa: " + placa + ", Marca: " + marca);
        motor.imprimir();
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return motor.getCilindrada();
    }

    public void setCilindrada(int cilindrada) {
        motor.setCilindrada(cilindrada);
    }

    public double getVelocidadMax() {
        return motor.getVelocidadMax();
    }

    public void setVelocidadMax(double velocidadMax) {
        motor.setVelocidadMax(velocidadMax);
    }

    public int getCaballosFuerza() {
        return motor.getCaballosFuerza();
    }

    public void setCaballosFuerza(int caballosFuerza) {
        motor.setCaballosFuerza(caballosFuerza);
    }

    public String getTipoCombustible() {
        return motor.getTipoCombustible();
    }

    public void setTipoCombustible(String tipoCombustible) {
        motor.setTipoCombustible(tipoCombustible);
    }
}
