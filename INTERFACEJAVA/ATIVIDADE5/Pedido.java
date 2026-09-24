public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private double valorPedido;

    public Pedido(int numeroPedido, String nomeCliente, double valorPedido) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;
    }

    public int getNumeroPedido() { return numeroPedido; }
    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public double getValorPedido() { return valorPedido; }
    public void setValorPedido(double valorPedido) { this.valorPedido = valorPedido; }

    public void mostrarDados() {
        System.out.println("Pedido nº: " + numeroPedido + " | Cliente: " + nomeCliente + " | Valor: R$ " + valorPedido);
    }
}