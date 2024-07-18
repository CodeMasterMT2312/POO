package GIT_POO.BDD_Nube;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Registrar extends JFrame {
    private JTextField NameText;
    private JTextField ApellidoText;
    private JButton registrarButton;
    private JPanel RegisPanel;
    private JButton regresarButton;

    public Registrar() {
        super("Registrar");
        setContentPane(RegisPanel);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrar();
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.iniciar();
                dispose();
            }
        });
    }

    public void registrar(){
        boolean credencialesCorrectas = false;
        try {
            String URL= "jdbc:mysql://ufeg4mxmgr4l8wwv:SOPzhyOD3jM4H3nYzKAE@bkuqtl2o6sqnsc9xe2om-mysql.services.clever-cloud.com:3306/bkuqtl2o6sqnsc9xe2om";
            String userDB="ufeg4mxmgr4l8wwv";
            String password="SOPzhyOD3jM4H3nYzKAE";

            Connection conn = DriverManager.getConnection(URL, userDB, password);
            String query = "INSERT INTO Registro(Nombre,Apellido) VALUES (?,?);";
            PreparedStatement guardar = conn.prepareStatement(query);

            guardar.setString(1, NameText.getText());
            guardar.setString(2,ApellidoText.getText());

            int RegistroInsertado = guardar.executeUpdate();

            if (RegistroInsertado > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
            }
            conn.close(); // Cerrar conexión a la base de datos
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
