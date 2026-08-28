

import java.util.Scanner;

public class AtvCorregida1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    

    //constraint
    final int limite = 5;
    
    String[] produtos = new String[limite];
        int[] quantidade = new int[limite];
        
        int qtd = 0;
        int op;

    do{
    System.out.println("\n====MENU====");
    System.out.println("1-CADASTRO\n2-LISTAR\n3-PESQUISAR\n4-ALTERAR\n5-REMOVER\n6-SAIR");
    System.out.print("ESCOLHA A OPÇÃO: ");
    op = sc.nextInt();
    sc.nextLine();


    switch (op) {
        case 1:
            if (qtd==limite){
                System.out.println("LISTA CHEIA!");
                break;
            }
            System.out.print("NOME DO PRODUTO: ");
            String nome = sc.next();

            System.out.print("QUANTIDADE: ");
            int quantidades = sc.nextInt();
            sc.nextLine();

            produtos [qtd] = nome;
            quantidade [qtd] = quantidades;
            qtd++;

            System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
            break;
        case 2:
            if (qtd == 0){
                System.out.println("NENHUM PRODUTO CADASTRADO.");
                break;
            }
            System.out.println("====PRODUTOS====");
            for (int i = 0; i < qtd; i++) {
                System.out.println(i+" - "+produtos[i]+" | ESTOQUE: "+quantidade[i]);
            }
            break;

        case 3:
            System.out.print("INFORME O NOME PARA PROCURAR: ");
            String busca = sc.next();

            int posBusca = -1;
            for (int i = 0; i < qtd; i++) {
                if(produtos[i].equalsIgnoreCase(busca)){
                    posBusca = i;
                    break;
                }
            }
            if (posBusca == -1){
                System.out.println("PRODUTO NÃO ENCONTRADO.");
            }else{
                System.out.println("ENCONTRADO: "+produtos[posBusca]+" | ESTOQUE: "+quantidade[posBusca]);
            }
            break;
        case 4:
            System.out.print("INFORME O NOME PARA ALTERAR: ");
            String nomeAlterar = sc.next();

            int posAlt= -1;
            for (int i = 0; i < qtd; i++) {
                if (produtos[i].equalsIgnoreCase(nomeAlterar)){
                    posAlt=i;
                    break;
                }
            }
            if(posAlt ==-1) {
                System.out.println("PRODUTO NÃO ENCONTRADO.");
            }else{
                System.out.print("NOVO NOME: ");
                produtos [posAlt] = sc.next();
                System.out.print("NOVA QUANTIDADE: ");
                quantidade [posAlt] = sc.nextInt();

                System.out.println("ALTERADO COM SUCESSO!");
            }
            break;
        case 5:
            System.out.println("INFORME O NOME PARA REMOVER: ");
            String nomeRemover = sc.next();

            int posRem= -1;
            for (int i = 0; i < qtd; i++) {
                if (produtos[i].equalsIgnoreCase(nomeRemover)){
                    posRem=i;

                }
            }
            
            if(posRem ==-1) {
                System.out.println("PRODUTO NÃO ENCONTRADO.");
            }else{
                for (int i = 0; i < qtd -1; i++) {
                    produtos[i]=produtos[i+1];
                    quantidade[i]=quantidade[i+1];
                }
                produtos[qtd-1]=null;
                quantidade[qtd-1]=0;
                qtd--;
                System.out.println("REMOVIDO COM SUCESSO!");
                break;
                
            }
            

        case 6:
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
