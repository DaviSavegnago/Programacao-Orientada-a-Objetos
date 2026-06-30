package wee;

public class ContaCorrente extends ContaBancaria {

    double saldo;
    double deposito;
    double saque;

    public ContaCorrente(double saldo, double deposito, double saque) {
        this.saldo = saldo;
        this.deposito = deposito;
        this.saque = saque;
    }

    public void calcularSaldo() {

        double saldoFinal = saldo + deposito - saque;

        System.out.println("Saldo final da conta corrente: " + saldoFinal);
    }
}