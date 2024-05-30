package GIT_POO.Ej_Heredar;

public class Jugador_Futbol {
    //Atributos
    public String Nombre;
    public int Cedula;
    public String Camiseta;

    //Constructor
    public Jugador_Futbol(String nombre, int cedula,String camiseta) {
        this.Nombre = nombre;
        this.Cedula = cedula;
        this.Camiseta = camiseta;
    }

    //Metodos

    public void MostrarInfo(){
        System.out.println("Nombre: "+Nombre+" Cedula: "+Cedula+" Camiseta: "+Camiseta);
    }
}
class Defensa extends Jugador_Futbol {
    //Atributos
    public String Posicion;
    public int Tarjetas;
    public int Goles;
    public int Faltas;

    //Constructor

    public Defensa(String nombre, int cedula, String camiseta, String posicion, int faltas, int goles, int tarjetas) {
        super(nombre, cedula, camiseta);
        this.Posicion = posicion;
        this.Faltas = faltas;
        this.Goles = goles;
        this.Tarjetas = tarjetas;
    }

    //Metodos
    public void infoDefensa() {
        super.MostrarInfo();
        System.out.println("Posicion: "+Posicion+" Faltas: "+Faltas+" Goles: "+Goles+" Tarjetas: "+Tarjetas);
    }
}
