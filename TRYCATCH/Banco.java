public class Banco {
    private String numeroConta;
    private String titular;
    private double saldo;

    public Banco(String numeroConta, String titular, double saldo) throws ExcecaoDadoInvalido {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("O número da conta não pode ser vazio.");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("O nome do titular não pode ser vazio.");
        }
        if (saldo < 0) {
            throw new ExcecaoDadoInvalido("O saldo inicial não pode ser negativo.");
        }
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados() {
        System.out.println("Número da Conta: " + numeroConta + " | Titular: " + titular + " | Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}