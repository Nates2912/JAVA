public class FormaApp {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.printf("Área do círculo: "+circulo.CalcularArea()+"\nÁrea do retângulo: "+retangulo.CalcularArea());
    }
}
