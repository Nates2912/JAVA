package ROTEIRO_PRATICO.atividades;

public class Nota3 {
    public static void main(String[] args) {

        String nome = "Gideon";
        String produto = "Pelúcia";
        int quantidade = 2;
        double valor = 30.50;

        double total = quantidade * valor;

        System.out.printf("Nome: %s%nProduto: %s%nQuantidade: %d%nPreço: R$ %.2f%nTotal: R$ %.2f%n",
        nome, produto, quantidade, valor, total
        );
    }
}
