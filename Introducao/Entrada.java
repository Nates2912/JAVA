package Introducao;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome=sc.nextLine();

        System.out.print("Informe a 1ª nota: ");
        double N1=sc.nextDouble();

        System.out.print("Informe a 2ª nota: ");
        double N2=sc.nextDouble();

        double media = (N1+N2)/2;

        System.out.println("Olá "+nome+". sua média é: "+media);

        sc.close();

    }
}
