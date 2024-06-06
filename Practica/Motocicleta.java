package GIT_POO.Practica;

public class Motocicleta extends  Vehiculo {
    private double consumo_gasolina;
    private double costo_mantenimiento;

    public Motocicleta(String marca, String modelo, int anio, int kilometraje, double consumo_gasolina, double costo_mantenimiento) {
        super(marca, modelo, anio, kilometraje);
        this.consumo_gasolina = consumo_gasolina;
        this.costo_mantenimiento = costo_mantenimiento;
    }

    public double getConsumo_gasolina() {
        return consumo_gasolina;
    }

    public double getCosto_mantenimiento() {
        return costo_mantenimiento;
    }
}
