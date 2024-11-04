import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoologico {
    private List<Animal> animales;
    private Map<String, Integer> conteoPortipo;

    public Zoologico() {
        animales = new ArrayList<>();
        conteoPortipo = new HashMap<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarSonido() {
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre() + 
                               ", Edad: " + animal.getEdad() + 
                               ", Sonido: " + animal.hacerSonido());
        }
    }

    public void mostrarConteoAnimales() {
        for (Animal animal : animales) {
            String tipo = animal.getClass().getSimpleName();
            conteoPortipo.put(tipo, conteoPortipo.getOrDefault(tipo, 0) + 1);
        }
        for (String tipo : conteoPortipo.keySet()) {
            System.out.println("Tipo: " + tipo + ", cantidad: " + conteoPortipo.get(tipo));
        }
    }

    // Método para guardar la lista de animales en un archivo binario
    public void guardarAnimales(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(animales);
            System.out.println("Lista de animales guardada en el archivo " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar animales: " + e.getMessage());
        }
    }

    // Método para cargar la lista de animales desde un archivo binario
    @SuppressWarnings("unchecked")
    public void cargarAnimales(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            animales = (List<Animal>) in.readObject();
            System.out.println("Lista de animales cargada desde el archivo " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar animales: " + e.getMessage());
        }
    }
}
