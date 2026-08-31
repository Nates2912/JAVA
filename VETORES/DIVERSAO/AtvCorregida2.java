
import java.util.Scanner;

public class AtvCorregida2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int maxQuartos = 5;
        final int maxReservas = 25;


        int[] numeroQuartos = new int[maxQuartos];
        int[] camasDisponiveis = new int[maxQuartos];

        String[]hospedes = new String[maxReservas];
        int[] quartoReserva = new int[maxReservas];
        
        int quantidadeQuartos;
        int totalReservas = 0;

        boolean quartosCadastrados=false;
        boolean camasCadastradas=false;

        int opcao;

        System.out.println("Informe a quantidade de quartos disponíveis (máximo de 5): ");
        quantidadeQuartos=sc.nextInt();

        while (quantidadeQuartos<1||quantidadeQuartos>5) {
            System.out.println("Quantidade inválida! Digite um valor entre 1 e 5: ");
            quantidadeQuartos=sc.nextInt();
        }

        do {
            System.out.println("1-REGISTRO DE QUARTO\n2-REGISTRO DE CAMAS\n3-RESERVAR QUARTOS\n4-CONSULTA DE RESERVAS POR QUARTO\n5-CONSULTA DE RESERVAS POR HÓSPEDE\n6-MOSTRAR RELATÓRIO GERAL\n7-ENCERRAR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            opcao=sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("==REGISTRO DE QUARTO==");
                    for (int i = 0; i < quantidadeQuartos; i++) {
                        System.out.println("Informe o número do quarto: "+(i+1)+" : ");
                        numeroQuartos[i]=sc.nextInt();
                    }

                    quartosCadastrados=true;
                    System.out.println("Quartos cadastrados com sucesso!");
                    break;

                case 2: 
                    if(!quartosCadastrados){
                        System.out.println("Cadastre primeiro o número dos quartos!");
                    }else{
                        System.out.println("==CADASTRO DE CAMAS POR QUARTO==");
                        for (int i = 0; i < quantidadeQuartos; i++) {
                            System.out.println("Informe a quantidade de camas do quarto "+numeroQuartos[i]+" : ");
                            camasDisponiveis[i]=sc.nextInt();
                            
                        }
                        camasCadastradas=true;
                        System.out.println("Quantidade de camas cadastradas com sucesso!");
                    }
                    break;

                case 3:
                    if(!quartosCadastrados){
                        System.out.println("Cadastre primeiro o número dos quartos!");
                    }else if (!camasCadastradas){
                        System.out.println("Cadastre primeiro a quantidade de camas!");
                    }else if (totalReservas>=maxReservas){
                        System.out.println("Limite máximo de reservas atingido!");
                    }else{
                        int numeroQuarto;
                        int posicaoQuarto=-1;

                        System.out.print("Informe o número do quarto para reserva: ");
                        numeroQuarto=sc.nextInt();
                        sc.next();

                        for (int i = 0; i < quantidadeQuartos; i++) {
                            if(numeroQuartos[i]==numeroQuarto) {
                                posicaoQuarto=i;
                                break;
                            }
                        }

                        if (posicaoQuarto== -1){
                            System.out.println("Esse quarto não existe!");
                        }else if(camasDisponiveis[posicaoQuarto]<=0){
                            System.out.println("Não há camas disponíveis neste quarto");
                        }else{
                            System.out.print("Informe o nome do hóspede: ");
                            hospedes[totalReservas]=sc.next();
                            quartoReserva[totalReservas]=numeroQuarto;

                            camasDisponiveis[posicaoQuarto]--;
                            totalReservas++;

                            System.out.println("Reserva realizada!");
                        }
                    }
                    break;

                case 4:
                    
                    break;
                default:
                    break;
            }

        } while (opcao!=7);




        sc.close();

    }
}

