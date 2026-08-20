package WhileDowhile.DOWHILE.DoWhileAtv;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do{System.out.println("\n====MENU - ESCOLHA SUA CANETA.===");
            System.out.println("1-CANETA ESFEROGRÁFICA.");
            System.out.println("2-CANETA GEL.");
            System.out.println("3-CANETA TINTEIRO.");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
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
    

