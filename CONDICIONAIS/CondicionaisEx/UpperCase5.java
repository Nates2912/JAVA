package CONDICIONAIS.CondicionaisEx;

import java.util.Scanner;

public class UpperCase5 {
    public static void main(String[] args) {

        //com variavel normal

        /*String nome = "Anderson";
        System.out.println(nome.toUpperCase());*/



        //com scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        nome = nome.toUpperCase();
        

        sc.close();
    }
}
