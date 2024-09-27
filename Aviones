public class Pasajero { // Atributos private String nombres; private String apellidos; private String numeroDePasaporte; private String asiento; private int edad;

// Constructor por defecto
public Pasajero() {
    this.nombres = "";
    this.apellidos = "";
    this.numeroDePasaporte = "";
    this.asiento = "";
    this.edad = 0;
}

// Constructor con parámetros
public Pasajero(String nombres, String apellidos, String numeroDePasaporte, String asiento, int edad) throws Exception {
    if (nombres.isEmpty() || apellidos.isEmpty() || numeroDePasaporte.isEmpty()) {
        throw new Exception("Nombres, apellidos y número de pasaporte no pueden estar vacíos.");
    }
    if (edad <= 0) {
        throw new Exception("La edad debe ser mayor que 0.");
    }
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.numeroDePasaporte = numeroDePasaporte;
    this.asiento = asiento;
    this.edad = edad;
}

// Métodos get y set
public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public String getNumeroDePasaporte() {
    return numeroDePasaporte;
}

public void setNumeroDePasaporte(String numeroDePasaporte) {
    this.numeroDePasaporte = numeroDePasaporte;
}

public String getAsiento() {
    return asiento;
}

public void setAsiento(String asiento) {
    this.asiento = asiento;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}
