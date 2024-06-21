package GIT_POO.GUI.EntornoGrafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

            JFrame ventana = new JFrame();
            ventana.setTitle("Mi primera ventana");
            ventana.setSize(300,200);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel etiqueta = new JLabel("2024-06-21");

            // Panel 1
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2,1 ));
            panel.add(etiqueta);
            panel.setBackground(Color.red);
            JTextField texto = new JTextField("Texto ejemplo");
            panel.add(texto);

            // Panel 2
            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridLayout(5, 1));
            panel1.setBackground(Color.CYAN);
            JLabel etiqueta1 = new JLabel("Numero 1: ");
            JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
            panelBoton.setBackground(Color.CYAN);
            JButton boton = new JButton("Calcular");
            JTextField Num1 = new JTextField(4);
            JTextField Num2 = new JTextField(4);
            JTextField Resultado = new JTextField(4);

            boton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num1 = Double.parseDouble(Num1.getText());
                    double num2 = Double.parseDouble(Num2.getText());
                    String suma = String.format("%.2f",num1 + num2);
                    Resultado.setText("Resultado: " + suma);
                }
            });

            panel1.add(etiqueta1);
            panel1.add(Num1);
            panel1.add(new JLabel("Numero2: "));
            panel1.add(Num2);
            panel1.add(new JLabel("Resultado: "));
            panel1.add(Resultado);
            panelBoton.add(boton);
            panel1.add(panelBoton);

            // Agregar a los paneles al Frame
            ventana.add(panel);
            ventana.add(panel1);

            // Disposicion de los paneles
            ventana.add(panel , BorderLayout.NORTH);
            ventana.add(panel1, BorderLayout.CENTER);
            ventana.setVisible(true);
        }
}

