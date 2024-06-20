package Repo_git.GUI.GUI2;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame ventana = new JFrame("Titulo de ventana ESFOT POO");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para contener el boton y la etiqueta
        JPanel panelSur = new JPanel();

        JButton Boton =new JButton("Dar clic");
        panelSur.add(Boton);

        JLabel etiqueta = new JLabel("Etiqueta");
        panelSur.add(etiqueta);

        // Agregar el panel al area sur de BorderLayout
        ventana.add(panelSur, BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}
