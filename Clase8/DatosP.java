package Repo_git.Clase8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatosP extends JFrame {
    private JPanel JPanel_DP;
    private JButton menuButton;
    private JTextField user1;
    private JTextField Verificacion;

    public DatosP() {
        super("Reporte");
        setContentPane(JPanel_DP);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu mn = new menu(user1.getText());
                mn.iniciar();
                dispose();
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setVerificacion(String text) {
        Verificacion.setText(text);
    }

    public void set_user1(String text) {
        user1.setText(text);
    }
}
