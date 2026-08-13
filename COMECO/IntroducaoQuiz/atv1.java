package COMECO.IntroducaoQuiz;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //ENTRADA
            System.out.println("1º Número: ");
            int num1=sc.nextInt();
            System.out.println("2º Número: ");
            int num2=sc.nextInt();

            //PROCESSAMENTO
            int adi=num1+num2;
            int sub=num1-num2;
            int mult=num1*num2;
            int div=num1/num2;

            System.out.println("Adição: "+adi);
            System.out.println("Subtração: "+sub);
            System.out.println("Multiplicação: "+mult);
            System.out.println("Divisão: "+div);
        }

    }
}
