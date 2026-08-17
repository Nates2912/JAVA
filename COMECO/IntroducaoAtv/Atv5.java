package COMECO.IntroducaoAtv;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso=sc.nextDouble();

        System.out.print("Altura: ");
        double altura=sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: "+imc);

        sc.close();

    }
}
