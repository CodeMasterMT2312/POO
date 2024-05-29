package GIT_POO.Correccion_Examen;

// Clase Hotel
public class Hotel {
    private String nombre;
    private String direccion;
    private int estrellas;
    private int habitaciones;
    private double precio;

    // Constructor
    public Hotel(String nombre, String direccion, int estrellas, int habitaciones, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.habitaciones = habitaciones;
        this.precio = precio;
    }

    // Constructor sin parámetros
    public Hotel() {
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
/*
    public String getDireccion() {
        return direccion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public double getPrecio() {
        return precio;
    }
    */

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para imprimir la información del hotel
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", Dirección: " + direccion + ", Estrellas: " + estrellas +
                ", Habitaciones: " + habitaciones + ", Precio: " + precio);
    }

    // Método para modificar todos los atributos
    public void modificarAtributos(String nombre, String direccion, int estrellas, int habitaciones, double precio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.habitaciones = habitaciones;
        this.precio = precio;
    }

    // Método para establecer valores null
    public void establecerValoresNull() {
        this.nombre = null;
        this.direccion = null;
        this.estrellas = 0;
        this.habitaciones = 0;
        this.precio = 0.0;
    }
}
