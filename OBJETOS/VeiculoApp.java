import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VeiculoCarro carro = null;
        VeiculoMoto moto = null;
        Veiculo v = new Veiculo(null, null);

        System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Informe o ano de lançamento: ");
                    String ano = sc.nextLine();

                    System.out.print("Informe os cilindros, sei lá, não entendo e moto... ");
                    int cilindrada= sc.nextInt();

                    System.out.print("Informe a quantidade de portas:  ");
                    int qtdPortas= sc.nextInt();

        {VeiculoMoto m = new VeiculoMoto(marca, ano, cilindrada);
                
                    m.setMarca(marca);
                    m.setAno(ano);
                    m.setCilindro(cilindrada);
                    System.out.println("Dados da MOTO: ");
                    m.exibirDados();}
                    

        {VeiculoCarro c = new VeiculoCarro(marca, ano, 0);
                    c.setMarca(marca);
                    c.setAno(ano);
                    c.setQtdPortas(qtdPortas);
                    System.out.println("Dados do CARRO: ");
                    c.exibirDados();}

            sc.close();
    }
}
