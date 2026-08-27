package CONDICIONAIS.CondicionaisAtv;

import java.util.Scanner;

public class Atv2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        


       //par ou impar?
        if (numero % 2==0) {
            System.out.println("Par.");
        }else{
            System.out.println("Ímpar.");
        }

        sc.close();
    }
}
