package COMECO.IntroducaoQuiz;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Força: ");
        double F=sc.nextDouble();

        System.out.print("Distância: ");
        double D=sc.nextDouble();

        double trabalho = F*D;

        System.out.println("Trabalho: "+trabalho);

        sc.close();

    }
}
