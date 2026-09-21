public class FuncionarioCLT extends Funcionario implements FuncionarioPagamento {

    public FuncionarioCLT(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularPagamento() {
        return getSalario();
    }

    // Sobrecarga com bônus
    public double calcularPagamento(double bonus) {
        return getSalario() + bonus;
    }

    @Override
    public void mostrarDados() {
    super.mostrarDados();
    System.out.println("Tipo: CLT");
}
}