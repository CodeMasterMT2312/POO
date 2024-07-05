package GIT_POO.BDD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Conexion extends JFrame {
    private JButton verDatosButton;
    private JPanel DatosPanel;
    private JLabel VerDatos;
    private JTextArea Visualizacion;

    public Conexion() {
        super("Conexion");
        setContentPane(DatosPanel);
        verDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String URL = "jdbc:mysql://localhost:3306/esfotventas"; // Nombre de la base de datos
                    String userDB = "root";
                    String password = "123456";

                    Connection conn = DriverManager.getConnection(URL, userDB, password);
                    Visualizacion.setText("Conectado a la base de datos...\n");
                    String query = "SELECT * FROM cliente;";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //System.out.println(rs.getString("nombre"));
                        //System.out.println(rs.getInt("codigo"));
                        Visualizacion.append("ID: "+(rs.getInt("codigo")+" Correo: "+rs.getString("correo")+" Nombre: "+rs.getString("nombre")+"\n"));
                        //System.out.println(rs.getString("password"));
                    }
                    conn.close(); //Cerrar conexion a la base de datos
                } catch (SQLException ex) {
                    System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
                }

            }
        });
    }

    public void iniciar(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(350,200);
    setVisible(true);
}
}
