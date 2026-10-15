package controle;

import dao.ClienteDao;
import java.util.ArrayList;
import modelo.Cliente;

public class ClienteControle {
    // vai no dao, solicita o que o cliente quer

    private ClienteDao dao;

    public ClienteControle() {
        dao = new ClienteDao();
    }

    // cria um cliente e envia para o dao cadastrar
    public void cadastrar(int codigo, String nome, String telefone, String email) {
        Cliente cliente = new Cliente(codigo, nome, telefone, email);
        dao.cadastrar(cliente);
    }

    // solicitar ao dao a lista de clientes
    public ArrayList<Cliente> listar() {
        return dao.listar();
    }

    public Cliente buscar(int codigo) {
        return dao.buscar(codigo);
    }

    public boolean alterar(int codigo, String nome, String telefone, String email) {
        return dao.alterar(codigo, nome, telefone, email);
    }

    public boolean remover(int codigo) {
        return dao.remover(codigo);
    }
}
