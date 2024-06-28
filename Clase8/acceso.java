package Repo_git.Clase8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class acceso extends JFrame {
    private JTextField password;
    private JTextField UserIn;
    private JLabel Acceso;
    private JButton ACCESOButton;
    private JPanel JPanel_acceso;

    public acceso() {
        super("VENTANA DE ACCESO");
        setContentPane(JPanel_acceso);
        ACCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena = "123456";
                String user = "MT";
                String contra_ingresada = password.getText();
                String user_intro = UserIn.getText();
                if(contrasena.equals(contra_ingresada) && user.equals(user_intro)){
                    menu ventanaM = new menu(user_intro);
                    ventanaM.iniciar();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, " Usuario o Contraseña incorrecta");
                    password.setText("");
                    UserIn.setText("");
                }
            }
        });
    }
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

