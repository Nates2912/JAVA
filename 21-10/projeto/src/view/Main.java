package view;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // O sistema inicia abrindo a tela de Login
            new TelaLogin().setVisible(true);
        });
    }
}

