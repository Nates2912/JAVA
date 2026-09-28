import java.util.InputMismatchException;
import java.util.Scanner;

public class SafebankCorrecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.00;

        System.out.println("====Bem vindo ao Safebank====\nSaldo disponível: R$ "+saldo);

        try {
            System.out.println("Digite o valor que deseja sacar:");
            double valorSaque=sc.nextDouble();

            if (valorSaque<0) {
                System.out.println("Erro: o valor do saque não pode ser negativo!");
            }else if (valorSaque > saldo) {
                System.out.println("Erro: Saldo insuficiente!");
            }else{
                saldo-=valorSaque;
                System.out.println("Saque realizado com sucesso!\n Novo saldo: R$ "+saldo);
            }
        } catch (InputMismatchException e) {
                System.out.println("Erro crítico: Entrada errada! Use apenas números e pontos.");
        } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: "+e.getMessage());
        }finally{
            System.out.println("Operação finalizada.");
        }

        sc.close();

        sc.close();
    }
}
