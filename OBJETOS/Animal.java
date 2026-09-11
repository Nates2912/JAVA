public class Animal {
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos Get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para emitir som (será sobrescrito nas filhas)
    public void emitirSom() {
        System.out.println("Som de animal indefinido...");
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}
