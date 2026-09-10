import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Loja j = new Loja(0, 0, null);

        System.out.println("Informe o preço: ");
        j.setPreco(sc.nextDouble());

        System.out.println("Informe a quantidade: ");
        j.setQuantidade(sc.nextInt());
        System.out.println("Informe o ano de nome: ");
        j.setNome(sc.nextLine());

        System.out.println("Preço: "+j.getPreco()+"\nQuantidade: "+j.getQuantidade()+"\nNome: "+j.getNome());

        sc.close();
    }
}
