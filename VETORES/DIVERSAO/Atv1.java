
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = 5;
        String[] produtos = new String[limite];
        int[] quantidade = new int[limite];
        
        int qtd = 0; 
        int op = 0;

        while (op != 6) {
            System.out.println("\n====MENU====");
            System.out.println("1-CADASTRO");
            System.out.println("2-LISTAR");
            System.out.println("3-PESQUISAR");
            System.out.println("4-ALTERAR");
            System.out.println("5-REMOVER");
            System.out.println("6-SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n===Cadastro de produto===");
                    // olha se ainda tem espaço no limite de 5 produtos
                    if (qtd < limite) {
                        sc.nextLine(); // Limpa o buffer do scanner
                        
                        System.out.print("Digite o nome do produto: ");
                        produtos[qtd] = sc.nextLine();

                        System.out.print("Digite a quantidade em estoque: ");
                        quantidade[qtd] = sc.nextInt();

                        qtd++; // aumenta o contador de produtos cadastrados
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite máximo atingido!");
                    }
                    break;

                case 2:
                    System.out.println("\n===Lista de produtos===");
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        // mostra a índice, nome e quantidade apenas dos itens cadastrados
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Índice " + i + " - " + produtos[i] + " | Qtd: " + quantidade[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===Pesquisar produto===");
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        sc.nextLine(); // Limpa o buffer
                        System.out.print("Digite o nome do produto para buscar: ");
                        String nome = sc.nextLine();
                        boolean achou = false;

                        // procura o produto pelo nome
                        for (int i = 0; i < qtd; i++) {
                            if (produtos[i].equalsIgnoreCase(nome)) {
                                System.out.println("Encontrado! Índice " + i + " - " + produtos[i] + " | Qtd: " + quantidade[i]);
                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n===Alterar produto===");
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        sc.nextLine(); // Limpa o buffer
                        System.out.print("Digite o nome do produto a alterar: ");
                        String nome = sc.nextLine();
                        boolean achou = false;

                        // busca o produto pelo nome e deixc alterar os dados
                        for (int i = 0; i < qtd; i++) {
                            if (produtos[i].equalsIgnoreCase(nome)) {
                                System.out.print("Digite o novo nome: ");
                                produtos[i] = sc.nextLine();

                                System.out.print("Digite a nova quantidade: ");
                                quantidade[i] = sc.nextInt();

                                System.out.println("Produto alterado com sucesso!");
                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n===Remover produto===");
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        sc.nextLine(); // Limpa o buffer
                        System.out.print("Digite o nome do produto a remover: ");
                        String nome = sc.nextLine();
                        int posicao = -1;

                        // procura a posição do produto no array
                        for (int i = 0; i < qtd; i++) {
                            if (produtos[i].equalsIgnoreCase(nome)) {
                                posicao = i;
                                break;
                            }
                        }

                        if (posicao != -1) {
                            // move os elementos para a esquerda para não deixar espaço vazio
                            for (int i = posicao; i < qtd - 1; i++) {
                                produtos[i] = produtos[i + 1];
                                quantidade[i] = quantidade[i + 1];
                            }
                            
                            // Limpa a última posição e atualiza a variável qtd
                            produtos[qtd - 1] = null;
                            quantidade[qtd - 1] = 0;
                            qtd--;

                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("SAIR!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}