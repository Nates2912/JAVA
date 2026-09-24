import java.util.ArrayList;
import java.util.Scanner;

public class CursoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== SISTEMA DE MATRÍCULA DE CURSOS ===");
            System.out.println("1 - Cadastrar Curso Presencial\n2 - Cadastrar Curso Online\n3 - Realizar Matrícula\n4 - Realizar Matrícula com Desconto\n5 - Mostrar Dados do Curso\n6 - Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Código: "); int cod = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do Curso: "); String nome = sc.nextLine();
                    System.out.print("Carga Horária (h): "); int ch = sc.nextInt();
                    System.out.print("Valor: R$ "); double valor = sc.nextDouble(); sc.nextLine();
                    System.out.print("Sala: "); String sala = sc.nextLine();
                    System.out.print("Turno: "); String turno = sc.nextLine();
                    cursos.add(new CursoPresencial(cod, nome, ch, valor, sala, turno));
                    System.out.println("Curso Presencial cadastrado!");
                }
                case 2 -> {
                    System.out.print("Código: "); int cod = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do Curso: "); String nome = sc.nextLine();
                    System.out.print("Carga Horária (h): "); int ch = sc.nextInt();
                    System.out.print("Valor: R$ "); double valor = sc.nextDouble(); sc.nextLine();
                    System.out.print("Plataforma: "); String plat = sc.nextLine();
                    System.out.print("Código de Acesso: "); String codAcesso = sc.nextLine();
                    cursos.add(new CursoOnline(cod, nome, ch, valor, plat, codAcesso));
                    System.out.println("Curso Online cadastrado!");
                }
                case 3 -> {
                    if (cursos.isEmpty()) { System.out.println("Nenhum curso cadastrado."); break; }
                    System.out.print("Escolha o curso (1 a " + cursos.size() + "): ");
                    int pos = sc.nextInt() - 1; sc.nextLine();
                    System.out.print("Nome do Aluno: "); String aluno = sc.nextLine();

                    if (pos >= 0 && pos < cursos.size()) {
                        Curso c = cursos.get(pos);
                        if (c instanceof CursoMatricula m) {
                            double total = m.realizarMatricula(aluno);
                            System.out.println("Valor final da matrícula: R$ " + total);
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 4 -> {
                    if (cursos.isEmpty()) { System.out.println("Nenhum curso cadastrado."); break; }
                    System.out.print("Escolha o curso (1 a " + cursos.size() + "): ");
                    int pos = sc.nextInt() - 1; sc.nextLine();
                    System.out.print("Nome do Aluno: "); String aluno = sc.nextLine();
                    System.out.print("Valor do Desconto: R$ "); double desc = sc.nextDouble(); sc.nextLine();

                    if (pos >= 0 && pos < cursos.size()) {
                        Curso c = cursos.get(pos);
                        if (c instanceof CursoPresencial cp) {
                            double total = cp.realizarMatricula(aluno, desc);
                            System.out.println("Valor com desconto: R$ " + total);
                        } else if (c instanceof CursoOnline co) {
                            double total = co.realizarMatricula(aluno, desc);
                            System.out.println("Valor com desconto: R$ " + total);
                        }
                    } else { System.out.println("Posição inválida!"); }
                }
                case 5 -> {
                    if (cursos.isEmpty()) { System.out.println("Nenhum curso cadastrado."); }
                    else {
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println("\n--- Curso " + (i + 1) + " ---");
                            cursos.get(i).mostrarDados();
                        }
                    }
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