package CONDICIONAIS.DIVERSÃO;
import java.util.Scanner;

public class Atv5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Senha: ");
        String senha = sc.nextLine();


       //uso de equals
        if (senha.equals("A2B4")) {
            System.out.println("PORTA ABERTA");
        }else{
            System.out.println("SENHA NÃO CONFERE");
        }

        sc.close();

    }

}
