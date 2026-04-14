package pkg;

import java.util.Scanner;

//2 - Crie uma classe chamada ContaBancaria com os atributos titular e saldo. 
//Crie um construtor que inicialize esses atributos. Implemente os métodos depositar(double valor), que adiciona um valor ao saldo, 
//sacar(double valor), que realiza o saque apenas se houver saldo suficiente e retorna true ou false, 
//transferir(double valor, ContaBancaria destino), que transfere um valor para outra conta caso haja saldo suficiente, 
//e consultarSaldo(), que retorna o saldo atual da conta.

public class ContaBancariaExec {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome do titular: ");
        String titular = teclado.nextLine();
        
        System.out.println("Informe o seu saldo, em reais: ");
        double saldo = teclado.nextDouble();
        
        ContaBancaria c = new ContaBancaria(titular, saldo);

        System.out.println("Saldo atual: " + c.consultarSaldo());

        // depositar
        System.out.println("Quanto deseja depositar?");
        double add = teclado.nextDouble();
        c.depositar(add);
        System.out.println("Novo saldo: " + c.consultarSaldo());

        // ascar
        System.out.println("Quanto deseja sacar?");
        double saque = teclado.nextDouble();

        boolean sacou = c.sacar(saque);

        if (sacou) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + c.consultarSaldo());

        // transferência
        System.out.println("Criando segunda conta.");

        teclado.nextLine(); 

        System.out.println("Nome do segundo titular: ");
        String titular2 = teclado.nextLine();

        System.out.println("Saldo da segunda conta: ");
        double saldo2 = teclado.nextDouble();

        ContaBancaria c2 = new ContaBancaria(titular2, saldo2);

        System.out.println("Quanto deseja transferir?");
        double valor = teclado.nextDouble();

        boolean transferiu = c.transferir(valor, c2);

        if (transferiu) {
            System.out.println("Transferência realizada!");
        } else {
            System.out.println("Saldo insuficiente para transferir!");
        }

        System.out.println("Saldo conta 1: " + c.consultarSaldo());
        System.out.println("Saldo conta 2: " + c2.consultarSaldo());
    }
}