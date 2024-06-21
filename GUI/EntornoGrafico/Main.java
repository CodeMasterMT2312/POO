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
            panel1.setLayout(new GridLayout(5,1 ));
            panel1.setBackground(Color.CYAN);
            JLabel etiqueta1 = new JLabel("Calculos");
            JButton boton = new JButton("Calcular");
            boton.setSize(50,40);
            boton.setLocation(50,10);
            JTextField Num1 = new JTextField(4);
            JTextField Num2 = new JTextField(4);
            JTextField Resultado = new JTextField(4);

            boton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(Num1.getText());
                    int num2 = Integer.parseInt(Num2.getText());
                    int suma = num1 + num2;
                    Resultado.setText("Resultado: " + suma);
                }
            });

            panel1.add(etiqueta1);
            panel1.add(Num1);
            panel1.add(Num2);
            panel1.add(boton);
            panel1.add(Resultado);

            // Agregar a los paneles al Frame
            ventana.getContentPane().add(panel);
            ventana.getContentPane().add(panel1);

            // Disposicion de los paneles
            ventana.add(panel , BorderLayout.NORTH);
            ventana.add(panel1, BorderLayout.CENTER);
            ventana.setVisible(true);
        }
}

