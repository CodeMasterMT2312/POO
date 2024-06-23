package Repo_git.DeberGui;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        // Config JFrame
        JFrame ventana = new JFrame();
        ventana.setTitle("Calculadora");
        ventana.setSize(430,240);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel 1
        JPanel panel1 = new JPanel();
        // Componentes
        panel1.setLayout(new GridLayout(3,1 ));
        JLabel etiqueta1 = new JLabel("Calculadora", SwingConstants.CENTER); //Alinea variable SwingConstants.CENTER
        JPanel fila1 = new JPanel(new BorderLayout());
        JLabel etiqueta2 = new JLabel("Numero 1: ");
        JTextField Numero1 = new JTextField();
        fila1.add(etiqueta2, BorderLayout.WEST);
        fila1.add(Numero1, BorderLayout.CENTER);

        JPanel fila2 = new JPanel(new BorderLayout());
        JLabel etiqueta3 = new JLabel("Numero 2: ");
        JTextField Numero2 = new JTextField();
        fila2.add(etiqueta3, BorderLayout.WEST);
        fila2.add(Numero2, BorderLayout.CENTER);

        panel1.add(etiqueta1);
        panel1.add(fila1);
        panel1.add(fila2);

        ventana.add(panel1, BorderLayout.NORTH);

        //Panel 2

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5,3));
        JButton SUMA = new JButton("+");
        JButton RESTA = new JButton("-");
        JButton MULTIPLICACION = new JButton("*");
        JButton DIVISION = new JButton("/");
        JButton POTENCIA = new JButton("^");
        JButton RAIZ_CUADRADA = new JButton("√a");
        JButton RAIZ = new JButton("ⁿ√a");
        JButton SENO = new JButton("sin(θ)");
        JButton COSENO = new JButton("cos(θ)");
        JButton TANGENTE = new JButton("tan(θ)");
        JButton LOGARITMO = new JButton("logb(a)");
        JButton LOGARITMO_NATURAL = new JButton("In(a)");
        JButton VALOR_ABSOLUTO = new JButton("|a|");
        JButton FACTORIAL = new JButton("n!");
        JButton EXPONENCIAL = new JButton("e^a");

        panel2.add(SUMA);
        panel2.add(RESTA);
        panel2.add(MULTIPLICACION);
        panel2.add(DIVISION);
        panel2.add(POTENCIA);
        panel2.add(RAIZ_CUADRADA);
        panel2.add(RAIZ);
        panel2.add(SENO);
        panel2.add(COSENO);
        panel2.add(TANGENTE);
        panel2.add(LOGARITMO);
        panel2.add(LOGARITMO_NATURAL);
        panel2.add(VALOR_ABSOLUTO);
        panel2.add(FACTORIAL);
        panel2.add(EXPONENCIAL);

        // Funcion Botones
        BtnAccion actions = new BtnAccion(Numero1,Numero2);
        SUMA.addActionListener(actions.getSumaAction());
        RESTA.addActionListener(actions.getRestaAction());
        MULTIPLICACION.addActionListener(actions.getMultiplicacionAction());
        DIVISION.addActionListener(actions.getDivisionAction());
        POTENCIA.addActionListener(actions.getPotenciaAction());
        RAIZ_CUADRADA.addActionListener(actions.getRaizCuadradaAction());
        RAIZ.addActionListener(actions.getRaizAction());
        SENO.addActionListener(actions.getSenoAction());
        COSENO.addActionListener(actions.getCosenoAction());
        TANGENTE.addActionListener(actions.getTangenteAction());
        LOGARITMO.addActionListener(actions.getLogaritmoAction());
        LOGARITMO_NATURAL.addActionListener(actions.getLogaritmoNaturalAction());
        VALOR_ABSOLUTO.addActionListener(actions.getAbsolutoAction());
        FACTORIAL.addActionListener(actions.getFactorialAction());
        EXPONENCIAL.addActionListener(actions.getExponencialAction());

        ventana.add(panel2, BorderLayout.SOUTH);

        // Panel3 Info
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        JLabel etiqueta4 = new JLabel("NOTA: Las operaciones que riquieran una sola entrada elegir Numero 1");
        panel3.add(etiqueta4, BorderLayout.WEST);
        ventana.add(panel3, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
