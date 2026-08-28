
import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int limite = 5;

        String[] quartos = new String[limite];
        int[] quantidadeCamas = new int[limite];
        
        int qtd = 0;
        int op;

        do {
            System.out.println("\n====MENU====");
            System.out.println("1-REGISTRO DE QUARTO\n2-LISTAR\n3-PESQUISAR\n4-ALTERAR\n5-REMOVER\n6-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("NOME DO QUARTO: ");
                    String nome = sc.next();
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (op!=0);

        sc.close();

    }
}
