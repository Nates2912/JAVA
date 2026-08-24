package WHILE.DIVERSÃO;

import java.util.Scanner;

public class DoAtv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do{System.out.println("\n====MENU - ESCOLHA SUA EMBALAGEM.===");
            System.out.println("1-CAIXA DE PAPELÃO.");
            System.out.println("2-SACOLA PLÁSTICA.");
            System.out.println("3-EMBALAGEM DE VIDRO.");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento. ");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável. ");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável. ");
                    break;
                case 0:
                    System.out.println("Sair. ");
                    break;

                default:
                    System.out.print("Opção inválida");
                    break;
                }
    }while(op!=0);
            
    sc.close();
            
    }
}
    

