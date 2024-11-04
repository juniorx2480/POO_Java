import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Zoologico {
    private List<Animal> animales;

Map<String, Integer> conteoPortipo;
    
    public Zoologico() {
        
        animales = new ArrayList<Animal>();
       // Map<String> conteoPortipo = new HashMap<Animal>();
        conteoPortipo = new HashMap<String, Integer>();
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

    public void mostrarConteoAnimales () {
        for (Animal animal : animales ) {
            String tipo = animal.getClass().getSimpleName();
            conteoPortipo.put(tipo, conteoPortipo.getOrDefault(tipo, 0) + 1);

        }
        for (String tipo : conteoPortipo.keySet()){
          
          System.out.println("Tipo: " + tipo + ", cantidad: " + conteoPortipo.get(tipo));

        }

    } 
    
}
