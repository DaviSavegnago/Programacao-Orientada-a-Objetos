package pkg;

import java.util.Scanner;

public class Exercicio7Aula2402 {

    public static void main(String[] args) {

        int a, b;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Os valores são múltiplos entre si.");
        } else {
            System.out.println("Os valores NÃO são múltiplos entre si.");
        }

    }
}