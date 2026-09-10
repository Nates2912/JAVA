
import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;

        do { 
            System.out.print("Sistema de cadastro de clientes\n1 - Pessoa Física\n 2 - Pessoa Júridica\n0 - Sair\nEscolha a opção: ");
            
            while(!sc.hasNextInt()){
                System.out.println("Opção inválida. Digite 0, 1, ou 2");
                sc.next();
            }
            op=sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    {System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o endereço: ");
                    String endereco = sc.nextLine();
                    
                    System.out.println("Informe o CPF: ");
                    String cpf = sc.nextLine();

                    ClientePF pf = new ClientePF(nome, endereco, cpf);
                    pf.setNome(nome);
                    pf.setEndereco(endereco);
                    pf.setCpf(cpf);

                    System.out.println("Dados: ");
                    pf.exibirDados();

                    break;}
                case 2:

                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o endereço: ");
                    String endereco = sc.nextLine();
                    
                    
                    System.out.println("Informe o CNPJ: ");
                    String cnpj = sc.nextLine();

                    ClientePJ pj = new ClientePJ(nome, endereco, cnpj);
                    pj.setNome(nome);
                    pj.setEndereco(endereco);
                    pj.setcnpj(cnpj);

                    System.out.println("Dados: ");
                    pj.exibirDados();

                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida. ");
                    break;
            }

        } while (op!=0);

        sc.close();
    }
}
