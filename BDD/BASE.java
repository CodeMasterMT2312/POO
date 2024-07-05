package GIT_POO.BDD;
import java.sql.*;

public class BASE {
    public static void main(String[] args) throws SQLException {
        Conexion conect = new Conexion();
        conect.iniciar();

        /*
        String URL="jdbc:mysql://localhost:3306/esfotventas"; // Nombre de la base de datos
        String userDB="root";
        String password="123456";

        Connection conn = DriverManager.getConnection(URL, userDB, password);
        System.out.println("Conectado a la base de datos");
        String query="SELECT * FROM cliente;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            //System.out.println(rs.getString("nombre"));
            //System.out.println(rs.getInt("codigo"));
            System.out.println(rs.getString("correo"));
            //System.out.println(rs.getString("password"));
        }
        conn.close(); //Cerrar conexion a la base de datos
        */

    }
}
