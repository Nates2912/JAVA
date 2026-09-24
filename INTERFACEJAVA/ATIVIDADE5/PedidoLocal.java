public class PedidoLocal extends Pedido implements PedidoPagamento {

    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        super(numeroPedido, nomeCliente, valorPedido);
    }

    // Pagamento em dinheiro
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro realizado no valor de R$ " + valor);
    }

    // Sobrecarga 1: PIX
    public void pagar(double valor, String chavePix) {
        System.out.println("Pagamento via PIX realizado no valor de R$ " + valor + " (Chave: " + chavePix + ")");
    }

    // Sobrecarga 2: Cartão
    public void pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento com cartão em " + parcelas + "x de R$ " + valorParcela + " (Total: R$ " + valor + ")");
    }
}