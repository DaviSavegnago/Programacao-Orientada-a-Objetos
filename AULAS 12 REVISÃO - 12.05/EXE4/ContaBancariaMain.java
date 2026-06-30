package ppkg;

public class ContaBancariaMain {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.depositar(500);

        System.out.println();

        Cheque ch = new Cheque();
        ch.setValorCheque(1000);

        c.depositar(ch);
    }
}