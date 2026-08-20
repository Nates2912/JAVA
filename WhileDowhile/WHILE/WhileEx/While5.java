package WhileDowhile.WHILE.WhileEx;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op =0;

        while(op!=5) {
            System.out.println("\n====MENU====");
            System.out.println("1-CADASTRO");
            System.out.println("2-LISTAR");
            System.out.println("3-ALTERAR");
            System.out.println("4-REMOVER");
            System.out.println("5-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("CADASTRAR! ");
                    break;
                case 2:
                    System.out.println("LISTAR! ");
                    break;
                case 3:
                    System.out.println("ALTERAR! ");
                    break;
                case 4:
                    System.out.println("REMOVER! ");
                    break;
                case 5:
                    System.out.println("SAIR! ");
                    break;
            
                default:
                    System.out.print("Opção inválida");
                    break;
            }
        }

        sc.close();
    }
}
