package Repo_git.GUI.GUI3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PantallaUnirNombres extends JFrame{
    private JTextField CampoNombre;
    private JTextField CampoApellido;

    public PantallaUnirNombres(){
        // Configuracion basica del JFrame
        setTitle("Unir Nombres y Apellidos");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear un JPanel para organizar los componentes

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Crear los componentes de texto
        CampoNombre = new JTextField();
        CampoApellido = new JTextField();

        // Crear los componentes Boton
        JButton BotonUnir = new JButton("Unir");
        BotonUnir.addActionListener(new ActionListener() {
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

        // Agregar los componentes al panel

        panel.add(new JLabel("Nombre:"));
        panel.add(CampoNombre);
        panel.add(new JLabel("Apellido:"));
        panel.add(CampoApellido);
        panel.add(BotonUnir);

        // Agregar el panel al JFrame
        add(panel);
        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args){
        PantallaUnirNombres pantalla = new PantallaUnirNombres();
    }
}
