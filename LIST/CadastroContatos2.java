
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("Contatos\n1-Cadastrar contato pessoal\n2-Cadastrar contato profissional\n3-Listar contato\n4-Excluir contato\n5-Alterar contato\n6-Pesquisar contato\n7-Sair\nOpção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Informe o telefone: ");
                    String numero = sc.nextLine();
                    System.out.println("Informe o parentesco: ");
                    String parentesco = sc.nextLine();
                    
                    contatos.add(new ContatoPessoal(nome, numero,parentesco));
                    System.out.println("Cadastro realizado!");
                }

                case 2 ->{
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Informe o telefone: ");
                    String numero = sc.nextLine();
                    System.out.println("Informe a empresa: ");
                    String empresa = sc.nextLine();
                    System.out.println("Informe o cargo: ");
                    String  cargo= sc.nextLine();
                    
                    contatos.add(new ContatoProfissional(nome, numero,empresa,cargo));
                    System.out.println("Cadastro realizado!");
                }

                case 3 -> {
                    System.out.println("Nomes cadastrados: ");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i+1)+" - "+contatos.get(i));
                    }
                }

                case 4 -> {
                    System.out.println("Informe o índice para remover: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    
                    if(index>0&& index<=contatos.size()){
                        contatos.remove(index-1);
                        System.out.println("Contato removido.");
                    }else{
                        System.out.println("Contato ínvalido!");
                    }
                }

                case 5 -> {
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
                }

                case 6 -> {
                    System.out.println("Informe o nome para pesquisar: ");
                    String busca = sc.nextLine();
                    
                    Boolean encontrado=false;
                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: "+contatos.get(i));
                            
                            encontrado = true;
                        }
                        if (!encontrado) {
                            System.out.println("Contato não encontrado!");
                        }
                    }
                }
                case 7 -> {sc.close();}

                default -> System.out.println("Inválido...");
            }
        }
    }
}
