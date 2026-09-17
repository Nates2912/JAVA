

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //ADICIONAR
        nomes.add("Ada");
        nomes.add("Gideon");
        nomes.add("Paule");

        //listar
        System.out.println("Lista");
            for (String nome : nomes){
                System.out.println(nome);
            }

        //alterar

        nomes.set(1, "Lizzie");

        System.out.println("Lista aós alterar: ");
        for (Object nome : nomes) {
            System.out.println(nome);
        }

        //remover
        nomes.remove(0);

        System.out.println("Lista após remover: ");
        for (Object nome : nomes) {
            System.out.println(nome);
        }
    }
}
