package GIT_POO.Calculos;
import java.util.Scanner;

public class Cuenta_Bancaria {
    //Atributos
    int Cedula;
    String Nombre;
    Double Monto;

    //Constructor
    public Cuenta_Bancaria(int cedula, String nombre,double monto) {
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Monto = monto;
    }

    //Metodos
    public void Mostrar() {
        System.out.println("Cedula: "+Cedula+" Nombre: "+Nombre+" Monto: "+Monto);
    }
}
class Cuenta_Ahorro extends Cuenta_Bancaria {
    Scanner sc = new Scanner(System.in);
    //Atributos
    String N_Cuenta;
    Double Cantidad;
    Double Interes;

    //Constructor
    public Cuenta_Ahorro(int cedula, String nombre, double monto, String n_Cuenta, Double interes, Double cantidad) {
        super(cedula, nombre, monto);
        this.N_Cuenta = n_Cuenta;
        this.Interes = interes;
        this.Cantidad = cantidad;
    }

    //Metodos

    public void Depositar(){
        System.out.println("Cuanto es lo que va a depositar?");
        Double Cantidad = sc.nextDouble();
        Monto = Monto + Cantidad;
        Monto = Math.round(Monto * 100.0) / 100.0;
        System.out.println("Cedula: "+Cedula+" Numero de Cuenta: "+ N_Cuenta+" Nombre: "+Nombre+" Monto: "+Monto);
        System.out.println("% de interes a usar? ");
        Double Interes = sc.nextDouble();
        Monto = Monto + (Monto*Interes);
        Monto = Math.round(Monto * 100.0) / 100.0;
        System.out.println("Cedula: "+Cedula+" Numero de Cuenta: "+ N_Cuenta+" Nombre: "+Nombre+" Monto: "+Monto);
    }
    public void Retirar(){
        System.out.println("Cuanto es lo que va a retirar?");
        Double Cantidad = sc.nextDouble();
        while(Cantidad >= Monto){
            System.out.println("No puede retirar esa cantidad");
            Cantidad = sc.nextDouble();
        }
        Monto = Monto - Cantidad;
        Monto = Math.round(Monto * 100.0) / 100.0;
        System.out.println("Cedula: "+Cedula+" Numero de Cuenta: "+ N_Cuenta+" Nombre: "+Nombre+" Monto: "+Monto);
    }

    public void Eleccion(){
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                Depositar();
                break;
            case 2:
                Retirar();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
//class Cuenta_Corriente extends Cuenta_Bancaria {}