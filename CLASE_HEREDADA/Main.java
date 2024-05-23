package GIT_POO.CLASE_HEREDADA;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("10 metros","Carro","Overlanding","Toyota","Tacoma","Verde","ABC-123","Jose Luis");
        carro1.imprimirC();
        System.out.println("\n");
        Carro_Revision carro1Rev = new Carro_Revision("10 metros","Carro","Overlanding","Toyota","Tacoma","Verde","ABC-123","Jose Luis",false,"No paso por gases");
        carro1Rev.ImprimirRev();
    }
}
