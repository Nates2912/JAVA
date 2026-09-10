public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Gideon");
        Pessoa p2 = new Pessoa(2, "Paule");
        
        //acessador
        System.out.println("Pessoa"+p1.getCodigo()+"Nome: "+p1.getNome());

        //modificador
        p1.setNome("Ada");

        System.out.println("Pessoa: "+p1.getCodigo()+"Nome: "+p1.getNome());

        
    }
}
