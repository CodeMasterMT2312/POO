package GIT_POO.Inmobiliaria;

 public class CasaIndividual extends Inmueble{
    //Atributos
    private Double TamanioTerreno;

    //Constructor

    public CasaIndividual(String direccion, Double precio, int numHabitaciones, Double tamanio, Double tamanioTerreno) {
        super(direccion, precio, numHabitaciones, tamanio);
        this.TamanioTerreno = tamanioTerreno;
    }

    //Getter

    public Double getTamanioTerreno() {
        return TamanioTerreno;
    }

    //Metodo @Override
    public void MostrarInformacion(){
        System.out.println("Casa individual en venta");
    }
}
