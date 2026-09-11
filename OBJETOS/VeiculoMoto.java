public class VeiculoMoto extends Veiculo {
    private int cilindrada;

    public VeiculoMoto(String marca, String ano, int cilindrada){
        super(marca, ano);
        this.cilindrada=cilindrada;
    }

    public int getCilindro(){
        return cilindrada;
    }

    public void setCilindro(int cilindrada) {
        this.cilindrada=cilindrada;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Mensagem: "+cilindrada);
    }
}
