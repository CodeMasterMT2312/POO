package GIT_POO.BDDV2;

public class Main {
    public static void main(String[] args) {
        Form ventana = new Form();
        ventana.iniciar();
        /*
        String URL = "jdbc:mysql://localhost:3306/esfotventas"; // Nombre de la base de datos
        String userDB = "root";
        String password = "123456";

        try(Connection conn = DriverManager.getConnection(URL, userDB, password)){
            if(conn != null){
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Error al conectar a la base de datos");
            }
        }catch(SQLException ex){
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
        */
    }
}
