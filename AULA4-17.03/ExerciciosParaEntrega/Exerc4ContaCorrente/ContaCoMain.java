package pkg;

public class ContaCoMain {

    public static void main(String[] args) {
        
        ContaCorrente novaConta = new ContaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo inicial: R$ " + novaConta.retornaSaldo());
        
        if (novaConta.sacar(500)) {
            System.out.println("Saque de R$ 500 realizado com sucesso!");
        }
        System.out.println("Saldo após saque: R$ " + novaConta.retornaSaldo());
        
        novaConta.depositar(50);
        System.out.println("Saldo após depósito de R$ 50: R$ " + novaConta.retornaSaldo());
        
        if (novaConta.sacar(600)) {
            System.out.println("Saque de R$ 600 realizado com sucesso!");
        }
        System.out.println("Saldo final: R$ " + novaConta.retornaSaldo());
    }
}