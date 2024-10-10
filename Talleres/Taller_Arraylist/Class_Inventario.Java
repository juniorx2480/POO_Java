class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public Producto buscarProducto(String nombre) throws Exception {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new Exception("Producto no encontrado: " + nombre);
    }

    public void modificarCantidad(String nombre, int nuevaCantidad) {
        try {
            Producto producto = buscarProducto(nombre);
            producto.setCantidad(nuevaCantidad);
            System.out.println("Cantidad actualizada para " + nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
