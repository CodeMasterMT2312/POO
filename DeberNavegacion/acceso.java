package Repo_git.DeberNavegacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class acceso extends JFrame {
    private JTextField user;
    private JPasswordField pass; // Utilizar JPasswordField para introducir la contraseña
    private JButton loginButton;
    private JPanel JPanel_Login;

    public acceso() {
        super("Login");
        setContentPane(JPanel_Login);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena = "admin123";
                String username = "admin";
                String user_intro = user.getText();
                char[] password = pass.getPassword(); // Obtener contraseña como matriz de caracteres
                String password_intro = new String(password); // Convert to string

                if (contrasena.equals(password_intro) && username.equals(user_intro)) {
                    menu Men = new menu(user_intro);
                    Men.iniciar();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
                    user.setText("");
                    pass.setText("");
                }
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getUser() {
        return user.getText();
    }
}