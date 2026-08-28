package CONDICIONAIS.DIVERSÃO;
import java.util.Scanner;

public class Atv4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sua idade: ");
        int idade = sc.nextInt();


        //Maior ou menor de idade?
        if (idade>=18) {
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }

        sc.close();
        
    }

}
