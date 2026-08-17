package CONDICIONAIS.CondicionaisEx;
import java.util.Scanner;

public class Condicionais2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota: ");
        int nota = sc.nextInt();
        System.out.print("Frequência: ");
        int freq = sc.nextInt();


        //&& significa and
        if (nota>=7 && freq>=75) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        sc.close();
        
    }

}
