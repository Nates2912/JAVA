/*
 * Propósito: Demonstrar o uso da estrutura 'for-each' (for aprimorado) para
 * percorrer elementos de um array de inteiros de forma simples e direta.
 */

public class ForEx7 {
    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros com 5 elementos
        int [] numeros = {10, 20, 30, 40, 50};

        // Laço for-each: percorre automaticamente do primeiro ao último item do array
        for (int numero : numeros) {
            // Imprime o valor do elemento atual da iteração
            System.out.println("Número: " + numero);
        }
    }
}