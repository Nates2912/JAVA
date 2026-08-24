package WHILE.DIVERSÃO;

import java.util.Scanner;

public class WhAtv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op =0;

        while(op!=5) {
            System.out.println("\n====MENU - ESCOLHA SUA MOCHILA.===");
            System.out.println("1-MOCHILA ESCOLAR.");
            System.out.println("2-MOCHILA DE VIAGEM.");
            System.out.println("3-MOCHILA ESPORTIVA.");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Mochila Escolar: Compacta e ideal para estudantes.");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas.");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva: Leve, resistente e ergonômica.");
                    break;
                case 0:
                    System.out.println("Sair. ");
                    break;

                default:
                    System.out.print("Opção inválida");
                    break;
            }
        }

        sc.close();
    }
}
