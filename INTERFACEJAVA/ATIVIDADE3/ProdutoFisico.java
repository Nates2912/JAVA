public class ProdutoFisico extends Produto implements ProdutoVenda {
    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        super(codigo, nome, preco);
        this.frete = frete;
    }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    @Override
    public double calcularVenda(int quantidade) {
        return (getPreco() * quantidade) + frete;
    }

    // Sobrecarga com desconto percentual (ex: 10 para 10%)
    public double calcularVenda(int quantidade, double descontoPercentual) {
        double subtotal = getPreco() * quantidade;
        double valorDesconto = subtotal * (descontoPercentual / 100.0);
        return (subtotal - valorDesconto) + frete;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Frete: R$ " + frete);
    }
}
