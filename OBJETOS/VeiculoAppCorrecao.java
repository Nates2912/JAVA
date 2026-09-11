import java.util.Scanner;

public class VeiculoAppCorrecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VeiculoCarro carro = null;
        VeiculoMoto moto = null;

        int op;
        do {
            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Carro\n2 - Cadastrar Moto\n3 - Exibir dados do carro\n4 - Exibir dados da moto\n0 - Sair\n");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n==== CADASTRAR CARRO ====");
                    System.out.print("Marca do carro: ");
                    String marcaCarro = sc.nextLine();
                    
                    System.out.print("Ano: ");
                    String anoCarro = sc.nextLine();
                    sc.nextLine();
                    
                    System.out.print("Quantidade de portas: ");
                    int portas = sc.nextInt();
                    carro=new VeiculoCarro(marcaCarro, anoCarro, portas);
                    break;
                case 2:
                    System.out.println("\n==== CADASTRAR CARRO ====");
                    System.out.print("Marca da moto: ");
                    String marcaMoto = sc.nextLine();
                    
                    System.out.print("Ano: ");
                    String anoMoto = sc.nextLine();
                    sc.nextLine();
                    
                    System.out.print("Informe os cilindros, sei lá, não entendo e moto... ");
                    int cilindrada = sc.nextInt();
                    moto=new VeiculoMoto(marcaMoto, anoMoto, cilindrada);
                    break;
                case 3:
                    System.out.println("====DADOS DO CARRO====");
                    if(carro!=null){
                        carro.exibirDados();
                    }else{
                        System.out.println("Nenhum carro cadastrado!");
                    }
                    break;
                case 4:
                    System.out.println("====DADOS DA MOTO====");
                    if(moto!=null){
                        moto.exibirDados();
                    }else{
                        System.out.println("Nenhuma moto cadastrada!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op!=0);

    sc.close();
    }
}
