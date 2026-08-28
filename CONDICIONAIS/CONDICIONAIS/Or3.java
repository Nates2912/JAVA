package CONDICIONAIS.CONDICIONAIS;
import java.util.Scanner;

public class Or3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("É estudante? 1=Sim | 0=Não: ");
        int estudante = sc.nextInt();


        //|| significa ou
        if (idade>=60 || estudante==1) {
            System.out.println("Você tem direito a desconto");
        }else{
            System.out.println("Você não tem direito a desconto");
        }

        sc.close();
        
    }

}
