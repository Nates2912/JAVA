package CONDICIONAIS.DIVERSÃO;

import java.util.Scanner;

public class Atv6 {
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("1ª Número (operando): ");
            int operando1=sc.nextInt();

            System.out.print("2º Número (operando): ");
            int operando2=sc.nextInt();

            System.out.print("Escolha entre (+ - * /): ");
            String operador=sc.next();

                 //operaçoes!
        
                if (operador.equals("+")) {
                    int operacao= (operando1 + operando2);
                    System.out.printf("Resultado: "+operacao);
        
                }else if (operador.equals("-")) {
                    int operacao= (operando1 - operando2);
                    System.out.printf("Resultado: "+operacao);
        
                }else if (operador.equals("*")) {
                    int operacao= (operando1 * operando2);
                    System.out.printf("Resultado: "+operacao);

                }else if (operador.equals("/")) {
                    int operacao= (operando1 / operando2);
                    System.out.printf("Resultado: "+operacao);

                }else{
                    System.out.println("Operador Inválido.");
        
                }

            sc.close();


        }
    }
}
