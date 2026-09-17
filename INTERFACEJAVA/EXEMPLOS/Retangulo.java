public class Retangulo {
    
    private double comprimento;
    private  double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public double CalcularArea(){
        return comprimento*largura;
    }
}
