package CONDICIONAIS.CondicionaisAtv;
import java.util.Scanner;

public class Atv3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sua idade: ");
        int idade = sc.nextInt();


        //estágios da vida
        if (idade<=12) {
            System.out.println("Infância");
        }else if (idade<18){
            System.out.println("Adolescência");
        }else if (idade<60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }

        sc.close();
        
    }

}
