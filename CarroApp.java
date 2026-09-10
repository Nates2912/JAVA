
import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro c = new Carro(null, null, 0);

        System.out.println("Informe a marca: ");
        c.setMarca(sc.nextLine());

        System.out.println("Informe o modelo: ");
        c.setMarca(sc.nextLine());
        System.out.println("Informe o ano de fabricação: ");
        c.setAnofabricacao(sc.nextInt());

        System.out.println("A marca: "+c.getMarca()+"\nO modelo: "+c.getModelo()+"\nO ano de fabricação: "+c.getAnofabricacao());

        sc.close();
    }
}
