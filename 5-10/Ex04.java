
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dado.txt");

            fw.write("primeira linha \n");
            fw.write("segunda linha\n");
            fw.write("segunda linha");

            fw.close();

            System.out.println("Escrita concluída");
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}

//criar e escrever e sobreescrita
