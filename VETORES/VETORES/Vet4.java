
import java.util.Scanner;

public class Vet4 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        String[] nomes = new String[3];

        //inserir
        for(int i=0;i<nomes.length; i++){
            System.out.print("Informe o nome: ");
            nomes [i] = sc.nextLine();
        }
        
        //listando
        System.out.print("Nomes cadastrados são: ");
        for (String nome: nomes) {
            System.out.print(nome);
        sc.close();
        }
    }
}