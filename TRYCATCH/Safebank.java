
import java.util.InputMismatchException;
import java.util.Scanner;

public class Safebank {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double dinheiroConta = 1000;

            try {
                
                System.out.print("Saque: ");
                int saque = sc.nextInt();

                if( saque <= 0) {
                    System.err.println("É imposivel sacar um número negativo.");
                } else if (saque >dinheiroConta)
                    System.out.println("Você não tem dinheiro o suficiente!");
                else{
                    double restante = dinheiroConta-=saque;
                    System.out.printf("Dinheiro restante: "+restante);
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digitação errada");
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é posivel dividir por zero!");
            }
            sc.close();
        }
    }
}
