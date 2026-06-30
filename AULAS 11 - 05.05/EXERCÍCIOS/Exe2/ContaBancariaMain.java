package wee;

public class ContaBancariaMain {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(1000, 500, 200);

        conta1.calcularSaldo();
    }
}