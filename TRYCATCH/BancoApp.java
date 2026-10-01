import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int op =-1;
            
            while (op !=0){
                System.out.println("====MENU====\n1-Adicionar\\n2-Listar\\n3-Remover\\n0-Remover");
                System.out.print("Informe a opção");
                op=sc.nextInt();
                sc.nextLine();

                    switch (op) {
                        case 1 -> {
                            System.out.println("Informe o nome: ");
                            String nome = sc.nextLine();
                            lista.add(nome);
                            System.out.println("Adicionado com sucesso!");
                        }
                        case 2 ->{
                            if (lista.isEmpty()) {
                                System.out.println("A lista está vazia!");
                            }else{
                                System.out.println("Lista: "+lista);
                            }return;
                        }
                        case 3 -> {
                            System.out.println("Informe o índice para remover");
                            int indice=sc.nextInt();
                            sc.nextLine();
                            lista.remove(indice);
                            System.out.println("Removido com sucesso!");
                        }
                        case 0 -> {
                            System.out.println("Saindo...");
                        }
                        default -> throw new AssertionError();
                    }
                
            }
        }catch(InputMismatchException e){
            System.out.println("Erro: você deve digitar um número");
        }catch(IndexOutOfBoundsException e){
        System.err.println("Erro: Índice inválido: ");
        }catch(Exception e ){
            System.err.println("Erro inesperado: "+e.getMessage());
        }
    }
}

