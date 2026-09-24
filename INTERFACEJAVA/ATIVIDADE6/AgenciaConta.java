public class AgenciaConta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private Agencia agencia;

    public AgenciaConta(String numeroConta, String titular, double saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
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

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            System.out.println("Saldo atualizado: R$ " + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponível: R$ " + String.format("%.2f", saldo));
    }

    public void mostrarDados() {
        if (agencia != null) {
            agencia.mostrarDados();
        }
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}