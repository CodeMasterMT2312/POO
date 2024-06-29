package Repo_git.DeberNavegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ver_Saldo extends JFrame {

    private JTextField CampoUser;
    private JButton menuButton;
    private JPanel D_Saldo;
    private JTextField CampoVer;
    private static Ver_Saldo instance; // Almacenar la instancia única
    private Cuenta cuenta;

    public Ver_Saldo(Cuenta cuenta) {
        this.cuenta = cuenta;
        setTitle("Ver Saldo");
        setContentPane(D_Saldo);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu Men1 = new menu(CampoUser.getText());
                Men1.iniciar();
                dispose();
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void VerSaldo() {
        CampoVer.setText("Su saldo es: $" + cuenta.getSaldo());
    }

    public void setCampoUser(String text) { CampoUser.setText(text);}

    public static Ver_Saldo getInstance() {
        return instance;
    }
}