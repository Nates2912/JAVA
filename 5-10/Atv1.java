import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atv1 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU ====\n1 - Criação de arquivos\n2 - Escrever arquivos\n3 - Ler arquivos\n4 - Alteração de arquivo\n5 - Mostrar mudanças de arquivo\n6 - Remover arquivo\n7 - Sair.");
                System.out.print("ESCOLHA A OPÇÃO: ");
                op = sc.nextInt();
                sc.nextLine();
                
                switch (op) {
                    case 1:
                        System.out.println("Criação de arquivos");


                        try{

                            File arquivo = new File("arquivo.txt");
                            if (arquivo.createNewFile()) {
                                System.out.println("Arquivo criado "+arquivo.getName());
                            }else{
                                System.out.println("Arquivo já existe!");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    break;


                    case 2:
                        System.out.println("Escrita de arquivos");


                        try {

                            FileWriter writer = new FileWriter("arquivo.txt");
                            writer.write("Olá, esté é um teste.\n");
                            writer.write("Teste dois.");
                            writer.close();

                            System.out.println("Conteúdo escrito com sucesso.");
                        }catch(IOException e){
                            System.out.println("Erro ao escrever: "+e.getMessage());
                        }
                    break;


                    case 3:
                        System.out.println("Leitura de arquivos");


                        try {

                            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
                            String linha;

                            System.out.println("\nContéudo do arquivo: ");
                            while ((linha=reader.readLine())!=null) {
                                System.out.println(linha);
                            }
                            reader.close();
                    } catch (IOException e) {
                        System.out.println("Erro ao ler: "+e.getMessage());
                    }
                    break;


                    case 4:
                        System.out.println("Alteração de arquivos");


                        try {

                            FileWriter fw = new FileWriter("arquivo.txt");
                            fw.write("Conteúdo alterado\n");
                            fw.write("Nova informação no arquivo");
                            fw.close();

                            System.out.println("Arquivo alterado com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao alterar: "+e.getMessage());
                    }

                    break;


                    case 5:
                        System.out.println("Leitura das alterações de arquivo");


                        try {

                            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
                            String linha ;

                            System.out.println("\nContúdo após alteração: ");
                            while((linha=br.readLine())!=null){
                                System.out.println(linha);
                            }
                            br.close();
                    } catch (IOException e) {
                        System.out.println("Erro ao ler"+e.getMessage());
                    }

                    break;

                    case 6:

                        File arquivo = new File("arquivo.txt");
                        if (arquivo.delete()) {
                            System.out.println("Arquivo removido.");
                        }else{
                            System.out.println("Erro ao remover arquivo.");
                        }

                    break;

                    case 7:

                        System.out.println("Saindo...");
                    break;

                    default: System.out.println("Opção inválida! Tente novamente.");
                }
                
            } while (op != 7);
        }
    }
}
