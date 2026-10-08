public class VeiculoCarro extends Veiculo {

    public VeiculoCarro(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nTipo: Carro";
    }
}