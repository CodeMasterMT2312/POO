package GIT_POO.Practica;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int anio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }


    public double calcular_costo_operacion() {
        return 0.0;
    }

}


