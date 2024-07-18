package GIT_POO.BDD_Nube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton registrarButton;
    private JButton actualizarButton;
    private JButton borrarButton;
    private JPanel MenuPanel;

    public Menu() {
        super("Menu");
        setContentPane(MenuPanel);
        registrarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrar regist = new Registrar();
                regist.iniciar();
                dispose();
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar actu= new Actualizar();
                actu.iniciar();
                dispose();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar borrar = new Borrar();
                borrar.iniciar();
                dispose();
            }
        });
    }
    public void iniciar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);
    }
}
