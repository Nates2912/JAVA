
public class ForAtv3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0 && i <= 51) {
                System.out.println("Ímpáres: " + i);

            }else if (i % 2 == 0 && i > 51){
                System.out.println("Pares " + i);

            }else{
                System.out.println();
            }
            
        }

    }
}
