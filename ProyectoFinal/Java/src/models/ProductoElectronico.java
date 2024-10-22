package models;

public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precioBase, int cantidadDisponible, int garantiaMeses) {
        super(nombre, precioBase, cantidadDisponible);
        this.garantiaMeses = garantiaMeses;
    }

    // Getter y Setter para garantiaMeses
    public int getGarantiaMeses() { return garantiaMeses; }
    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }

    @Override
    public String toString() {
        return super.toString() + " - Garantía: " + garantiaMeses + " meses";
    }
}

