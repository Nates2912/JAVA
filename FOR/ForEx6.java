/*
 * Propósito: Gerar e exibir no console a tabuada completa de multiplicação (de 1 a 10) 
 * para qualquer número fornecido pelo usuário via Scanner.
 */

import java.util.Scanner;

public class ForEx6 {
    
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler entradas de dados via teclado
        Scanner sc = new Scanner(System.in);
        
        // Solicita que o usuário informe o número desejado para a tabuada
        System.out.println("INFORME O NÚMERO: ");
        int numero = sc.nextInt();

        // Laço de repetição que vai de 1 a 10 para servir como multiplicador
        for (int i = 1; i <= 10; i++) {
            // Exibe a conta formatada e o resultado (ex: 5 X 1 = 5)
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

        // Fecha o scanner para liberar os recursos do sistema
        sc.close();
    }
}
