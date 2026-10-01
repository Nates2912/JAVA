import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoCadastro cadastro = new BancoCadastro();

        while (true) {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Buscar Conta");
            System.out.println("3 - Remover Conta");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            int opcao;
            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza de buffer
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Digite um número de opção válido.");
                sc.nextLine(); // Limpa o valor inválido
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    try {
                        System.out.print("Número da conta: ");
                        String numero = sc.nextLine();

                        System.out.print("Nome do titular: ");
                        String titular = sc.nextLine();

                        System.out.print("Saldo inicial: R$ ");
                        double saldo = sc.nextDouble();
                        sc.nextLine();

                        Banco novaConta = new Banco(numero, titular, saldo);
                        cadastro.cadastrar(novaConta);
                        System.out.println("Conta cadastrada com sucesso!");

                    } catch (ExcecaoDadoInvalido | ExcecaoRepositorio | ExcecaoElementoJaExistente e) {
                        System.out.println("Erro ao cadastrar: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Erro inesperado. Verifique os dados digitados.");
                        sc.nextLine();
                    }
                }

                case 2 -> {
                    try {
                        System.out.print("Informe o número da conta para busca: ");
                        String numeroBusca = sc.nextLine();

                        Banco contaEncontrada = cadastro.buscar(numeroBusca);
                        System.out.println("\n--- CONTA ENCONTRADA ---");
                        contaEncontrada.mostrarDados();

                    } catch (ExcecaoElementoInexistente e) {
                        System.out.println("Erro de Busca: " + e.getMessage());
                    }
                }

                case 3 -> {
                    try {
                        System.out.print("Informe o número da conta para remoção: ");
                        String numeroRemover = sc.nextLine();

                        cadastro.remover(numeroRemover);
                        System.out.println("Operação realizada com sucesso! Conta removida.");

                    } catch (ExcecaoElementoInexistente e) {
                        System.out.println("Erro ao Remover: " + e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Opção inválida! Escolha entre 1 e 4.");
            }
        }
    }
}