// Crie um programa em Java que gerencie um conjunto de números utilizando um array de tamanho fixo. O programa deve apresentar um menu interativo com as seguintes opções:

// -Inserir número: O usuário poderá adicionar um número ao array, desde que ainda haja espaço disponível. Caso o array esteja cheio, o programa deve exibir uma mensagem informando que a inserção não é possível.  

// -Listar números: Exibir todos os números armazenados no array, junto com seus respectivos índices. Caso o array esteja vazio, informar que não há números cadastrados.

// -Remover número: O usuário informará um índice e o programa removerá o número correspondente. Os números subsequentes devem ser deslocados para preencher o espaço deixado pelo número removido. Se o índice informado for inválido ou o array estiver vazio, uma mensagem de erro deve ser exibida.

// -Sair: Finalizar o programa.

import java.util.Scanner;

public class Atv1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    

    //constraint
    final int limite = 5;
    
    int[] maxnumeros = new int[limite];

        
        int ref = 0;
        int op;

    do{
    System.out.println("\n====MENU====");
    System.out.println("1-ADICIONAR NÚMERO\n2-LISTAR NÚMEROS\n3-REMOVER NÚMERO\n4-SAIR");
    System.out.print("ESCOLHA A OPÇÃO: ");
    op = sc.nextInt();
    sc.nextLine();


    switch (op) {
        case 1:
            
            if (ref==limite){
                System.out.println("INSERÇÃO FALHOU! NÃO SE CABE MAIS NÚMEROS!");
                break;
            }
            
            System.out.println("====INSERIR NÚMEROS====");
            System.out.print("NÚMERO: ");
            int numeros = sc.nextInt();
            sc.nextLine();

            maxnumeros [ref] = numeros;
            ref++;

            System.out.println("NÚMERO CADASTRADO!");
            break;

        case 2:
            if (ref == 0){
                System.out.println("NENHUM NÚMERO INSERIDO.");
                break;
            }
            System.out.println("====LISTAR NÚMEROS====");
            for (int i = 0; i < ref; i++) {
                System.out.println(i+" NÚMEROS: "+maxnumeros[i]);
            }
            break;

        case 3:
            if (ref == 0) {
                System.out.println("NENHUM NÚMERO CADASTRADO PARA REMOVER.");
                break;
            }

                        System.out.println("====REMOVER NÚMEROS====");
            System.out.print("INFORME A ÍNDICE A REMOVER: ");
            int posRem = sc.nextInt();
            sc.nextLine();

            if (posRem < 0 || posRem >= ref) {
                System.out.println("ÍNDICE INVÁLIDO!");
            } else {
                for (int i = posRem; i < ref - 1; i++) {
                    maxnumeros[i] = maxnumeros[i + 1];
                }
                ref--;
                System.out.println("REMOVIDO COM SUCESSO!");
            }
            break;
        case 4:
            System.out.println("SAIR!");
            break;
            
        default:
            System.out.println("OPÇÃO INVÁLIDA!");
            break;
    }

    
    }while(op!=0);


        sc.close();
    }
}

