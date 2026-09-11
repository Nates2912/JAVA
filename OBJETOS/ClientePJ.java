public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj=cnpj;
    }

    public String getcnpj(){
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj=cnpj;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("cnpj: "+cnpj);
    }
}
