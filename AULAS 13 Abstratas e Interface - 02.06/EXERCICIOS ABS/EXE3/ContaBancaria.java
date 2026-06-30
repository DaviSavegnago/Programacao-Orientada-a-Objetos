package exercicios;

public class ContaBancaria extends Conta {

    public ContaBancaria(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$ " + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
