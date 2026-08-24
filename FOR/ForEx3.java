/*
 * Propósito: Iterar pelos números de 1 a 100 e utilizar a condicional 'if' com o 
 * operador de resto da divisão (%) para filtrar e imprimir apenas os números ímpares.
 */

public class ForEx3 {
    public static void main(String[] args) {
        // Laço de repetição que percorre todos os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            
            // Verifica se o número é ÍMPAR (resto da divisão por 2 é diferente de 0)
            if (i % 2 != 0) {
                // Imprime apenas os números ímpares no console
                System.out.println("os numeros sao: " + i);
            }
        }
    }
}