import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] professores;
        int ref=0;
        int op;

        do { 
            System.out.print("Sistema de cadastro de funcionários\n1 - Cadastro de PROFESSORES\n 2 - Cadastro de TÉCNICOS\n3 - Exibir PROFESSORES \n4 - Exibir TÉCNICOS \n0 - Sair \nEscolha a opção:  ");
            
            while(!sc.hasNextInt()){
                System.out.println("Opção inválida. Digite entre 0 - 4: ");
                sc.next();
            }
            op=sc.nextInt();
            sc.nextLine();
        switch (op) {
                case 1:
                    System.out.println("====CADASTRAR PROFESSORES====");
                        System.out.print("NOME: ");
                        String nome = sc.nextLine();
                        sc.nextLine();

                        
                        ref++;

                        System.out.println("NÚMERO CADASTRADO!");
                        break;
                    
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
}
