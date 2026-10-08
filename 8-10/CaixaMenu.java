
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CaixaMenu {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(null,"Escolha uma opção:\n1 - Cadastrar produto\n2 - Listar produtos\n 3 - Sair",
            "Menu principal", JOptionPane.QUESTION_MESSAGE
            );
            if (opcao==null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {
                case "1" -> {
                    String produto = JOptionPane.showInputDialog(null, "Digite o nome do produto: ", "Cadastro do produto",JOptionPane.QUESTION_MESSAGE);
                    if (produto==null || produto.trim().isEmpty())
                    {JOptionPane.showMessageDialog(null, "Produto não cadastrado");

                    }else{
                        produtos.add(produto);
                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    }
                }
                case "2" -> {
                    if(produtos.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
                    }else{
                        String lista = "Produtos cadastrdados \n\n";

                        for (int i = 0; i < produtos.size(); i++) {
                            lista+=(i+1)+" - "+produtos.get(i)+"\n";
                        }
                        JOptionPane.showMessageDialog(null, lista, "Lista de produtos",JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    executando=false;
                }

                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}
