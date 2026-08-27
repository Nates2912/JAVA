
import java.util.Scanner;

public class Vet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nomes = new String[3];

        //Cadastrar
        System.out.println("===Cadastro de nomes===");
        for (int i=0;i<nomes.length; i++){
            System.out.print("Digite o nome");
            nomes[i]=sc.nextLine();
        }
        //Lista

        System.out.println("\nLista atual");
        listar(nomes);

        //Alterar
        System.out.print("\nDigite a posição para alterar: ");
        int posAlterar=sc.nextInt();
        sc.nextLine();

        if(posAlterar>=0 && posAlterar<nomes.length) {
            System.out.print("Digite o novo nome: ");
            nomes [posAlterar]=sc.nextLine();
        }else{
            System.out.print("Posição Inválida");
        }

        System.out.println("Lista atualizada: ");
        listar(nomes);

    //Remover
    System.out.println("\nDigite a posição para remover: ");
    int posRemover=sc.nextInt();

    if (posRemover>=0 && posRemover<nomes.length){
        for(int i=posRemover;i<nomes.length-1;i++){
            nomes[i]=nomes[i+1];
        }
        nomes[nomes.length - 1] = null;
    }else{System.out.println("Posição inválida");

    }
    System.out.println("\nLista após remoção: ");
    listar(nomes);

        sc.close();
    }

    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+" - "+array[i]);
        }
    }
}
