package exercicios;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1000, 500);

        conta.depositar(200);
        conta.sacar(300);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
