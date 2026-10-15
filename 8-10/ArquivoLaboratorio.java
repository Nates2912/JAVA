import java.io.File;
import java.util.Date;

public class ArquivoLaboratorio extends Arquivo {

    public ArquivoLaboratorio(String nome) {
        super(nome, "LABORATORIO/" + nome);
    }

    public File getFile() {
        return new File(getCaminho());
    }

    public String getExtensao() {
        String nome = getNome();
        int pontoIndex = nome.lastIndexOf('.');
        if (pontoIndex > 0 && pontoIndex < nome.length() - 1) {
            return nome.substring(pontoIndex + 1);
        }
        return "Sem extensão";
    }

    @Override
    public String exibirDetalhes() {
        File arquivo = getFile();
        if (!arquivo.exists()) {
            return "Arquivo não existe!";
        }

        return super.exibirDetalhes() +
                "\nExtensão: " + getExtensao() +
                "\nTamanho: " + arquivo.length() + " bytes" +
                "\nCaminho Completo: " + arquivo.getAbsolutePath() +
                "\nPermissão de Leitura: " + (arquivo.canRead() ? "Sim" : "Não") +
                "\nPermissão de Gravação: " + (arquivo.canWrite() ? "Sim" : "Não") +
                "\nPermissão de Execução: " + (arquivo.canExecute() ? "Sim" : "Não") +
                "\nÚltima Modificação: " + new Date(arquivo.lastModified());
    }
}