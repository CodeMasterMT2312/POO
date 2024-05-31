package GIT_POO.Inmobiliaria;

public class suite extends Inmueble{
    //Atributos
    private boolean TieneJacuzzi;

    //Constructor

    public suite(String direccion, Double precio, int numHabitaciones, Double tamanio, boolean tieneJacuzzi) {
        super(direccion, precio, numHabitaciones, tamanio);
        this.TieneJacuzzi = tieneJacuzzi;
    }

    //Getter

    public boolean getTieneJacuzzi() {
        return TieneJacuzzi;
    }

    //Metodo
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Suite en venta\n"+"Tiene Jacuzzi? " + getTieneJacuzzi());
    }
}
