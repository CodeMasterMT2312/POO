package Repo_git.GUI.GUI_Deber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deber extends JFrame{
        private JTextField CampoNombre;
        private JTextField CampoApellido;
        private JTextField CampoEdad;

        public Deber() {

            // Configuracion basica del JFrame
            setTitle("Unir Nombres y Apellidos");
            setSize(300, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Crear un JPanel para organizar los componentes
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 1));

            //Componentes De texto
            CampoNombre = new JTextField(10);
            CampoApellido = new JTextField(10);
            CampoEdad = new JTextField(10);

            //Componentes de botones
            JButton botonUnir = new JButton("Unir");
            JButton Calcular = new JButton("Fecha Nacimiento");

            botonUnir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    //Accion a realizar al hacer clic en el boton
                    String nombre = CampoNombre.getText();
                    String apellido = CampoApellido.getText();
                    String nombreCompleto = nombre + " " + apellido;

                    //Mostrar el resultado en un cuadro de dialogo
                    JOptionPane.showMessageDialog(null, "Nombre Completo: "+ nombreCompleto);
                }
            });

            Calcular.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    //Accion a realizar al hacer clic en el boton
                    String edad = CampoEdad.getText();
                    int edadInt = Integer.parseInt(edad);
                    int fechaNacimiento = 2024 - edadInt;
                    //Mostrar el resultado en un cuadro de dialogo con validaciones :v
                    if(edadInt > 100){
                        JOptionPane.showMessageDialog(null, "No se puede calcular la fecha de nacimiento");
                    }else{
                        JOptionPane.showMessageDialog(null, "Fecha de Nacimiento: "+ fechaNacimiento);
                    }
                }
            });

            panel.add(new JLabel("Nombres:"));
            panel.add(CampoNombre);
            panel.add(new JLabel("Apellidos:"));
            panel.add(CampoApellido);
            panel.add(new JLabel("Edad:"));
            panel.add(CampoEdad);
            panel.add(botonUnir);
            panel.add(Calcular);

            add(panel);
            setVisible(true);
        }

        public static void main(String[] args) {
            Deber prueba = new Deber();
        }
}
