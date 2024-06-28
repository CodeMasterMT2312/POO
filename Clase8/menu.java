package Repo_git.Clase8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {
    private JPanel JPanel_menu;
    private JButton verVentanaButton;
    private JButton verReportesButton;
    private JTextField valor1;
    private JTextField valor2;
    private JTextField resultado;
    private JButton button1;
    private double sum;
    private String Username;

    DatosP DP = new DatosP();

    public menu(String username) {
        super("OPCIONES MENU");
        this.Username = username;
        setContentPane(JPanel_menu);


        verVentanaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acceso ventana_ac = new acceso();
                ventana_ac.iniciar();
                dispose(); //cierra la ventana actual al abrir la otra ventana
            }
        });
        verReportesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DP.iniciar();
                DP.set_user1(Username);
                ParImpar();
                dispose(); //cierra la ventana actual al abrir la otra ventana
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(valor1.getText());
                double num2 = Double.parseDouble(valor2.getText());
                sum = num1 + num2;
                resultado.setText(String.valueOf(sum));
            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ParImpar(){
        if(sum % 2 == 0){
            DP.setVerificacion("El numero "+sum+" es par");
        }
        else{
            DP.setVerificacion("El numero "+sum+" es impar");
        }
    }
}
