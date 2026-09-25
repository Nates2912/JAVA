

public class AgenciaContaCorrente extends AgenciaConta implements AgenciaPagamento {

    public AgenciaContaCorrente(String numeroConta, String titular, double saldo, Agencia agencia) {
        super(numeroConta, titular, saldo, agencia);
    }

    // dinheiro (sobrecarga 1)
    @Override
    public void pagar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
        } else if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
        }else{
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento em dinheiro de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
            System.out.println("Saldo atualizado: R$ " + String.format("%.2f", getSaldo()));
        }
    }



    // pix (sobrecarga 2)
    public void pagar(double valor, String chavePix) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
        }else if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
        }else{
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento via PIX realizado com sucesso!");
            System.out.println("Chave PIX utilizada: " + chavePix);
            System.out.println("Valor pago: R$ " + String.format("%.2f", valor));
            System.out.println("Saldo atualizado: R$ " + String.format("%.2f", getSaldo()));
        }
    }



    // cartao (sobrecarga 3)
    public void pagar(double valor, int parcelas) {
        if (valor <= 0) {
            System.out.println("Erro: O valor da compra deve ser maior que zero.");
        }else if (parcelas <= 0) {
            System.out.println("Erro: A quantidade de parcelas deve ser maior que zero.");
        }else if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
        }else{
            double valorParcela = valor / parcelas;
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento no cartão em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela) + " realizado com sucesso!");
            System.out.println("Valor total pago: R$ " + String.format("%.2f", valor));
            System.out.println("Saldo atualizado: R$ " + String.format("%.2f", getSaldo()));
        }
    }
}