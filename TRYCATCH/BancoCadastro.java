import java.util.ArrayList;

public class BancoCadastro {
    private final ArrayList<Banco> contas = new ArrayList<>();
    private final int LIMITE_MAXIMO = 100;

    public void cadastrar(Banco conta) throws ExcecaoRepositorio, ExcecaoElementoJaExistente {
        if (contas.size() >= LIMITE_MAXIMO) {
            throw new ExcecaoRepositorio("Limite máximo de 100 contas atingido.");
        }
        for (Banco b : contas) {
            if (b.getNumeroConta().equalsIgnoreCase(conta.getNumeroConta())) {
                throw new ExcecaoElementoJaExistente("Já existe uma conta cadastrada com o número: " + conta.getNumeroConta());
            }
        }
        contas.add(conta);
    }

    public Banco buscar(String numeroConta) throws ExcecaoElementoInexistente {
        for (Banco b : contas) {
            if (b.getNumeroConta().equalsIgnoreCase(numeroConta)) {
                return b;
            }
        }
        throw new ExcecaoElementoInexistente("A conta número " + numeroConta + " não foi encontrada.");
    }

    public void remover(String numeroConta) throws ExcecaoElementoInexistente {
        Banco conta = buscar(numeroConta);
        contas.remove(conta);
    }
}