package GIT_POO.CLASE_HEREDADA;

public class Vehiculos {
    //Atributos
    String tipo;
    String Tamaño;
    String Uso;

    public Vehiculos(String tamaño, String tipo, String uso) {
        this.Tamaño = tamaño;
        this.tipo = tipo;
        this.Uso = uso;
    }

    //Metodos
    public void imprimir(){
        System.out.println("Tamaño: "+Tamaño+" Tipo: "+tipo);
    }
}
class Carro extends Vehiculos{
    //Atributos
    String Marca;
    String Modelo;
    String Color;
    String Placa;
    String Propietario;

    public Carro(String tamaño, String tipo, String uso, String marca, String modelo,String color, String placa,String propietario){
        super(tamaño, tipo, uso);
        this.Marca = marca;
        this.Modelo = modelo;
        this.Color = color;
        this.Placa = placa;
        this.Propietario = propietario;

    }

    //Metodos
    public void imprimirC(){
        super.imprimir();
        System.out.println("Marca: "+Marca+" Modelo: "+Modelo+" Color: "+Color+" Placa: "+Placa+" Propietario: "+Propietario);
    }
}

class Carro_Revision extends Carro{
    //Atributos
    Boolean Paso_Revision;
    String Fallas;
    //Constructor

    public Carro_Revision(String tamaño, String tipo, String uso, String marca, String modelo, String color, String placa, String propietario, Boolean paso_Revision, String fallas) {
        super(tamaño, tipo, uso, marca, modelo, color, placa, propietario);
        this.Paso_Revision = paso_Revision;
        this.Fallas = fallas;
    }

    //Metodos

    public void ImprimirRev(){
        super.imprimirC();
        System.out.println("Paso Revision: "+Paso_Revision+" Fallas: "+Fallas);
    }
}