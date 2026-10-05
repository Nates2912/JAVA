
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dados.txt");
            int caracter;

            while ((caracter=fr.read())!=-1){
                System.out.println((char)caracter);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*

FileWriter - grava texto no arquivo caractere por caractere (letra por letra) direto no disco.

BufferedWriter - guarda o texto na memória e grava no disco em blocos de uma só vez para ser mais rápido (e permite pular linha com newLine()).

FileReader - lê o texto do arquivo caractere por caractere (letra por letra) direto do disco.

BufferedReader - guarda trechos do arquivo na memória para ler de forma mais rápida (e permite ler linha por linha com readLine()).

*/
