package dao;

import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuarioDAO() {
        // Usuário padrão cadastrado para acesso ao sistema
        usuarios.add(new Usuario("admin", "1234"));
    }

    public Usuario autenticar(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
}
