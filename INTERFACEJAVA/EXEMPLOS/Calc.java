public class Calc {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(10, 5));
        System.out.println(calc.somar(2,4,5));
        System.out.println(calc.somar(10.5, 5.5));
    }
}
