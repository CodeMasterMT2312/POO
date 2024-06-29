package Repo_git.DeberNavegacion;
public class Cuenta {
    private double saldo;

    public Cuenta() {

        this.saldo = 0.0; // Saldo inicializado en 0.0
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad >= 0) {
            saldo += cantidad;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }
}
