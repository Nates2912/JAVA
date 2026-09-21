import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEMA DE FUNCIONÁRIOS ===");
            System.out.println("1 - Cadastrar Funcionário CLT\n2 - Cadastrar Funcionário Freelancer\n3 - Mostrar todos os cadastrados\n4 - Calcular pagamento\n5 - Calcular pagamento com bônus\n6 - Consultar dados do funcionário (por CPF)\n7 - Encerrar o programa");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Salário base mensal: R$ ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    funcionarios.add(new FuncionarioCLT(nome, cpf, salario));
                    System.out.println("Funcionário CLT cadastrado com sucesso!");
                }

                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Horas trabalhadas: ");
                    int horas = sc.nextInt();
                    System.out.print("Valor por hora: R$ ");
                    double valorHora = sc.nextDouble();
                    sc.nextLine();

                    funcionarios.add(new FuncionarioFreelancer(nome, cpf, horas, valorHora));
                    System.out.println("Funcionário Freelancer cadastrado com sucesso!");
                }

                case 3 -> {
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.println("\n--- LISTA DE FUNCIONÁRIOS ---");
                        for (int i = 0; i < funcionarios.size(); i++) {
                            System.out.println((i + 1) + " - " + funcionarios.get(i).getNome() + " (CPF: " + funcionarios.get(i).getCpf() + ")");
                        }
                    }
                }

                case 4 -> {
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                        break;
                    }
                    System.out.print("Informe a posição do funcionário (1 a " + funcionarios.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    sc.nextLine();

                    if (pos >= 0 && pos < funcionarios.size()) {
                        Funcionario f = funcionarios.get(pos);
                        if (f instanceof FuncionarioPagamento) {
                            FuncionarioPagamento p = (FuncionarioPagamento) f;
                            System.out.println("Pagamento de " + f.getNome() + ": R$ " + p.calcularPagamento());
                        }
                    } else {
                        System.out.println("Posição inválida!");
                    }
                }

                case 5 -> {
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                        break;
                    }
                    System.out.print("Informe a posição do funcionário (1 a " + funcionarios.size() + "): ");
                    int pos = sc.nextInt() - 1;
                    System.out.print("Informe o valor do bônus: R$ ");
                    double bonus = sc.nextDouble();
                    sc.nextLine();

                    if (pos >= 0 && pos < funcionarios.size()) {
                        Funcionario f = funcionarios.get(pos);
                        if (f instanceof FuncionarioCLT) {
                            FuncionarioCLT clt = (FuncionarioCLT) f;
                            System.out.println("Pagamento com bônus: R$ " + clt.calcularPagamento(bonus));
                        } else if (f instanceof FuncionarioFreelancer) {
                            FuncionarioFreelancer free = (FuncionarioFreelancer) f;
                            System.out.println("Pagamento com bônus: R$ " + free.calcularPagamento(bonus));
                        }
                    } else {
                        System.out.println("Posição inválida!");
                    }
                }

                case 6 -> {
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                        break;
                    }
                    System.out.print("Informe o CPF para consulta: ");
                    String cpfBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : funcionarios) {
                        if (f.getCpf().equalsIgnoreCase(cpfBusca)) {
                            f.mostrarDados();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado!");
                    }
                }

                case 7 -> {
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Opção inválida!");
            }
        }
    }
}