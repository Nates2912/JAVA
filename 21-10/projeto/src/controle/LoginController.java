package controle;

import dao.UsuarioDAO;
import modelo.Usuario;

public class LoginController {
    private UsuarioDAO dao;

    public LoginController() {
        dao = new UsuarioDAO();
    }

    public boolean autenticar(String login, String senha) {
        Usuario usuario = dao.autenticar(login, senha);
        return usuario != null;
    }
}
