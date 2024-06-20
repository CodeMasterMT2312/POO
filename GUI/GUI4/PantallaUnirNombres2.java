package Repo_git.GUI.GUI4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaUnirNombres2 extends JFrame {
    private JTextField campoNombre;
    private JTextField campoApellidos;
    private JTextField campoNombreCompleto;

    public PantallaUnirNombres2() {
        setTitle("Unir Nombres y Apellidos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Crear los campos de texto
        campoNombre = new JTextField();
        campoApellidos = new JTextField();
        campoNombreCompleto = new JTextField();
        campoNombreCompleto.setEditable(false); // Hacer que la caja de texto sea de solo lectura

        // Crear los botones "Unir" y "Limpiar"
        JButton botonUnir = new JButton("Unir");
        JButton botonLimpiar = new JButton("Limpiar");

        botonUnir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar al hacer clic en el botón "Unir"
                String nombre = campoNombre.getText();
                String apellidos = campoApellidos.getText();
                String nombreCompleto = nombre + " " + apellidos;

                // Mostrar el resultado en el campo de texto correspondiente
                campoNombreCompleto.setText(nombreCompleto);
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar al hacer clic en el botón "Limpiar"
                campoNombre.setText("");
                campoApellidos.setText("");
                campoNombreCompleto.setText("");
            }
        });

        // Agregar componentes al panel
        panel.add(new JLabel("Nombre:"));
        panel.add(campoNombre);
        panel.add(new JLabel("Apellidos:"));
        panel.add(campoApellidos);
        panel.add(new JLabel("Nombre completo:"));
        panel.add(campoNombreCompleto);
        panel.add(botonUnir);
        panel.add(botonLimpiar);

        // Agregar el panel al JFrame
        add(panel);

        // Mostrar el JFrame
        setVisible(true);
    }
    public static void main(String[] args) {
        PantallaUnirNombres2 pantalla = new PantallaUnirNombres2();
    }
}

