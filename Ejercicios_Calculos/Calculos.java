package GIT_POO.Ejercicios_Calculos;

public class Calculos {
    //Atributos
    private int Numero1;
    private int Numero2;
    private int Numero3;

    //Constructor
    public Calculos(int numero1, int numero2, int numero3) {
        this.Numero1 = numero1;
        this.Numero2 = numero2;
        this.Numero3 = numero3;
    }
    //Metodos


    public int getNumero1() {
        return Numero1;
    }

    public int getNumero3() {
        return Numero3;
    }

    public int getNumero2() {
        return Numero2;
    }

    private void Mostrar(){
        System.out.println("Numero 1: "+Numero1);
        System.out.println("Numero 2: "+Numero2);
        System.out.println("Numero 3: "+Numero3);
    }
    public void LlamarFuncion(){
        Mostrar();
    }
}

class Sumar extends Calculos{
    public Sumar(int numero1, int numero2, int numero3) {
        super(numero1, numero2, numero3);
    }
    //Metodos
    public int SumarNum() {
        super.LlamarFuncion();
        int suma = getNumero1() + getNumero2() + getNumero3();
        System.out.println("Suma :" + suma);
        return suma;
    }
}
