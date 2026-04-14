import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o saldo inicial: ");
        conta.setSaldo(sc.nextDouble());

        System.out.print("Digite o limite da conta: ");
        conta.setLimite(sc.nextDouble());

        System.out.print("Digite o valor para saque: ");
        double valorSaque = sc.nextDouble();

        if (conta.saque(valorSaque)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
        
    }
}