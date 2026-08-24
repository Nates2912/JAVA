package WHILE.DIVERSÃO;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prof = "";

        while(!prof.equals("Anderson")){
            System.out.print("Informe o professor: ");
            prof = sc.nextLine();
        }
        System.out.print("Acertou!");


        sc.close();
    }
}

