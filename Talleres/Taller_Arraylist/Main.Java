import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("1. Agregar producto");
                System.out.println("2. Mostrar inventario completo");
                System.out.println("3. Buscar un producto");
                System.out.println("4. Modificar cantidad de un producto");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        try {
                            System.out.print("Nombre del producto: ");
                            String nombre = sc.nextLine();
                            System.out.print("Cantidad: ");
                            int cantidad = sc.nextInt();
                            System.out.print("Precio: ");
                            double precio = sc.nextDouble();

                            if (cantidad < 0) {
                                throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                            }

                            if (precio < 0) {
                                throw new IllegalArgumentException("El precio no puede ser negativo.");
                            }

                            Producto nuevoProducto = new Producto(nombre, cantidad, precio);
                            inventario.agregarProducto(nuevoProducto);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Entrada inválida. Por favor ingresa un número válido.");
                            sc.nextLine(); // Limpiar la entrada incorrecta
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        inventario.mostrarInventario();
                        break;

                    case 3:
                        try {
                            System.out.print("Nombre del producto a buscar: ");
                            String nombreBuscar = sc.nextLine();
                            Producto encontrado = inventario.buscarProducto(nombreBuscar);
                            if (encontrado != null) {
                                System.out.println(encontrado.toString());
                            } else {
                                throw new Exception("Producto no encontrado.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Nombre del producto a modificar: ");
                            String nombreModificar = sc.nextLine();
                            System.out.print("Nueva cantidad: ");
                            int nuevaCantidad = sc.nextInt();

                            if (nuevaCantidad < 0) {
                                throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                            }

                            inventario.modificarCantidad(nombreModificar, nuevaCantidad);
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Entrada inválida. Por favor ingresa un número válido.");
                            sc.nextLine(); // Limpiar la entrada incorrecta
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingresa un número.");
                sc.nextLine(); // Limpiar la entrada incorrecta
            }
        } while (opcion != 5);

        sc.close();
    }
}
