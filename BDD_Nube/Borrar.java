package GIT_POO.BDD_Nube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Borrar extends JFrame {
    private JTextField IDText;
    private JButton eliminarButton;
    private JButton regresarButton;
    private JPanel BorrarPanel;

    public Borrar() {
        super("Borrar Registro");
        setContentPane(BorrarPanel);
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.iniciar();
                dispose();
            }
        });
    }
    public void eliminar(){
        try {
            String URL= "jdbc:mysql://ufeg4mxmgr4l8wwv:SOPzhyOD3jM4H3nYzKAE@bkuqtl2o6sqnsc9xe2om-mysql.services.clever-cloud.com:3306/bkuqtl2o6sqnsc9xe2om";
            String userDB="ufeg4mxmgr4l8wwv";
            String password="SOPzhyOD3jM4H3nYzKAE";

            Connection conn = DriverManager.getConnection(URL, userDB, password);
            String query = "DELETE FROM Registro where ID=?;";
            PreparedStatement pstmt = conn.prepareStatement(query);
            String cedula = IDText.getText(); // Obtener la cédula desde el campo de texto
            pstmt.setString(1, cedula);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con la cédula proporcionada.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
        }
    }
    public void iniciar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);
    }
}
