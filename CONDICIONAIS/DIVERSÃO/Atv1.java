package CONDICIONAIS.DIVERSÃO;

import java.util.Scanner;

public class Atv1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        


       //positivo, negativo, ou nulo?
        if (numero > 0) {
            System.out.println("Positivo.");
        }else if (numero == 0){
            System.out.println("Nulo.");
        }else{
            System.out.println("Negativo");
        }

        sc.close();
    }
}
