import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Perro perro1 = new Perro("Rex", 5, "Labrador");
        Gato gato1 = new Gato("Miau", 3);
       
       zoologico.agregarAnimal(perro1);
         zoologico.agregarAnimal(gato1);
       
       Perro perro2 = new Perro("jon", 8, "doggerman");
         Gato gato2 = new Gato("Miau", 5);

        zoologico.agregarAnimal(perro2);
        zoologico.agregarAnimal(gato2);

        zoologico.mostrarSonido();


       zoologico.mostrarConteoAnimales();
    }
}
