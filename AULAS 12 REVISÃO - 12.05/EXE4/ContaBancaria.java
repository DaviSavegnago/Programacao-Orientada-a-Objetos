package ppkg;

public class ContaBancaria {

    protected double saldoAtual;

    public void depositar(double valor) {

        saldoAtual += valor;

        System.out.println("Valor depositado: R$" + valor);
        System.out.println("Saldo atual: R$" + saldoAtual);
    }

    public void depositar(Cheque cheque) {

        saldoAtual += cheque.getValorCheque();

        System.out.println("Valor depositado via cheque: R$" 
                           + cheque.getValorCheque());

        System.out.println("Saldo atual: R$" + saldoAtual);
    }
}