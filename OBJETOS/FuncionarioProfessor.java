
public class FuncionarioProfessor extends Funcionario {
    private String disciplina;

        public FuncionarioProfessor(String nome, double  salario, String disciplina){
        super(nome, salario);
        this.disciplina=disciplina;
    }

    public String getdisciplina(){
        return disciplina;
    }

    public void setdisciplina(String disciplina) {
        this.disciplina=disciplina;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Disciplina: "+disciplina);
    }
}
