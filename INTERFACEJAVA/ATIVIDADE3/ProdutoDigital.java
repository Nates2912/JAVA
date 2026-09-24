public class ProdutoDigital extends Produto implements ProdutoVenda {

    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double calcularVenda(int quantidade) {
        return getPreco() * quantidade;
    }

    // Sobrecarga com desconto percentual
    public double calcularVenda(int quantidade, double descontoPercentual) {
        double subtotal = getPreco() * quantidade;
        double valorDesconto = subtotal * (descontoPercentual / 100.0);
        return subtotal - valorDesconto;
    }
}