public class FuncionarioFreelancer extends Funcionario implements FuncionarioPagamento {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioFreelancer(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        super(nome, cpf, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    // Método de sobrecarga com bônus (verifique se este método está no seu arquivo)
    public double calcularPagamento(double bonus) {
        return (horasTrabalhadas * valorPorHora) + bonus;
    }
}