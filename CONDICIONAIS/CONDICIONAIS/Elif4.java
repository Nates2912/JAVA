package CONDICIONAIS.CONDICIONAIS;
import java.util.Scanner;

public class Elif4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();


        //else if é o elif do java
        if (idade<=12) {
            System.out.println("Criança");
        }else if (idade<18){
            System.out.println("Adolescente");
        }else if (idade<60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        sc.close();
        
    }

}
