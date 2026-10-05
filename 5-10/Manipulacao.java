import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Manipulacao {
    public static void main(String[] args) {
        
        try {
            // criar arquivo
            File arquivo = new File("arquivo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado "+arquivo.getName());
            }else{
                System.out.println("Arquivo já existe!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //escrever
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write("Olá, este é o conteúdo inicial\n");
            writer.write("Linha 2 do arquivo\n");
            writer.close();
            System.out.println("Conteúdo escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever: "+e.getMessage());
        }

        try {
            //ler arquivo
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

        try {
            //alterar
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("Conteúdo alterado\n");
            fw.write("Nova informação no arquivo");
            fw.close();

            System.out.println("Arquivo alterado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao alterar: "+e.getMessage());
        }

        try {
            //mostrar conteúdo após alteração
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


            //remover arquivo
            File arquivo = new File("arquivo.txt");
            if (arquivo.delete()) {
                System.out.println("Arquivo removido;");
            }else{
                System.out.println("Erro ao remover arquivo.");
            }

    }
}
