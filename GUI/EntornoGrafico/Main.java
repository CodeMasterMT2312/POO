package GIT_POO.GUI.EntornoGrafico;

import javax.swing.*;
import java.awt.*;

public class Main {
    private JButton botonButton;

    public static void main(String[] args) {

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0,2 ));

            JFrame ventana = new JFrame();
            ventana.setTitle("Mi primera ventana");
            ventana.setSize(500,500);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel etiqueta = new JLabel("2024-06-21");
            panel.add(etiqueta);

            JTextField texto = new JTextField();
            panel.add(texto);

            ventana.add(panel);
            ventana.setVisible(true);
        }
}

