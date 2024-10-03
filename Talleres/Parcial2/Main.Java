public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 1600, 220, 6, "Gasolina");
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Honda", 1400, 210, 4, "Diesel");

        // Imprimir características de los vehículos
        vehiculo1.imprimir();
        vehiculo2.imprimir();

        // Comparar cilindradas de los motores
        ComparadorVehiculos.compararMotores(vehiculo1, vehiculo2);
    }
}

public class ComparadorVehiculos {
    public static void compararMotores(Vehiculo v1, Vehiculo v2) {
        if (v1.getCilindrada() == v2.getCilindrada()) {
            System.out.println("Los vehículos tienen la misma cilindrada.");
        } else if (v1.getCilindrada() > v2.getCilindrada()) {
            System.out.println("El vehículo con placa " + v1.getPlaca() + " tiene mayor cilindrada.");
        } else {
            System.out.println("El vehículo con placa " + v2.getPlaca() + " tiene mayor cilindrada.");
        }
    }
}
