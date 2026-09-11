public class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Passa nome e idade para a classe mãe
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Imprime o nome e idade da classe mãe
        System.out.println("Raça: " + raca);
    }
}
