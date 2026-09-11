public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double  salario){
        this.nome=nome;
        this.salario=salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public double  getsalario(){
        return salario;
    }

    public void setsalario(double  salario){
        this.salario=salario;
    }

    public  void exibirDados(){
        System.out.println("Nome: "+nome+" Endereço: "+salario);
}
}