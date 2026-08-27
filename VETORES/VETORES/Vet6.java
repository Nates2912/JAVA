import java.util.Scanner;

public class Vet6 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        String [] nomes;
        int [] idades  ;

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = sc.nextInt();

        nomes = new String[quantidade];
        idades = new int[quantidade];

        for(int i=0; i<quantidade; i++){
            System.out.println("Digite o nome: ");
            nomes [i] = sc.next();
            sc.nextLine(); //limpa buffer

            System.out.print("Digite a sua idade: ");
            idades [i] = sc.nextInt();
            sc.nextLine(); //limpa buffer
        }

        for(int i=0;i<quantidade;i++){
            System.out.println(nomes[i]+" - "+idades[i]+" anos");
        }

        sc.close();
    }
}
