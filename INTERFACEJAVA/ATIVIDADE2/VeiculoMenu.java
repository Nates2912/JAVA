import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEMA DE LOCAÇÃO DE VEÍCULOS ===");
            System.out.println("1 - Cadastrar Carro\n2 - Cadastrar Moto\n3 - Mostrar Veículos\n4 - Calcular Aluguel\n5 - Calcular Aluguel com Desconto\n6 - Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Placa: "); String placa = sc.nextLine();
                    System.out.print("Modelo: "); String modelo = sc.nextLine();
                    System.out.print("Ano: "); int ano = sc.nextInt();
                    System.out.print("Valor da Diária: R$ "); double diaria = sc.nextDouble();
                    sc.nextLine();
                    veiculos.add(new VeiculoCarro(placa, modelo, ano, diaria));
                    System.out.println("Carro cadastrado!");
                }
                case 2 -> {
                    System.out.print("Placa: "); String placa = sc.nextLine();
                    System.out.print("Modelo: "); String modelo = sc.nextLine();
                    System.out.print("Ano: "); int ano = sc.nextInt();
                    System.out.print("Valor da Diária: R$ "); double diaria = sc.nextDouble();
                    sc.nextLine();
                    veiculos.add(new VeiculoMoto(placa, modelo, ano, diaria));
                    System.out.println("Moto cadastrada!");
                }
                case 3 -> {
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        for (int i = 0; i < veiculos.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            veiculos.get(i).mostrarDados();
                        }
                    }
                }
                case 4 -> {
                    if (veiculos.isEmpty()) { System.out.println("Nenhum veículo cadastrado."); break; }
                    System.out.print("Escolha o veículo (1 a " + veiculos.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Quantidade de dias: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 0 && pos < veiculos.size()) {
                        Veiculo v = veiculos.get(pos);
                        if (v instanceof VeiculoAluguel a) {
                            System.out.println("Valor total do aluguel: R$ " + a.calcularAluguel(dias));
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 5 -> {
                    if (veiculos.isEmpty()) { System.out.println("Nenhum veículo cadastrado."); break; }
                    System.out.print("Escolha o veículo (1 a " + veiculos.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Quantidade de dias: "); int dias = sc.nextInt();
                    System.out.print("Valor do desconto: R$ "); double desconto = sc.nextDouble();
                    sc.nextLine();

                    if (pos >= 0 && pos < veiculos.size()) {
                        Veiculo v = veiculos.get(pos);
                        if (v instanceof VeiculoCarro c) {
                            System.out.println("Valor com desconto: R$ " + c.calcularAluguel(dias, desconto));
                        } else if (v instanceof VeiculoMoto m) {
                            System.out.println("Valor com desconto: R$ " + m.calcularAluguel(dias, desconto));
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 6 -> {
                    System.out.println("Encerrando programa...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
