package GIT_POO.BDDV2;

import GIT_POO.BDD.Conexion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Form extends JFrame {
    private JButton conectarButton;
    private JPanel botonPanel;
    private JTextField NOM;
    private JTextField AGE;
    private JTextField NOTA1;
    private JTextField NOTA2;
    private JButton verRegistrosButton;
    private JTextArea RegistroArea;
    private JButton promedioButton;

    public Form() {
        super("Conectar");
        setContentPane(botonPanel);
        conectarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertar();
            }
        });
        verRegistrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verRegistros();
            }
        });
        promedioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Promedio();
            }
        });
    }

    public void iniciar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public void insertar(){
        try(Connection conn = conexion()){
            String query = "insert into estudiantes(Nombre, edad,nota1,nota2) values (?,?,?,?);";
            PreparedStatement guardar = conn.prepareStatement(query);

            String Nombre = NOM.getText();
            int Edad = Integer.parseInt(AGE.getText());
            Double nota1 = Double.parseDouble(NOTA1.getText());
            Double nota2 = Double.parseDouble(NOTA2.getText());

            guardar.setString(1, Nombre);
            guardar.setInt(2, Edad);
            guardar.setDouble(3, nota1);
            guardar.setDouble(4, nota2);
            int RegistroInsertado = guardar.executeUpdate();

            if(RegistroInsertado > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                NOM.setText("");
                AGE.setText("");
                NOTA1.setText("");
                NOTA2.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro");
            }

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public Connection conexion() throws SQLException{
        String URL = "jdbc:mysql://localhost:3306/esfotventas"; // Nombre de la base de datos
        String userDB = "root";
        String password = "123456";
        return DriverManager.getConnection(URL, userDB, password);
    }
    public void verRegistros(){
        try{
            Connection conn = conexion();
            if(conn != null){
                String query ="select * from estudiantes;";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                RegistroArea.setText("");
                while(rs.next()){
                    int ID = Integer.parseInt(rs.getString("ID_Estudiante"));
                    String Nombre = rs.getString("Nombre");
                    int Edad = Integer.parseInt(rs.getString("edad"));
                    double Nota1 = Double.parseDouble(rs.getString("nota1"));
                    double Nota2 = Double.parseDouble(rs.getString("nota2"));
                    RegistroArea.append("ID: " + ID + "\n");
                    RegistroArea.append("Nombre: " + Nombre + "\n");
                    RegistroArea.append("Edad: " + Edad + "\n");
                    RegistroArea.append("Nota 1: " + Nota1 + "\n");
                    RegistroArea.append("Nota 2: " + Nota2 + "\n");
                    RegistroArea.append("\n");
                }
                conn.close();
            }
        }catch(SQLException ex){
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void Promedio(){
        try{
            Connection conn = conexion();
            if(conn != null){
                String query ="SELECT ID_Estudiante, (nota1 + nota2) / 2 AS promedio from estudiantes;";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                RegistroArea.setText("");
                while(rs.next()){
                    int ID = Integer.parseInt(rs.getString("ID_Estudiante"));
                    double Promedio = Double.parseDouble(rs.getString("promedio"));
                    RegistroArea.append("ID: "+ID+" El promedio de las notas es: " + Promedio + "\n");
                }
                conn.close();
            }
        }catch(SQLException ex){
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
