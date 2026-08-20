package WhileDowhile.DIVERSÃO;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 1;
        
        while(numero>=0) {
            System.out.print("Informe o número: ");
            numero = sc.nextInt();
        }

        sc.close();
    }
}
