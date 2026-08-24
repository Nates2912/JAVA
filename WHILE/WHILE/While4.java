package WHILE.WHILE;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        while(!senha.equals("1234")){
            System.out.print("Informe a senha: ");
            senha = sc.nextLine();
        }
        System.out.print("Acesso permitido.");


        sc.close();
    }
}
