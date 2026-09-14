
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("Números cadastrados: ");
        for(Integer numero: numeros){
            System.out.println(numero);
        }

        
        numeros.set(1, 5);

        System.out.println("Lista aós alterar: ");
        for (Object numero : numeros) {
            System.out.println(numero);
        }

        //remover
        numeros.remove(0);

        System.out.println("Lista após remover: ");
        for (Object numero : numeros) {
            System.out.println(numero);
        }
    }
}
