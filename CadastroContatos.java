
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("Contatos\n1-Cadastrar contato\n2-Listar contato\n3-Excluir contato\n4-Alterar contato\n5-Pesquisar contato\n6-Sair\nOpção: "); 
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                        String nome = sc.nextLine();
                    System.out.println("Informe o telefone: ");
                        String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Cadastro realizado!");
                    
                break;

                case 2:
                    System.out.println("Nomes cadastrados: ");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i+1)+" - "+contatos.get(i));
                    }
                break;

                case 3:
                    System.out.println("Informe o índice para remover: ");
                        int index = sc.nextInt();
                        sc.nextLine();

                    if(index>0&& index<=contatos.size()){
                        contatos.remove(index-1);
                        System.out.println("Contato removido.");
                    }else{
                        System.out.println("Contato ínvalido!");
                    }
                break;
                    case 4:
                        System.out.println("Informe o número para alterar: ");
                        int pos = sc.nextInt();
                        sc.nextLine();

                        if (pos>0 && pos<= contatos.size()) {
                            System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.println("Novo número: ");
                            String novoNumero = sc.nextLine();

                            contatos.get(pos -1).setNome(novoNome);
                            contatos.get(pos -1).setNumero(novoNumero);
                            System.out.println("Contato alterado!");
                        }else{
                            System.out.println("Contato ínvalido!");
                        }
                        break;

                    case 5:
                        break;

                default:
                    throw new AssertionError();
            }
        }


        sc.close();
    }
}
