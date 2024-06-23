package Repo_git.DeberGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnAccion {
    private JTextField Num1;
    private JTextField Num2;

    public BtnAccion(JTextField Num1, JTextField Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public ActionListener getSumaAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String suma = String.format("%.2f", num1 + num2);
                JOptionPane.showMessageDialog(null, suma);
            }
        };
    }

    public ActionListener getRestaAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String suma = String.format("%.2f", num1 - num2);
                JOptionPane.showMessageDialog(null, suma);
            }
        };
    }
    public ActionListener getMultiplicacionAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String multiplicacion = String.format("%.2f", num1 * num2);
                JOptionPane.showMessageDialog(null, multiplicacion);
            }
        };
    }

    public ActionListener getDivisionAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                if (num2 != 0) {
                    String division = String.format("%.2f", num1 / num2);
                    JOptionPane.showMessageDialog(null,division);
                } else {
                    JOptionPane.showMessageDialog(null,"Error: División por cero");
                }
            }
        };
    }

    public ActionListener getPotenciaAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String potencia = String.format("%.2f", Math.pow(num1,num2));
                JOptionPane.showMessageDialog(null, potencia);
            }
        };
    }

    public ActionListener getRaizCuadradaAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                String raizCuadrada = String.format("%.2f", Math.sqrt(num1));
                JOptionPane.showMessageDialog(null, raizCuadrada);
            }
        };
    }

    public ActionListener getRaizAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String raiz = String.format("%.2f", Math.pow(num1, 1.0 / num2));
                JOptionPane.showMessageDialog(null, raiz);
            }
        };
    }

    public ActionListener getSenoAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double radianes = Math.toRadians(num1);
                String seno = String.format("%.2f", Math.sin(radianes));
                JOptionPane.showMessageDialog(null, seno);
            }
        };
    }

    public ActionListener getCosenoAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double radianes = Math.toRadians(num1);
                String coseno = String.format("%.2f", Math.cos(radianes));
                JOptionPane.showMessageDialog(null, coseno);
            }
        };
    }

    public ActionListener getTangenteAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double radianes = Math.toRadians(num1);
                String tangente = String.format("%.2f", Math.tan(radianes));
                JOptionPane.showMessageDialog(null, tangente);
            }
        };
    }

    public ActionListener getLogaritmoAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double num2 = Double.parseDouble(Num2.getText());
                String logaritmo = String.format("%.2f", Math.log10(num1) / Math.log10(num2));
                JOptionPane.showMessageDialog(null, logaritmo);
            }
        };
    }

    public ActionListener getLogaritmoNaturalAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                String logaritmNatural = String.format("%.2f",Math.log(num1));
                JOptionPane.showMessageDialog(null, logaritmNatural);
            }
        };
    }

    public ActionListener getAbsolutoAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                String logaritmoNatural = String.format("%.2f", Math.abs(num1));
                JOptionPane.showMessageDialog(null, logaritmoNatural);
            }
        };
    }

    public ActionListener getFactorialAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                double factorial = 1;

                for (int i = 1; i <= num1; i++) {
                    factorial *= i;
                }
                String factorialResult = String.format("%.2f",factorial);
                JOptionPane.showMessageDialog(null, factorialResult);
            }
        };
    }

    public ActionListener getExponencialAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(Num1.getText());
                String exponencial = String.format("%.2f", Math.exp(num1));
                JOptionPane.showMessageDialog(null, exponencial);
            }
        };
    }
}