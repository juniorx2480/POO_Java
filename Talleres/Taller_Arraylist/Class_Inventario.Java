import java.util.ArrayList;
import java.util.InputMismatchException;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        // Validar si el producto ya existe para evitar duplicados
        Producto existente = buscarProducto(p.getNombre());
        if (existente != null) {
            System.out.println("El producto ya existe en el inventario.");
        } else {
            productos.add(p);
            System.out.println("Producto agregado con éxito.");
        }
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p.toString());
            }
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void modificarCantidad(String nombre, int nuevaCantidad) {
        try {
            if (nuevaCantidad < 0) {
                throw new IllegalArgumentException("La cantidad no puede ser negativa.");
            }

            Producto p = buscarProducto(nombre);
            if (p != null) {
                p.setCantidad(nuevaCantidad);
                System.out.println("Cantidad modificada con éxito.");
            } else {
                throw new Exception("Producto no encontrado.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
