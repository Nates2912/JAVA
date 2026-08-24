/*
 * Propósito: Exibir sequencialmente todos os números pares dentro do intervalo de 2 a 100.
 * Utiliza o avanço de 2 em 2 unidades (i += 2) no próprio laço 'for'.
 */

public class ForEx2 {
    public static void main(String[] args) {
        // Laço que inicia em 2, avança de 2 em 2 (i += 2) e para ao atingir 100
        for (int i = 2; i <= 100; i += 2) {
            // Imprime "numeros" concatenado com o valor par atual de i
            System.out.println("numeros " + i);
        }
    }
}
