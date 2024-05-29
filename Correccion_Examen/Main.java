package Repo_git.Correccion_Examen;


//Probando Commits
public class Main {
        public static void main(String[] args) {
            // 1. Crear 5 instancias de la clase con valores quemados
            Hotel hotel1 = new Hotel("Hotel A", "Calle 1", 5, 100, 200.0);
            Hotel hotel2 = new Hotel("Hotel B", "Calle 2", 4, 80, 150.0);
            Hotel hotel3 = new Hotel("Hotel C", "Calle 3", 3, 60, 100.0);
            Hotel hotel4 = new Hotel("Hotel D", "Calle 4", 4, 120, 250.0);
            Hotel hotel5 = new Hotel("Hotel E", "Calle 5", 2, 50, 80.0);

            // 2. Crear dos objetos con valores nulos y setear sus valores posteriormente
            Hotel hotel6 = new Hotel();
            Hotel hotel7 = new Hotel();

            hotel6.setNombre("Hotel F");
            hotel6.setDireccion("Calle 6");
            hotel6.setEstrellas(5);
            hotel6.setHabitaciones(200);
            hotel6.setPrecio(300.0);

            hotel7.setNombre("Hotel G");
            hotel7.setDireccion("Calle 7");
            hotel7.setEstrellas(3);
            hotel7.setHabitaciones(70);
            hotel7.setPrecio(120.0);

            // 3. Desarrollar métodos personalizados
            // a. Modificar los objetos previamente creados
            hotel1.modificarAtributos("Hotel AA", "Avenida 1", 4, 110, 210.0);
            hotel2.modificarAtributos("Hotel BB", "Avenida 2", 3, 90, 160.0);

            // b. Imprimir todos los objetos
            Hotel[] hoteles = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7};
            for (Hotel hotel : hoteles) {
                hotel.imprimirInformacion();
            }

            // c. Modificar todos los atributos de al menos tres objetos con el valor de NULL y mostrar su nuevo valor
            hotel3.establecerValoresNull();
            hotel4.establecerValoresNull();
            hotel5.establecerValoresNull();

            System.out.println("\nDespués de establecer valores null:");
            for (Hotel hotel : new Hotel[]{hotel3, hotel4, hotel5}) {
                hotel.imprimirInformacion();
            }
        }
    }
