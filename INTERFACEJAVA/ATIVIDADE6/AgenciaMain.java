import java.util.Scanner;

public class AgenciaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CADASTRO INICIAL ===");
        System.out.print("Número da agência: ");
        String numAgencia = sc.nextLine();

        System.out.print("Nome da agência: ");
        String nomeAgencia = sc.nextLine();

        Agencia agencia = new Agencia(numAgencia, nomeAgencia);

        System.out.print("Número da conta: ");
        String numConta = sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();

        AgenciaContaCorrente conta = new AgenciaContaCorrente(numConta, titular, saldoInicial, agencia);

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- DADOS DA CONTA ---");
                    conta.mostrarDados();
                    break;

                case 2:
                    System.out.println("\n--- CONSULTA DE SALDO ---");
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.println("\n--- DEPÓSITO ---");
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    sc.nextLine();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.println("\n--- PAGAMENTO VIA PIX ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorPix = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Informe a chave PIX: ");
                    String chavePix = sc.nextLine();
                    conta.pagar(valorPix, chavePix);
                    break;

                case 5:
                    System.out.println("\n--- PAGAMENTO COM CARTÃO ---");
                    System.out.print("Informe o valor da compra: R$ ");
                    double valorCartao = sc.nextDouble();
                    System.out.print("Informe a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();
                    sc.nextLine();
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.println("\n--- PAGAMENTO EM DINHEIRO ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorDinheiro = sc.nextDouble();
                    sc.nextLine();
                    conta.pagar(valorDinheiro);
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        }
    }
}