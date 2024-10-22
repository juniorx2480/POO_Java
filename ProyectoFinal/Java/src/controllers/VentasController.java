package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Producto;
import models.PrediccionPrecios;

public class VentasController {
    @FXML private TextField nombreProducto, precioProducto, cantidadProducto, ventasInput;
    @FXML private ListView<String> listaProductos;
    @FXML private Label resultadoPrediccion;

    private ObservableList<String> productos = FXCollections.observableArrayList();

    @FXML public void registrarProducto() {
        String nombre = nombreProducto.getText();
        double precio = Double.parseDouble(precioProducto.getText());
        int cantidad = Integer.parseInt(cantidadProducto.getText());
        productos.add(nombre + " - Precio: " + precio + " - Cantidad: " + cantidad);
    }

    @FXML public void predecirPrecio() {
        double ventas = Double.parseDouble(ventasInput.getText());
        double prediccion = PrediccionPrecios.predecir(ventas);
        resultadoPrediccion.setText("Predicción: " + prediccion);
    }
}

