package GIT_POO.BDD_Nube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar extends JFrame {

    private JTextField IDText;
    private JButton actualizarButton;
    private JButton regresarButton;
    private JTextField NombreText;
    private JTextField ApellidoText;
    private JPanel ActPanel;

    public Actualizar() {
        super("Actualizar Registro");
        setContentPane(ActPanel);
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizar();
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

    public void actualizar(){
        try {
            String URL= "jdbc:mysql://ufeg4mxmgr4l8wwv:SOPzhyOD3jM4H3nYzKAE@bkuqtl2o6sqnsc9xe2om-mysql.services.clever-cloud.com:3306/bkuqtl2o6sqnsc9xe2om";
            String userDB="ufeg4mxmgr4l8wwv";
            String password="SOPzhyOD3jM4H3nYzKAE";

            Connection conn = DriverManager.getConnection(URL, userDB, password);
            String query = "UPDATE Registro SET Nombre = ?,Apellido = ? WHERE ID = ?;";
            PreparedStatement actu = conn.prepareStatement(query);
            actu.setString(1, NombreText.getText());
            actu.setString(2, ApellidoText.getText());
            actu.setInt(3, Integer.parseInt(IDText.getText()));
            int rowsAffected = actu.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con la cédula proporcionada.");
            }
            conn.close(); //Cerrar conexion a la base de datos
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
