package exercicios;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Aplicação realizada na Conta Investimento: R$ " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Resgate realizado da Conta Investimento: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente para resgate.");
        }
    }
}
