public class FuncionarioTecnico extends Funcionario{
    private String setor;

        public FuncionarioTecnico(String nome, double  salario, String setor){
        super(nome, salario);
        this.setor=setor;
    }

    public String getsetor(){
        return setor;
    }

    public void setsetor(String setor) {
        this.setor=setor;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: "+setor);
    }
}
