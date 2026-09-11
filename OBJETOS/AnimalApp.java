import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criando as listas dinâmicas para os animais
        ArrayList<Cachorro> listaCachorros = new ArrayList<>();
        ArrayList<Gato> listaGatos = new ArrayList<>();
        
        int op;

        do { 
            System.out.println("\n===== CLÍNICA VETERINÁRIA =====");
            System.out.println("1 - Cadastrar Cachorro\n2 - Cadastrar Gato\n3 - Mostrar dados do Cachorro\n4 - Mostrar dados do Gato\n5 - Fazer Cachorro emitir som\n6 - Fazer Gato emitir som\n\n0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            // Validação simples para evitar que o programa quebre se digitar letra
            while (!sc.hasNextInt()) {
                System.out.print("Opção inválida. Digite um número do menu: ");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado (o famoso "Enter")

            switch (op) {
                case 1:
                    System.out.println("\n==== CADASTRAR CACHORRO ====");
                    System.out.print("Nome: ");
                    String nomeCachorro = sc.nextLine();
                    
                    System.out.print("Idade: ");
                    int idadeCachorro = sc.nextInt();
                    sc.nextLine(); // Limpa buffer
                    
                    System.out.print("Raça: ");
                    String raca = sc.nextLine();
                    
                    listaCachorros.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
                    System.out.println("Cachorro cadastrado com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\n==== CADASTRAR GATO ====");
                    System.out.print("Nome: ");
                    String nomeGato = sc.nextLine();
                    
                    System.out.print("Idade: ");
                    int idadeGato = sc.nextInt();
                    sc.nextLine(); // Limpa buffer
                    
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();
                    
                    listaGatos.add(new Gato(nomeGato, idadeGato, cor));
                    System.out.println("Gato cadastrado com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\n==== DADOS DOS CACHORROS ====");
                    if (listaCachorros.isEmpty()) {
                        System.out.println("Nenhum cachorro cadastrado.");
                    } else {
                        for (Cachorro c : listaCachorros) {
                            c.exibirInfo();
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("\n==== DADOS DOS GATOS ====");
                    if (listaGatos.isEmpty()) {
                        System.out.println("Nenhum gato cadastrado.");
                    } else {
                        for (Gato g : listaGatos) {
                            g.exibirInfo();
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("\n==== CACHORROS EMITINDO SOM ====");
                    if (listaCachorros.isEmpty()) {
                        System.out.println("Não há cachorros para fazer barulho.");
                    } else {
                        for (Cachorro c : listaCachorros) {
                            System.out.print(c.getNome() + " diz: ");
                            c.emitirSom(); // Chama o método polimórfico
                        }
                    }
                    break;
                    
                case 6:
                    System.out.println("\n==== GATOS EMITINDO SOM ====");
                    if (listaGatos.isEmpty()) {
                        System.out.println("Não há gatos para fazer barulho.");
                    } else {
                        for (Gato g : listaGatos) {
                            System.out.print(g.getNome() + " diz: ");
                            g.emitirSom(); // Chama o método polimórfico
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Escolha um número entre 0 e 6.");
            }

        } while (op != 0);
        
        sc.close();
    }
}
