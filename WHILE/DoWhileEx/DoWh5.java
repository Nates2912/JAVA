package WHILE.DoWhileEx;

import java.util.Scanner;

public class DoWh5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do{System.out.println("\n====MENU====");
            System.out.println("1-NOVO JOGO");
            System.out.println("2-CONTINUAR JOGO");
            System.out.println("3-CONFIGURAÇÕES");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("COMEÇAR! ");
                    break;
                case 2:
                    System.out.println("CONTINUAR! ");
                    break;
                case 3:
                    System.out.println("CONFIGURAÇÕES! ");
                    break;
                case 0:
                    System.out.println("SAIR! ");
                    break;

                default:
                    System.out.print("Opção inválida");
                    break;
                }
    }while(op!=0);
            
    sc.close();
            
    }
}
    

