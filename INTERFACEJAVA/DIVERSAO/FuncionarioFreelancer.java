public class FuncionarioFreelancer extends Funcionario implements Pagamento{
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioFreelancer(String nome, String cpf, double salario, int horasTrabalhadas, double valorPorHora){
        super(nome, cpf, 0);
        this.horasTrabalhadas=horasTrabalhadas;
        this.valorPorHora=valorPorHora;

        }

        public int gethorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void sethorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas=horasTrabalhadas;
    }
        public double getValorPorHora(){
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora=valorPorHora;
    }

    
}
