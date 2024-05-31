package GIT_POO.Inmobiliaria;

public class Main_Inmo {
    public static void main(String[] args) {
        Departamento depa1 = new Departamento("Madrid",45000.90,3,65.8,7);
        CasaIndividual casa1 = new CasaIndividual("Quito",150000.90,5,200.58,500.25);
        suite suite1 = new suite("Carolina",1000000.99,2,100.00,true);
        depa1.MostrarInformacion();
        System.out.println("\n");
        casa1.MostrarInformacion();
        System.out.println("\n");
        suite1.MostrarInformacion();
        System.out.println("\n");
    }
}
