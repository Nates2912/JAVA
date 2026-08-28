package ROTEIRO_PRATICO.DIVERSÃO;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){

        System.out.print("Nome: ");
        String nome=sc.nextLine();
        System.out.print("1ª nota: ");
        double nota1=sc.nextDouble();
        System.out.print("2ª nota: ");
        double nota2=sc.nextDouble();

        double media=(nota1 + nota2)/2;

        System.out.printf("Aluno: %s%n1ª Nota: %.2f%n2ª Nota: %.2f%nMédia: %.2f%n",
            nome, nota1, nota2, media
            );
        }
    }
}
