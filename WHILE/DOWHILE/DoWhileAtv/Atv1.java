package WHILE.DOWHILE.DoWhileAtv;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        do{System.out.print("Informe a senha: ");
            senha = sc.nextLine();

        }while(!senha.equals("2024"));
        
        System.out.print("Acesso permitido.");
            

        sc.close();

    }
}
