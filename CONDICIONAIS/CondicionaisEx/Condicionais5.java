package CONDICIONAIS.CondicionaisEx;
import java.util.Scanner;

public class Condicionais5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();


       //uso de equals
        if ( nome.equals("Raquel") && senha.equals("1234")) {
            System.out.println("Acesso liberado");
        }else if (nome.equals("Maria") && senha.equals("4321")){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }

        sc.close();

    }

}
