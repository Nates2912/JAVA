package FOR.DIVERSAO;

import java.util.Scanner;

public class Vet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxAvioes = 4;
        int maxReservas =20;

        int [] numeroAviao = new int[maxAvioes];
        int [] assentosDisponiveis = new int[maxAvioes];

        String [] passageiroNome = new String[maxReservas];
        int [] numAviaoReserva = new int [maxReservas];

        int quantidadeAvioes = 0;
        int totalReservas = 0;


        boolean avioesCadastrados = false;
        boolean assentosCadastrados = false;
        

        int op;

        do {
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
                                System.out.println("Escolha: ");
                                op = sc.nextInt();
            
            sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:

                if (quantidadeAvioes > 1 || quantidadeAvioes < 4) {
                    System.out.print("Informe a quantidade de aviões disponíveis (máximo 4): ");
                    quantidadeAvioes = sc.nextInt();
                }else{
                    System.out.print("Quantidade inválida! Digite um valor entre 1 e 4: ");
                    quantidadeAvioes = sc.nextInt();
                }


                    for (int i = 0; i < quantidadeAvioes; i++) {
                        System.out.println("Cadastre o número do avião: ");
                        numeroAviao[i] = sc.nextInt();
                        sc.next();
                        
                }
                avioesCadastrados = true;
                System.out.println("Avião cadastrado com sucesso!");
                break;

                case 2:
                    if (!avioesCadastrados) {
                        System.out.println("Cadastre primeiro os números dos aviões!");
                    } else {
                        System.out.println("\n--- Cadastro de assento por avião ---");
                        for (int i = 0; i < quantidadeAvioes; i++) {
                            System.out.print("Informe a quantidade de assentos no avião " + numeroAviao[i] + ": ");
                            assentosDisponiveis[i] = sc.nextInt();
                        }
                        assentosCadastrados = true;
                        System.out.println("Quantidade de assentos cadastrada com sucesso!");
                    }
                    break;
                case 3:
                    if (totalReservas == 0) {
                        System.out.println("Nenhuma reserva foi realizada ainda!");
                    } else {
                        int numeroQuartoConsulta;
                        int posicaoAviaoConsulta = -1;
                        boolean encontrouReserva = false;

                        System.out.print("Informe o número do quarto para consulta: ");
                        numeroQuartoConsulta = sc.nextInt();

                        for (int i = 0; i < quantidadeAvioes; i++) {
                            if (numeroAviao[i] == numeroQuartoConsulta) {
                                posicaoAviaoConsulta = i;
                                break;
                            }
                        }

                        if (posicaoAviaoConsulta == -1) {
                            System.out.println("Este quarto não existe!");
                        } else {
                            System.out.println("Reservas do quarto " + numeroQuartoConsulta + ":");
                            for (int i = 0; i < totalReservas; i++) {
                                if (numAviaoReserva[i] == numeroQuartoConsulta) {
                                    System.out.println("- " + passageiroNome[i]);
                                    encontrouReserva = true;
                                }
                            }

                            if (!encontrouReserva) {
                                System.out.println("Não há reservas para este quarto!");
                            }
                        }
                    }
                    break;

                case 4:
                    if (!avioesCadastrados) {
                        System.out.println("Cadastre primeiro os quartos!");
                    } else if (!assentosCadastrados) {
                        System.out.println("Cadastre primeiro a quantidade de camas!");
                    } else if (totalReservas >= maxReservas) {
                        System.out.println("Limite máximo de reservas atingido!");
                    } else {
                        int numeroAviaos;
                        int posicaoAviao = -1;

                        System.out.print("Informe o número do quarto para reserva: ");
                        numeroAviaos = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < quantidadeAvioes; i++) {
                            if (numeroAviao[i] == numeroAviaos) {
                                posicaoAviao = i;
                                break;
                            }
                        }

                        if (posicaoAviao == -1) {
                            System.out.println("Este quarto não existe!");
                        } else if (assentosDisponiveis[posicaoAviao] <= 0) {
                            System.out.println("Não há camas disponíveis neste quarto!");
                        } else {
                            System.out.print("Informe o nome do hóspede: ");
                            passageiroNome[totalReservas] = sc.nextLine();
                            numAviaoReserva[totalReservas] = sc.nextLine()
                            // numAviaoReserva[totalReservas] = numeroAviao;

                            assentosDisponiveis[posicaoAviao]--;
                            totalReservas++;

                            System.out.println("Reserva realizada com sucesso!");
                        }
                    }
                    break;
                    
                case 8:
                    System.out.println("SAINDO...");
                    break;

                default:
                    throw new AssertionError();
            }
            

            
            
        } while (op!=8);
    }
}


















































