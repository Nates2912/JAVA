import java.util.Scanner;

public class ForAtv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do{System.out.println("\n====MENU====");
            System.out.println("1-CALCULAR TABUADA.");
            System.out.println("2-CONTAGEM REGRESSIVA.");
            System.out.println("0-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Insira o número: ");
                    int numero = sc.nextInt();
                    for (int i = 1; i < 10; i++) {
                        System.out.println(numero+" x "+i+" = "+ (numero*1));
                        
                    }
                    break;
                case 2:
                    System.out.print("Insira o número: ");
                    numero=sc.nextInt();
                    for(int i = numero; i>=0; i--)
                        System.out.println(i);
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
