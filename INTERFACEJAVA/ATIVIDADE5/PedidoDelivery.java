public class PedidoDelivery extends Pedido implements PedidoPagamento {
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getTaxaEntrega() { return taxaEntrega; }
    public void setTaxaEntrega(double taxaEntrega) { this.taxaEntrega = taxaEntrega; }

    public double getValorTotal() {
        return getValorPedido() + taxaEntrega;
    }

    // Pagamento em dinheiro
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro do Delivery no valor de R$ " + valor + " (incluindo taxa de entrega)");
    }

    // Sobrecarga 1: PIX
    public void pagar(double valor, String chavePix) {
        System.out.println("Pagamento via PIX do Delivery no valor de R$ " + valor + " (Chave: " + chavePix + ")");
    }

    // Sobrecarga 2: Cartão
    public void pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.println("Pagamento no cartão para o Delivery em " + parcelas + "x de R$ " + valorParcela);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Endereço: " + endereco + " | Taxa de Entrega: R$ " + taxaEntrega + " | Total com Taxa: R$ " + getValorTotal());
    }
}
