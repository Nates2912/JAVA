package ROTEIRO_PRATICO.atividades;

import java.util.Scanner;

public class Produto1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){


        System.out.print("Nome: ");
        String produto=sc.nextLine();
        System.out.print("Quantidade: ");
        int quantidade=sc.nextInt();
        System.out.print("Preço: ");
        double preco=sc.nextDouble();

        System.out.printf( "Produto: %s%nQuantidade: %d%nPreço: R$ %.2fn",
        produto, quantidade, preco
        );
    }
    }

}
