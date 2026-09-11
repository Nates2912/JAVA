public class VeiculoCarro extends Veiculo{
    private int qtdPortas;

    public VeiculoCarro(String marca, String ano, int qtdPortas){
        super(marca, ano);
        this.qtdPortas=qtdPortas;
    }

    public int getQtdPortas(){
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas=qtdPortas;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de portas: "+qtdPortas);
    }
}
