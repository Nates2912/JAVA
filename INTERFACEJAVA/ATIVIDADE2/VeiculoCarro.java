public class VeiculoCarro extends Veiculo implements VeiculoAluguel {

    public VeiculoCarro(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        return getValorDiaria() * dias;
    }

    // Sobrecarga de método com desconto
    public double calcularAluguel(int dias, double desconto) {
        return (getValorDiaria() * dias) - desconto;
    }
}
