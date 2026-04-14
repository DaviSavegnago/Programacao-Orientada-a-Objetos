package pkg;

public class ContaCorrente {

    public float saldo;

    public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true; 
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
            return false; 
        }
    }

    public float retornaSaldo() {
        return saldo;
    }
}