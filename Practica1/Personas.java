package Clase6.Practica1;

public class Personas {
    //Atributos
    String Nombre;
    String Apellido;
    int Edad;

    public Personas(String nombre, int edad, String apellido) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Apellido = apellido;
    }

    // Metodos
    public void Datos(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
    }
}
