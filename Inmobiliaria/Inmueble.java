package GIT_POO.Inmobiliaria;

public class Inmueble {
    //Atributos
    private String Direccion;
    private Double tamanio;
    private int NumHabitaciones;
    private Double Precio;

    //Constructor

    public Inmueble(String direccion, Double precio, int numHabitaciones, Double tamanio) {
        this.Direccion = direccion;
        this.Precio = precio;
        this.NumHabitaciones = numHabitaciones;
        this.tamanio = tamanio;
    }

    //Getters

    public String getDireccion() {
        return Direccion;
    }

    public Double getPrecio() {
        return Precio;
    }

    public int getNumHabitaciones() {
        return NumHabitaciones;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void MostrarInformacion(){System.out.println("Inmuebles en venta");}
}

