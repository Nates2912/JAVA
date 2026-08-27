package ROTEIRO_PRATICO.RoteiroAtv;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Nome: ");
        String nome=sc.nextLine();
        System.out.print("Produto: ");
        String produto=sc.nextLine();
        System.out.print("Quantidade: ");
        int quantidade=sc.nextInt();
        System.out.print("Preço: ");
        double valor=sc.nextDouble();

        double total = quantidade * valor;

        System.out.printf("Nome: %s%nProduto: %s%nQuantidade: %d%nPreço: R$ %.2f%nTotal: R$ %.2f%n",
        nome, produto, quantidade, valor, total
        );
    }
    }
}
