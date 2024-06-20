package Repo_git.GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Titulo de ventana ESFOT POO");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instanciacion de componentes
        JButton Boton = new JButton("Haz clic");
        JLabel Etiqueta = new JLabel("Hola, mundo");
        JTextField Campo_Texto = new JTextField("Texto Inicial");

        //Agregar Componentes
        ventana.add(Boton);
        //Hacer visible la ventana despues de los componentes
        ventana.setVisible(true);
    }
}
