public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Perro perro1 = new Perro("Rex", 5, "Labrador");
        Gato gato1 = new Gato("Miau", 3);

        zoologico.agregarAnimal(perro1);
        zoologico.agregarAnimal(gato1);

        Perro perro2 = new Perro("Jon", 8, "Doberman");
        Gato gato2 = new Gato("Felix", 5);

        zoologico.agregarAnimal(perro2);
        zoologico.agregarAnimal(gato2);

        zoologico.mostrarSonido();
        zoologico.mostrarConteoAnimales();

        // Guardar y cargar la lista de animales
        zoologico.guardarAnimales("animales.bin");
        zoologico.cargarAnimales("animales.bin");

        // Mostrar el nombre en mayúsculas de un animal
        System.out.println("Nombre en mayúsculas de " + perro1.getNombre() + ": " + perro1.getNombreEnMayusculas());
    }
}
