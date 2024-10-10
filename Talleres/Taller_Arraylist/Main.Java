public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos al inventario
        inventario.agregarProducto(new Producto("Manzanas", 50, 1.2));
        inventario.agregarProducto(new Producto("Naranjas", 30, 0.8));

        // Mostrar inventario
        System.out.println("Inventario actual:");
        inventario.mostrarInventario();

        // Buscar un producto
        try {
            Producto producto = inventario.buscarProducto("Manzanas");
            System.out.println("Producto encontrado: " + producto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Modificar la cantidad de un producto
        inventario.modificarCantidad("Naranjas", 45);

        // Mostrar inventario después de la modificación
        System.out.println("Inventario actualizado:");
        inventario.mostrarInventario();
    }
}
