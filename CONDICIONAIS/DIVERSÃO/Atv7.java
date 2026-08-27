package CONDICIONAIS.CondicionaisAtv;

import java.util.Scanner;

public class Atv7 {
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){


            //precos!
            int vermelho=40;
            int amarelo = 30;
            int azul = 20;
            int verde = 10;


            System.out.println("Bem vindo(a)! As opções de CD são: VERMELHO, AMARELO, VERDE, AZUL");
            System.out.print("Escolha: ");
            String operador=sc.next().toUpperCase();
            
        
                if (operador.equals("VERMELHO")) {

                    System.out.printf("Preço: R$"+vermelho);
        
                }else if (operador.equals("AMARELO")) {
                    System.out.printf("Preço: R$"+amarelo);
        
                }else if (operador.equals("VERDE")) {
                    System.out.printf("Preço: R$"+azul);

                }else if (operador.equals("AZUL")) {
                    System.out.printf("Preço: R$"+verde);

                }else{
                    System.out.println("Cor não encontrada.");
        
                }

            sc.close();


        }
    }
}
