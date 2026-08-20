package WHILE.DoWhileEx;

import java.util.Scanner;

public class DoWh4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        do{System.out.print("Informe a senha: ");
            senha = sc.nextLine();

        }while(!senha.equals("1234"));
        
        System.out.print("Acesso permitido.");
            

        sc.close();

    }
}
