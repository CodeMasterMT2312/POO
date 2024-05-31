package GIT_POO.Inmobiliaria;

 public class Departamento extends  Inmueble{
    //Atributos
    private int NumPiso;

    //Constructor

    public Departamento(String direccion, Double precio, int numHabitaciones, Double tamanio, int numPiso) {
        super(direccion, precio, numHabitaciones, tamanio);
        this.NumPiso = numPiso;
    }

    //GETTER

    public int getNumPiso() {
        return NumPiso;
    }

    //Metodos
    //@Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Departamento en venta"+"\n Numero de pisos: "+ getNumPiso());
    }
}
