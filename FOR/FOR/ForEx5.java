/*
 * Propósito: Solicitar e ler 3 números inteiros informados pelo usuário via teclado, 
 * exibindo a confirmação de cada valor capturado no console.
 */

import java.util.Scanner;

public class ForEx5 {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler entradas de dados via teclado
        Scanner sc = new Scanner(System.in);

        // Laço de repetição que executa exatamente 3 vezes (de i = 1 até i = 3)
        for (int i = 1; i <= 3; i++) {
            // Exibe a mensagem pedindo o número (usando print para manter o cursor na mesma linha)
            System.out.print("Informe o número: " + i + " ");
            
            // Aguarda e lê o número inteiro digitado pelo usuário
            int numero = sc.nextInt();
            
            // Exibe a confirmação com o número informado
            System.out.println("O número informado é o: " + numero);
        }

        // Fecha o scanner para liberar os recursos do sistema
        sc.close();
    }
}