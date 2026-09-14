
import java.util.ArrayList;
import java.util.Scanner; // Importação necessária para usar o ArrayList

public class FuncionarioAppFtArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Criando as listas dinâmicas. 
        // Note que não precisamos definir um limite de 100 ou gerenciar posições.
        ArrayList<FuncionarioProfessor> professores = new ArrayList<>();
        ArrayList<FuncionarioTecnico> tecnicos = new ArrayList<>();
        
        int op;

        do { 
            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Exibir Professor");
            System.out.println("4 - Exibir Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!sc.hasNextInt()) {
                System.out.print("Opção inválida. Digite um número entre 0 e 4: ");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (op) {
                case 1:
                    System.out.println("\n==== CADASTRAR PROFESSOR ====");
                    System.out.print("Nome: ");
                    String nomeProf = sc.nextLine();
                    
                    System.out.print("Salário: ");
                    double salarioProf = sc.nextDouble();
                    sc.nextLine();
                    
                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();
                    
                    // O método .add() apenas empurra o novo objeto para o final da lista!
                    professores.add(new FuncionarioProfessor(nomeProf, salarioProf, disciplina));
                    System.out.println("Professor cadastrado com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\n==== CADASTRAR TÉCNICO ====");
                    System.out.print("Nome: ");
                    String nomeTec = sc.nextLine();
                    
                    System.out.print("Salário: ");
                    double salarioTec = sc.nextDouble();
                    sc.nextLine(); 
                    
                    System.out.print("Setor: ");
                    String setor = sc.nextLine();
                    
                    // O método .add() empurra o técnico para a lista de técnicos
                    tecnicos.add(new FuncionarioTecnico(nomeTec, salarioTec, setor));
                    System.out.println("Técnico cadastrado com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\n==== LISTA DE PROFESSORES ====");
                    // O método .isEmpty() verifica se a lista está vazia
                    if (professores.isEmpty()) {
                        System.out.println("Nenhum professor cadastrado.");
                    } else {
                        // O laço "for-each": Para cada FuncionarioProfessor "p" na lista "professores"...
                        for (FuncionarioProfessor p : professores) {
                            p.exibirDados(); // Chamando o seu método!
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("\n==== LISTA DE TÉCNICOS ====");
                    if (tecnicos.isEmpty()) {
                        System.out.println("Nenhum técnico cadastrado.");
                    } else {
                        // Para cada FuncionarioTecnico "t" na lista "tecnicos"...
                        for (FuncionarioTecnico t : tecnicos) {
                            t.exibirDados(); // Chamando o seu método!
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("\nSaindo do sistema... Até logo!");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha entre 0 e 4.");
            }

        } while (op != 0);
        
        sc.close();
    }
}