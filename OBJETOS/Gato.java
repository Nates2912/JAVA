public class Gato extends Animal {
    private String cor;

    // Construtor
    public Gato(String nome, int idade, String cor) {
        super(nome, idade); // Passa nome e idade para a classe mãe
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Imprime o nome e idade da classe mãe
        System.out.println("Cor: " + cor);
    }
}
