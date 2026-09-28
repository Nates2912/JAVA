
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            if(nome.trim().isEmpty()){
                throw new Exception("O campo não pode estar vazio");
            }
        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
