import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VeículoMain {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        boolean executando = true;
        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção: \n1 - Cadastrar Carro\n2 - Listar Carros\n3 - Detalhar Carro\n4 - Alterar Carro\n5 - Remover Carro\n6 - Gravar informações em arquivo\n7 - Sair",
                    "Menu principal",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {
                case "1" -> {
                    String marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo: ", "Cadastro do veículo", JOptionPane.QUESTION_MESSAGE);
                    if (marca == null || marca.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Marca não informada.");
                        break;
                    }

                    String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo: ", "Cadastro do veículo", JOptionPane.QUESTION_MESSAGE);
                    if (modelo == null || modelo.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Modelo não informado.");
                        break;
                    }

                    String ano = JOptionPane.showInputDialog(null, "Digite o ano do veículo: ", "Cadastro do veículo", JOptionPane.QUESTION_MESSAGE);
                    if (ano == null || ano.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ano não informado.");
                        break;
                    }

                    veiculos.add(new VeiculoCarro(marca, modelo, ano));
                    JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
                }

                case "2" -> {
                    if (veiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
                    } else {
                        String lista = "Veículos cadastrados:\n\n";
                        for (int i = 0; i < veiculos.size(); i++) {
                            Veiculo v = veiculos.get(i);
                            lista += (i + 1) + " - Marca: " + v.getMarca() + " | Modelo: " + v.getModelo() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista, "Lista de veículos", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

                case "3" -> {
                    if (veiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
                        break;
                    }

                    String entradaDetalhar = JOptionPane.showInputDialog(null, "Digite o número do veículo que deseja detalhar: ", "Detalhar veículo", JOptionPane.QUESTION_MESSAGE);
                    if (entradaDetalhar == null) {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                        break;
                    }

                    int indiceDetalhar = -1;
                    for (int i = 0; i < veiculos.size(); i++) {
                        if (entradaDetalhar.equals("" + (i + 1))) {
                            indiceDetalhar = i;
                            break;
                        }
                    }

                    if (indiceDetalhar != -1) {
                        JOptionPane.showMessageDialog(null, veiculos.get(indiceDetalhar).exibirDetalhes(), "Detalhes do veículo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                    }
                }

                case "4" -> {
                    if (veiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
                        break;
                    }

                    String entradaAlterar = JOptionPane.showInputDialog(null, "Digite o número do veículo que deseja alterar: ", "Alterar veículo", JOptionPane.QUESTION_MESSAGE);
                    if (entradaAlterar == null) {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                        break;
                    }

                    int indiceAlterar = -1;
                    for (int i = 0; i < veiculos.size(); i++) {
                        if (entradaAlterar.equals("" + (i + 1))) {
                            indiceAlterar = i;
                            break;
                        }
                    }

                    if (indiceAlterar == -1) {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                        break;
                    }

                    String novaMarca = JOptionPane.showInputDialog(null, "Digite a nova marca do veículo: ", "Alterar veículo", JOptionPane.QUESTION_MESSAGE);
                    if (novaMarca == null || novaMarca.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Marca não informada.");
                        break;
                    }

                    String novoModelo = JOptionPane.showInputDialog(null, "Digite o novo modelo do veículo: ", "Alterar veículo", JOptionPane.QUESTION_MESSAGE);
                    if (novoModelo == null || novoModelo.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Modelo não informado.");
                        break;
                    }

                    String novoAno = JOptionPane.showInputDialog(null, "Digite o novo ano do veículo: ", "Alterar veículo", JOptionPane.QUESTION_MESSAGE);
                    if (novoAno == null || novoAno.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ano não informado.");
                        break;
                    }

                    veiculos.set(indiceAlterar, new VeiculoCarro(novaMarca, novoModelo, novoAno));
                    JOptionPane.showMessageDialog(null, "Veículo alterado com sucesso!");
                }

                case "5" -> {
                    if (veiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
                        break;
                    }

                    String entradaRemover = JOptionPane.showInputDialog(null, "Digite o número do veículo que deseja remover: ", "Remover veículo", JOptionPane.QUESTION_MESSAGE);
                    if (entradaRemover == null) {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                        break;
                    }

                    int indiceRemover = -1;
                    for (int i = 0; i < veiculos.size(); i++) {
                        if (entradaRemover.equals("" + (i + 1))) {
                            indiceRemover = i;
                            break;
                        }
                    }

                    if (indiceRemover != -1) {
                        veiculos.remove(indiceRemover);
                        JOptionPane.showMessageDialog(null, "Veículo removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                    }
                }

                case "6" -> {
                    if (veiculos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
                        break;
                    }

                    try (FileWriter fw = new FileWriter("carros.txt")) {
                        for (Veiculo v : veiculos) {
                            fw.write("Marca: " + v.getMarca() + " | Modelo: " + v.getModelo() + " | Ano: " + v.getAno() + "\n");
                        }
                        JOptionPane.showMessageDialog(null, "Informações gravadas em 'carros.txt' com sucesso!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar informações em arquivo.");
                    }
                }

                case "7" -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    executando = false;
                }

                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }
}