package GIT_POO.Practica;

public class Coche extends Vehiculo {

    private double consumo_gasolina;
    private double costo_mantenimiento;

    public Coche(String marca, String modelo, int anio, int kilometraje, double costo_mantenimiento, double consumo_gasolina) {
        super(marca, modelo, anio, kilometraje);
        this.costo_mantenimiento = costo_mantenimiento;
        this.consumo_gasolina = consumo_gasolina;
    }

    public double getConsumo_gasolina() {
        return consumo_gasolina;
    }


    public double getCosto_mantenimiento() {
        return costo_mantenimiento;
    }


}

