/*
 * Propósito: Interagir com o usuário solicitando a digitação de um número por 34 vezes.
 * O laço avança com passos de 3 em 3 unidades (i += 3) partindo do 1 até o 100.
 */

import java.util.Scanner;

public class ForEx4 {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler entradas via teclado
        Scanner sc = new Scanner(System.in);

        // Laço que inicia em 1 e incrementa de 3 em 3 até chegar em 100 (executa 34 vezes)
        for (int i = 1; i <= 100; i += 3) {
            // Imprime o texto pedindo o número, exibindo o contador 'i' atual
            System.out.println("Informe o número: " + i);
            
            // Aguarda e lê o número inteiro digitado pelo usuário
            int numero = sc.nextInt();
            
            // Exibe a mensagem confirmando o número que o usuário digitou
            System.out.println("O número informado é o: " + numero);
        }

        // Fecha o scanner para liberar o recurso de memória
        sc.close();
    }
}