# POO_Java

public class Pasajero {
    // Atributos
    private String nombres;
    private String apellidos;
    private String numeroDePasaporte;
    private String asiento;
    private int edad;

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
}

public class Vuelo {
    // Atributos
    private String codigo;
    private String origen;
    private String destino;
    private Pasajero[] pasajeros;
    private int disponibilidad;

    // Constructor por defecto
    public Vuelo() {
        this.codigo = "";
        this.origen = "";
        this.destino = "";
        this.pasajeros = new Pasajero[100];
        this.disponibilidad = 0;
    }

    // Constructor con parámetros
    public Vuelo(String codigo, String origen, String destino) throws Exception {
        if (codigo.isEmpty() || origen.isEmpty() || destino.isEmpty()) {
            throw new Exception("Código, origen y destino no pueden estar vacíos.");
        }
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = new Pasajero[100];
        this.disponibilidad = 0;
    }

    // Métodos get y set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Método para agregar un pasajero al vuelo
    public void agregarPasajero(Pasajero pasajero) throws Exception {
        if (disponibilidad >= 100) {
            throw new Exception("No hay disponibilidad en el vuelo.");
        }
        pasajeros[disponibilidad] = pasajero;
        disponibilidad++;
    }
}
