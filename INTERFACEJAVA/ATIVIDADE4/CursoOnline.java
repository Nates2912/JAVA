public class CursoOnline extends Curso implements CursoMatricula {
    private String plataforma;
    private String codigoAcesso;

    public CursoOnline(int codigo, String nome, int cargaHoraria, double valor, String plataforma, String codigoAcesso) {
        super(codigo, nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getCodigoAcesso() { return codigoAcesso; }
    public void setCodigoAcesso(String codigoAcesso) { this.codigoAcesso = codigoAcesso; }

    @Override
    public double realizarMatricula(String nomeAluno) {
        System.out.println("Matrícula realizada para o aluno: " + nomeAluno + " no curso online " + getNome());
        return getValor();
    }

    // Sobrecarga com desconto
    public double realizarMatricula(String nomeAluno, double desconto) {
        System.out.println("Matrícula (com desconto) realizada para: " + nomeAluno + " no curso online " + getNome());
        return getValor() - desconto;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Plataforma: " + plataforma + " | Código de Acesso: " + codigoAcesso);
    }
}