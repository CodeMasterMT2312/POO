package Repo_git.DeberNavegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame {
    private JTextField Valor;
    private JButton menuButton;
    private JPanel JPanel_Deposito;
    private JButton depositarButton;
    private Cuenta cuenta;

    public Deposito(Cuenta cuenta) {
        super("Deposito");
        this.cuenta = cuenta;
        setContentPane(JPanel_Deposito);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu Men1 = new menu("");
                Men1.iniciar();
                dispose();
            }
        });

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Depositar();
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Depositar() {
        Double amount = Double.parseDouble(Valor.getText());
        if (amount < 0.0) {
            JOptionPane.showMessageDialog(null, "No se puede depositar valores negativos.");
        } else {
            cuenta.depositar(amount); // Ingreso en la cuenta compartida
            Ver_Saldo.getInstance().VerSaldo(); // Actualizar la ventana Ver_Saldo
            JOptionPane.showMessageDialog(null, "Deposito realizado exitosamente");
        }
    }
}
