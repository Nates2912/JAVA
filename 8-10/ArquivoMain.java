import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArquivoMain {
    public static void main(String[] args) {
        File pastaLab = new File("LABORATORIO");
        if (!pastaLab.exists()) {
            pastaLab.mkdirs();
        }

        boolean executando = true;
        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção: \n1 - Criar arquivo\n2 - Escrever no arquivo\n3 - Ler arquivo\n4 - Renomear arquivo\n5 - Excluir arquivo\n6 - Mostrar informações do arquivo\n7 - Proteger arquivo\n8 - Sair",
                    "Menu principal",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {
                case "1" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo com extensão (ex: atividade.txt): ", "Criar arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo já existe!");
                    } else {
                        try {
                            if (arquivo.createNewFile()) {
                                JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo.");
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao criar o arquivo.");
                        }
                    }
                }

                case "2" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo para escrita: ", "Escrever no arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (!arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    if (!arquivo.canWrite()) {
                        JOptionPane.showMessageDialog(null, "Permissão negada! O arquivo é somente leitura.");
                        break;
                    }

                    String texto = JOptionPane.showInputDialog(null, "Digite o texto para gravar: ", "Escrever no arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (texto == null || texto.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Texto não informado.");
                        break;
                    }

                    try (FileWriter fw = new FileWriter(arquivo, true)) {
                        fw.write(texto + "\n");
                        JOptionPane.showMessageDialog(null, "Texto gravado com sucesso!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo.");
                    }
                }

                case "3" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo para leitura: ", "Ler arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (!arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                        String conteudo = "";
                        String linha;
                        while ((linha = br.readLine()) != null) {
                            conteudo += linha + "\n";
                        }

                        if (conteudo.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "O arquivo está vazio.");
                        } else {
                            JOptionPane.showMessageDialog(null, conteudo, "Conteúdo do arquivo", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo.");
                    }
                }

                case "4" -> {
                    String nomeAtual = JOptionPane.showInputDialog(null, "Digite o nome atual do arquivo: ", "Renomear arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nomeAtual == null || nomeAtual.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome atual não informado.");
                        break;
                    }

                    ArquivoLaboratorio arqAtual = new ArquivoLaboratorio(nomeAtual.trim());
                    File fileAtual = arqAtual.getFile();

                    if (!fileAtual.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    String novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome do arquivo: ", "Renomear arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (novoNome == null || novoNome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Novo nome não informado.");
                        break;
                    }

                    ArquivoLaboratorio arqNovo = new ArquivoLaboratorio(novoNome.trim());
                    File fileNovo = arqNovo.getFile();

                    if (fileNovo.exists()) {
                        JOptionPane.showMessageDialog(null, "Já existe um arquivo com esse novo nome!");
                        break;
                    }

                    if (fileAtual.renameTo(fileNovo)) {
                        JOptionPane.showMessageDialog(null, "Arquivo renomeado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao renomear arquivo.");
                    }
                }

                case "5" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo para excluir: ", "Excluir arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (!arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    int confirmacao = JOptionPane.showConfirmDialog(
                            null,
                            "Deseja realmente excluir o arquivo '" + nome + "'?",
                            "Confirmar exclusão",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (confirmacao == JOptionPane.YES_OPTION) {
                        if (arquivo.delete()) {
                            JOptionPane.showMessageDialog(null, "Arquivo excluído com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao excluir arquivo.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
                    }
                }

                case "6" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo para ver as informações: ", "Informações do arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (!arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    JOptionPane.showMessageDialog(null, arq.exibirDetalhes(), "Informações do arquivo", JOptionPane.INFORMATION_MESSAGE);
                }

                case "7" -> {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do arquivo para proteger (Somente leitura): ", "Proteger arquivo", JOptionPane.QUESTION_MESSAGE);
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome do arquivo não informado.");
                        break;
                    }

                    ArquivoLaboratorio arq = new ArquivoLaboratorio(nome.trim());
                    File arquivo = arq.getFile();

                    if (!arquivo.exists()) {
                        JOptionPane.showMessageDialog(null, "O arquivo não existe!");
                        break;
                    }

                    if (arquivo.setReadOnly()) {
                        JOptionPane.showMessageDialog(null, "Arquivo alterado para SOMENTE LEITURA com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível alterar a permissão.");
                    }
                }

                case "8" -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    executando = false;
                }

                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}