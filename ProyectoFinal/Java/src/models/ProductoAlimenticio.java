package models;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaExpiracion;

    public ProductoAlimenticio(String nombre, double precioBase, int cantidadDisponible, LocalDate fechaExpiracion) {
        super(nombre, precioBase, cantidadDisponible);
        this.fechaExpiracion = fechaExpiracion;
    }

    // Getter y Setter para fechaExpiracion
    public LocalDate getFechaExpiracion() { return fechaExpiracion; }
    public void setFechaExpiracion(LocalDate fechaExpiracion) { 
        this.fechaExpiracion = fechaExpiracion; 
    }

    @Override
    public String toString() {
        return super.toString() + " - Fecha de Expiración: " + fechaExpiracion;
    }
}

