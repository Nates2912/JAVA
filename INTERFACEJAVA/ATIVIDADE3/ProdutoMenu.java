import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEMA DE PRODUTOS E VENDAS ===");
            System.out.println("1 - Cadastrar Produto Físico\n2 - Cadastrar Produto Digital\n3 - Mostrar Dados do Produto\n4 - Realizar Venda\n5 - Realizar Venda com Desconto\n6 - Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Código: "); int cod = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Preço: R$ "); double preco = sc.nextDouble();
                    System.out.print("Frete: R$ "); double frete = sc.nextDouble();
                    sc.nextLine();
                    produtos.add(new ProdutoFisico(cod, nome, preco, frete));
                    System.out.println("Produto Físico cadastrado!");
                }
                case 2 -> {
                    System.out.print("Código: "); int cod = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Preço: R$ "); double preco = sc.nextDouble();
                    sc.nextLine();
                    produtos.add(new ProdutoDigital(cod, nome, preco));
                    System.out.println("Produto Digital cadastrado!");
                }
                case 3 -> {
                    if (produtos.isEmpty()) { System.out.println("Nenhum produto cadastrado."); }
                    else {
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("\n--- Produto " + (i + 1) + " ---");
                            produtos.get(i).mostrarDados();
                        }
                    }
                }
                case 4 -> {
                    if (produtos.isEmpty()) { System.out.println("Nenhum produto cadastrado."); break; }
                    System.out.print("Escolha o produto (1 a " + produtos.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Quantidade: "); int qtd = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 0 && pos < produtos.size()) {
                        Produto p = produtos.get(pos);
                        if (p instanceof ProdutoVenda v) {
                            System.out.println("Valor Final da Venda: R$ " + v.calcularVenda(qtd));
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 5 -> {
                    if (produtos.isEmpty()) { System.out.println("Nenhum produto cadastrado."); break; }
                    System.out.print("Escolha o produto (1 a " + produtos.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Quantidade: "); int qtd = sc.nextInt();
                    System.out.print("Desconto (%): "); double desc = sc.nextDouble();
                    sc.nextLine();

                    if (pos >= 0 && pos < produtos.size()) {
                        Produto p = produtos.get(pos);
                        if (p instanceof ProdutoFisico pf) {
                            System.out.println("Valor Final com Desconto: R$ " + pf.calcularVenda(qtd, desc));
                        } else if (p instanceof ProdutoDigital pd) {
                            System.out.println("Valor Final com Desconto: R$ " + pd.calcularVenda(qtd, desc));
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 6 -> {
                    System.out.println("Encerrando programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}