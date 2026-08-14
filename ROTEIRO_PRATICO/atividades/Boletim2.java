package ROTEIRO_PRATICO.atividades;

public class Boletim2 {
    public static void main(String[] args) {

        String nome = "Zhadie";
        double nota1 = 8.5;
        double nota2 = 5;

        double media=(nota1 + nota2)/2;

        System.out.printf("Aluno: %s%n1ª Nota: %.2f%n2ª Nota: %.2f%nMédia: %.2f%n",
            nome, nota1, nota2, media
        );

    }
}
