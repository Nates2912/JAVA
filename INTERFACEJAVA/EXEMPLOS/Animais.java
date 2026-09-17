
import java.util.ArrayList;

public class Animais {
    
    private  ArrayList<Animal> listaAnimals;

    public Animais(){
        listaAnimals = new ArrayList<>();
    }

    public  void adicionarAnimal(Animal a){
        listaAnimals.add(a);

        System.out.println("Animal cadastrado");
    }

    public void listarAnimais(){
        if (listaAnimals.isEmpty()) {
            System.out.println("Lista vazia.");
        }else{
            System.out.println("\n===Lista de Animais===");
            for (int i = 0; i < listaAnimals.size(); i++) {
                System.out.println((i+1)+" - "+listaAnimals.get(i).exibirInfo());
            }
        }
    }
    public  void atualizarAnimal(int indice, Animal novoAnimal){
        if (indice>=0 && indice<listaAnimals.size()) {
            listaAnimals.set(indice, novoAnimal);
            System.out.println("Animal alterado com sucesso!");
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void removerAnimal(int indice){
        if (indice>=0 && indice <listaAnimals.size()){
            listaAnimals.remove(indice);
            System.out.println("Animal removido com sucesso");
        }else{
            System.out.println("Indice inválido.");
        }
    }
}
