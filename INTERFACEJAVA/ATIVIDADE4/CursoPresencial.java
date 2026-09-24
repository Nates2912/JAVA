public class CursoPresencial extends Curso implements CursoMatricula {
    private String sala;
    private String turno;

    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor);
        this.sala = sala;
        this.turno = turno;
    }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    @Override
    public double realizarMatricula(String nomeAluno) {
        System.out.println("Matrícula realizada para o aluno: " + nomeAluno + " no curso presencial " + getNome());
        return getValor();
    }

    // Sobrecarga com desconto
    public double realizarMatricula(String nomeAluno, double desconto) {
        System.out.println("Matrícula (com desconto) realizada para: " + nomeAluno + " no curso presencial " + getNome());
        return getValor() - desconto;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Sala: " + sala + " | Turno: " + turno);
    }
}
