abstract class Animal implements Serializable {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract String hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que devuelve el nombre del animal en mayúsculas
    public String getNombreEnMayusculas() {
        return nombre.toUpperCase();
    }
}
