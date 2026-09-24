import java.util.ArrayList;
import java.util.Scanner;

public class PedidoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEMA DE PEDIDOS - RESTAURANTE ===");
            System.out.println("1 - Cadastrar Pedido Local\n2 - Cadastrar Pedido Delivery\n3 - Mostrar Dados do Pedido\n4 - Pagar em Dinheiro\n5 - Pagar via PIX\n6 - Pagar com Cartão\n7 - Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Número do Pedido: "); int num = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do Cliente: "); String nome = sc.nextLine();
                    System.out.print("Valor do Pedido: R$ "); double valor = sc.nextDouble(); sc.nextLine();
                    pedidos.add(new PedidoLocal(num, nome, valor));
                    System.out.println("Pedido Local cadastrado!");
                }
                case 2 -> {
                    System.out.print("Número do Pedido: "); int num = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do Cliente: "); String nome = sc.nextLine();
                    System.out.print("Valor do Pedido: R$ "); double valor = sc.nextDouble(); sc.nextLine();
                    System.out.print("Endereço: "); String end = sc.nextLine();
                    System.out.print("Taxa de Entrega: R$ "); double taxa = sc.nextDouble(); sc.nextLine();
                    pedidos.add(new PedidoDelivery(num, nome, valor, end, taxa));
                    System.out.println("Pedido Delivery cadastrado!");
                }
                case 3 -> {
                    if (pedidos.isEmpty()) { System.out.println("Nenhum pedido cadastrado."); }
                    else {
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("\n--- Pedido " + (i + 1) + " ---");
                            pedidos.get(i).mostrarDados();
                        }
                    }
                }
                case 4 -> { // Dinheiro
                    if (pedidos.isEmpty()) { System.out.println("Nenhum pedido cadastrado."); break; }
                    System.out.print("Escolha o pedido (1 a " + pedidos.size() + "): ");
                    int pos = sc.nextInt() - 1; sc.nextLine();

                    if (pos >= 0 && pos < pedidos.size()) {
                        Pedido p = pedidos.get(pos);
                        double total = (p instanceof PedidoDelivery pd) ? pd.getValorTotal() : p.getValorPedido();
                        if (p instanceof PedidoPagamento pag) {
                            pag.pagar(total);
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 5 -> { // PIX
                    if (pedidos.isEmpty()) { System.out.println("Nenhum pedido cadastrado."); break; }
                    System.out.print("Escolha o pedido (1 a " + pedidos.size() + "): ");
                    int pos = sc.nextInt() - 1; sc.nextLine();
                    System.out.print("Informe a chave PIX: "); String pix = sc.nextLine();

                    if (pos >= 0 && pos < pedidos.size()) {
                        Pedido p = pedidos.get(pos);
                        if (p instanceof PedidoLocal pl) {
                            pl.pagar(pl.getValorPedido(), pix);
                        } else if (p instanceof PedidoDelivery pd) {
                            pd.pagar(pd.getValorTotal(), pix);
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 6 -> { // Cartão
                    if (pedidos.isEmpty()) { System.out.println("Nenhum pedido cadastrado."); break; }
                    System.out.print("Escolha o pedido (1 a " + pedidos.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Quantidade de parcelas: "); int parcelas = sc.nextInt(); sc.nextLine();

                    if (pos >= 0 && pos < pedidos.size()) {
                        Pedido p = pedidos.get(pos);
                        if (p instanceof PedidoLocal pl) {
                            pl.pagar(pl.getValorPedido(), parcelas);
                        } else if (p instanceof PedidoDelivery pd) {
                            pd.pagar(pd.getValorTotal(), parcelas);
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 7 -> {
                    System.out.println("Encerrando programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}