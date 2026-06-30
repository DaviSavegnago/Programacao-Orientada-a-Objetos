package exercicios;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000, 500);
        ContaInvestimento ci = new ContaInvestimento(5000, 0);

        cc.depositar(300);
        cc.sacar(1200);

        System.out.println();

        ci.depositar(1000);
        ci.sacar(700);

        System.out.println();

        System.out.println("Saldo Conta Corrente: R$ " + cc.getSaldo());
        System.out.println("Saldo Conta Investimento: R$ " + ci.getSaldo());
    }
}
