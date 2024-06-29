package Repo_git.DeberNavegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame {
    private JTextField V_Retiro;
    private JButton Retirar;
    private JButton Menu;
    private JPanel JPanel_Retiro;
    private Cuenta cuenta;


    public Retiro(Cuenta cuenta) {
        super("Retiros");
        this.cuenta = cuenta;
        setContentPane(JPanel_Retiro);


        Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu Men1 = new menu("");
                Men1.iniciar();
                dispose();
            }
        });
        Retirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retirar();
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Retirar() {
        Double ValorRetiro = Double.parseDouble(V_Retiro.getText());
        Double ValorVisto = cuenta.getSaldo();
        if (ValorRetiro <= ValorVisto){
            Double ValorRetirado=(ValorVisto - ValorRetiro);
            cuenta.setSaldo(ValorRetirado);
            JOptionPane.showMessageDialog(null, "Retiro exitoso.");
            Ver_Saldo.getInstance().VerSaldo(); // Actualizar la ventana Ver_Saldo
        }else{
            JOptionPane.showMessageDialog(null, "No hay suficiente saldo.");
        }
    }
}
