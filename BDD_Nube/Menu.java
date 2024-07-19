package GIT_POO.BDD_Nube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Menu extends JFrame {
    private JButton registrarButton;
    private JButton actualizarButton;
    private JButton borrarButton;
    private JPanel MenuPanel;
    private JButton visualizarButton;

    public Menu() {
        super("Menu");
        setContentPane(MenuPanel);
        registrarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrar regist = new Registrar();
                regist.iniciar();
                dispose();
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar actu= new Actualizar();
                actu.iniciar();
                dispose();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar borrar = new Borrar();
                borrar.iniciar();
                dispose();
            }
        });
        visualizarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                visualizar();
            }
        });
    }
    public void iniciar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);
    }

    public void visualizar() {
        StringBuilder message = new StringBuilder();
        try {
            String URL= "jdbc:mysql://ufeg4mxmgr4l8wwv:SOPzhyOD3jM4H3nYzKAE@bkuqtl2o6sqnsc9xe2om-mysql.services.clever-cloud.com:3306/bkuqtl2o6sqnsc9xe2om";
            String userDB="ufeg4mxmgr4l8wwv";
            String password="SOPzhyOD3jM4H3nYzKAE";

            Connection conn = DriverManager.getConnection(URL, userDB, password);
            String query = "SELECT ID, Nombre, Apellido FROM Registro";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                message.append("ID: ").append(id).append(", Nombre: ").append(nombre).append(", Apellido: ").append(apellido).append("\n");
            }

            conn.close(); //Cerrar conexión a la base de datos

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si ocurre un error
        }

        // Mostrar el mensaje en un JOptionPane fuera del bloque try-catch
        JOptionPane.showMessageDialog(null, message.toString(), "Datos de Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}
