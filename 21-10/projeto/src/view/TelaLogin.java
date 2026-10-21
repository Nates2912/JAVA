package view;

import controle.LoginController;
import java.awt.*;
import javax.swing.*;

public class TelaLogin extends JFrame {

    private final LoginController loginController = new LoginController();

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    public TelaLogin() {
        setTitle("Acesso ao Sistema");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        criarInterface();
        configurarEventos();
    }

    private void criarInterface() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        JLabel lblTitulo = new JLabel("LOGIN DE USUÁRIO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        painel.add(lblTitulo, gbc);

        gbc.gridwidth = 1;

        // Campo Usuário
        gbc.gridx = 0;
        gbc.gridy = 1;
        painel.add(new JLabel("Usuário:"), gbc);

        txtUsuario = new JTextField(15);
        gbc.gridx = 1;
        painel.add(txtUsuario, gbc);

        // Campo Senha
        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(new JLabel("Senha:"), gbc);

        txtSenha = new JPasswordField(15);
        gbc.gridx = 1;
        painel.add(txtSenha, gbc);

        // Botão Entrar
        btnEntrar = new JButton("Entrar");
        btnEntrar.setBackground(new Color(30, 60, 100));
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFocusPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        painel.add(btnEntrar, gbc);

        add(painel);
    }

    private void configurarEventos() {
        btnEntrar.addActionListener(e -> entrar());
    }

    private void entrar() {
        String usuario = txtUsuario.getText().trim();
        String senha = new String(txtSenha.getPassword());

        if (usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (loginController.autenticar(usuario, senha)) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose(); // Fecha a tela de login
            new TelaProduto().setVisible(true); // Abre a tela principal
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
        }
    }
}