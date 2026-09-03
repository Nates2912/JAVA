import java.util.Scanner;

public class Avaliacao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays para armazenar os dados
        int[] avioes = new int[4];
        int[] assentos = new int[4];
        String[] passageiros = new String[20];
        int[] reservaAviao = new int[20];

        // Variáveis de controle
        int qtdAvioesCadastrados = 0;
        int qtdReservasRealizadas = 0;
        boolean assentosCadastrados = false;

        int opcao = 0;

        while (opcao != 8) {
            System.out.println("=========================================\r\n" + //
                                "      SWEET FLIGHT – SISTEMA DE RESERVAS\r\n" + //
                                "=========================================\r\n" + //
                                "1 - Cadastrar aviões\r\n" + //
                                "2 - Cadastrar quantidade de assentos\r\n" + //
                                "3 - Listar aviões\r\n" + //
                                "4 - Realizar reserva\r\n" +
                                "5 - Consultar reservas de um avião\r\n" +
                                "6 - Pesquisar passageiro\r\n" +
                                "7 - Mostrar resumo\r\n" +
                                "8 - Sair");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao < 1 || opcao > 8) {
                System.out.println("Opção inválida!");
                continue;
            }

            switch (opcao) {
                case 1:

                    //1-CADASTRANDO OS AVIõES

                    int qtd = 0;
                    while (qtd < 1 || qtd > 4) {
                        System.out.print("Quantos aviões deseja cadastrar (1 a 4)? ");
                        qtd = scanner.nextInt();
                        if (qtd < 1 || qtd > 4) {
                            System.out.println("Quantidade inválida! Somente valores entre 1 e 4 são aceitos.");
                        }
                    }

                    qtdAvioesCadastrados = qtd;

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        boolean numeroRepetido;
                        int numeroAviao;
                        
                        do {
                            numeroRepetido = false;
                            System.out.print("Informe o número do avião " + (i + 1) + ": ");
                            numeroAviao = scanner.nextInt();

                            
                            for (int j = 0; j < i; j++) {
                                if (avioes[j] == numeroAviao) {
                                    System.out.println("Este número de avião já está cadastrado! Tente outro.");
                                    numeroRepetido = true;
                                    break;
                                }
                            }
                        } while (numeroRepetido);
                        
                        avioes[i] = numeroAviao;
                    }
                    System.out.println("Aviões cadastrados com sucesso!");
                    break;

                    
                case 2:

                //2-CADASTRAR QUANtIDADE de ASSENTOS
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado. Por favor, cadastre os aviões primeiro.");
                    } else {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            int qtdAssentos = -1;
                            while (qtdAssentos < 0 || qtdAssentos > 20) {
                                System.out.print("Informe a quantidade de assentos disponíveis para o avião " + avioes[i] + " (0 a 20): ");
                                qtdAssentos = scanner.nextInt();
                                if (qtdAssentos < 0 || qtdAssentos > 20) {
                                    System.out.println("Quantidade inválida! Deve ser entre 0 e 20.");
                                }
                            }
                            assentos[i] = qtdAssentos;
                        }
                        assentosCadastrados = true;
                        System.out.println("Assentos cadastrados com sucesso!");
                    }
                    break;

                case 3:
                    //3-LISTAGEM DE AVIÕES
                    
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado.");
                    } else if (!assentosCadastrados) {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            System.out.println("Avião: " + avioes[i] + " | Assentos disponíveis: (Não cadastrados)");
                        }
                    } else {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            System.out.println("Avião: " + avioes[i] + " | Assentos disponíveis: " + assentos[i]);
                        }
                    }
                    break;

                case 4:

                    //4 - REALIZAR RESERVA !
                    if (qtdAvioesCadastrados == 0 || !assentosCadastrados) {
                        System.out.println("Aviões ou assentos ainda não foram completamente cadastrados!");
                        break;
                    }
                    if (qtdReservasRealizadas >= 20) {
                        System.out.println("O limite de 20 reservas já foi atingido!");
                        break;
                    }

                    System.out.print("Informe o número do avião desejado: ");
                    int numAviaoReserva = scanner.nextInt();
                    scanner.nextLine();

                    int indexAviao = -1;
                    
                
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (avioes[i] == numAviaoReserva) {
                            indexAviao = i;
                            break;
                        }
                    }

                    if (indexAviao == -1) {
                        System.out.println("Este avião não existe!");
                    } else if (assentos[indexAviao] == 0) {
                        System.out.println("Não há assentos disponíveis para este avião!");
                    } else {
                        String nomePassageiro = "";
                        while (nomePassageiro.trim().isEmpty()) {
                            System.out.print("Informe o nome do passageiro: ");
                            nomePassageiro = scanner.nextLine();
                            if (nomePassageiro.trim().isEmpty()) {
                                System.out.println("O nome não pode ficar vazio!");
                            }
                        }

                        passageiros[qtdReservasRealizadas] = nomePassageiro;
                        reservaAviao[qtdReservasRealizadas] = numAviaoReserva;

                        assentos[indexAviao]--;
                        qtdReservasRealizadas++;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 5:

                    //5 - CONSULTAR RESERVAS DE UM AVIÃO !

                    System.out.print("Informe o número do avião: ");
                    int numAviaoConsulta = scanner.nextInt();
                    
                    boolean aviaoExiste = false;
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (avioes[i] == numAviaoConsulta) {
                            aviaoExiste = true;
                            break;
                        }
                    }

                    if (!aviaoExiste) {
                        System.out.println("Este avião não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        System.out.println("Passageiros com reserva no avião " + numAviaoConsulta + ":");
                        
                        for (int i = 0; i < qtdReservasRealizadas; i++) {
                            if (reservaAviao[i] == numAviaoConsulta) {
                                System.out.println("- " + passageiros[i]);
                                encontrouReserva = true;
                            }
                        }

                        if (!encontrouReserva) {
                            System.out.println("Não há reservas realizadas para este avião!");
                        }
                    }
                    break;

                case 6:

                //6 -PESQUISA DE PASSAGEIRO!!!!
                    System.out.print("Informe o nome do passageiro: ");
                    String nomeBusca = scanner.nextLine();

                    boolean encontrouPassageiro = false;
                    for (int i = 0; i < qtdReservasRealizadas; i++) {
                        if (passageiros[i].equalsIgnoreCase(nomeBusca)) {
                            if (!encontrouPassageiro) {
                                System.out.println("Reservas encontradas para " + passageiros[i] + ":");
                            }
                            System.out.println("Avião: " + reservaAviao[i]);
                            encontrouPassageiro = true;
                        }
                    }

                    if (!encontrouPassageiro) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;

                case 7:
                    //7 -RESUMO DE TUDO
                    int totalAssentos = 0;
                    int avioesComAssentos = 0;
                    int avioesSemAssentos = 0;
                    int maxAssentos = -1;
                    int aviaoMaisAssentos = -1;

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        totalAssentos += assentos[i];
                        
                        if (assentos[i] > 0) {
                            avioesComAssentos++;
                        } else {
                            avioesSemAssentos++;
                        }

                        if (assentos[i] > maxAssentos) {
                            maxAssentos = assentos[i];
                            aviaoMaisAssentos = avioes[i];
                        }
                    }

                    System.out.println("\n--- RESUMO DO SISTEMA ---");
                    System.out.println("Aviões cadastrados: " + qtdAvioesCadastrados);
                    System.out.println("Total de reservas realizadas: " + qtdReservasRealizadas);
                    System.out.println("Total de assentos disponíveis (geral): " + totalAssentos);
                    System.out.println("Aviões com assentos disponíveis: " + avioesComAssentos);
                    System.out.println("Aviões sem assentos disponíveis: " + avioesSemAssentos);
                    
                    if (qtdAvioesCadastrados > 0 && assentosCadastrados) {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: " + aviaoMaisAssentos + " (" + maxAssentos + " assentos)");
                    } else {
                        System.out.println("Avião com maior quantidade de assentos disponíveis: Nenhum");
                    }
                    break;

                case 8:
                    //SAINDO
                    System.out.println("Sistema encerrado. FUI!! Tu NUNCA vai me ver usando esse sistema denovo!!!");
                    break;
            }
        }
        
        scanner.close();
    }
}
