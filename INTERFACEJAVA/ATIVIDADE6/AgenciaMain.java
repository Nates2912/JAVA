import java.util.Scanner;

public class AgenciaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CADASTRO DA AGÊNCIA ===");
        System.out.print("Número da agência: ");
        String numAgencia = sc.nextLine();

        System.out.print("Nome da agência: ");
        String nomeAgencia = sc.nextLine();

        Agencia agencia = new Agencia(numAgencia, nomeAgencia);

        
        System.out.println("=== CADASTRO DA CONTA ===");
        System.out.print("Número da conta: ");
        String numConta = sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = sc.nextDouble();
        sc.nextLine();

        AgenciaContaCorrente conta = new AgenciaContaCorrente(numConta, titular, saldoInicial, agencia);

        while (true) {
            System.out.println("\n=== BANCO MASTER ===");
            System.out.println("1 - Mostrar dados da conta\n2 - Consultar saldo\n3 - Depositar\n4 - Pagar com PIX\n5 - Pagar com cartão\n6 - Pagar em dinheiro\n0 - Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n--- DADOS DA CONTA ---");
                    conta.mostrarDados();
                }

                case 2 -> {
                    System.out.println("\n--- CONSULTA DE SALDO ---");
                    conta.consultarSaldo();
                }

                case 3 -> {
                    System.out.println("\n--- DEPÓSITO ---");
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    sc.nextLine();
                    conta.depositar(valorDeposito);
                }

                case 4 -> {
                    System.out.println("\n--- PAGAMENTO VIA PIX ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorPix = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a chave PIX: ");
                    String chavePix = sc.nextLine();

                    conta.pagar(valorPix, chavePix);
                }

                case 5 -> {
                    System.out.println("\n--- PAGAMENTO COM CARTÃO ---");
                    System.out.print("Informe o valor da compra: R$ ");
                    double valorCartao = sc.nextDouble();

                    System.out.print("Informe a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();
                    sc.nextLine();

                    conta.pagar(valorCartao, parcelas);
                }

                case 6 -> {
                    System.out.println("\n--- PAGAMENTO EM DINHEIRO ---");
                    System.out.print("Informe o valor do pagamento: R$ ");
                    double valorDinheiro = sc.nextDouble();
                    sc.nextLine();
                    
                    conta.pagar(valorDinheiro);
                }

                case 0 -> {
                    System.out.println("\nEncerrando o sistema...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Opção inválida! Escolha novamente.");
            }
        }
    }
}