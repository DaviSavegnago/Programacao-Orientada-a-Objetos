package pkg;

import java.util.Scanner;

public class Exercicio6Aula2402 {

    public static void main(String[] args) {

        float a, b, c;
        float aux;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º valor: ");
        a = teclado.nextFloat();

        System.out.println("Digite o 2º valor: ");
        b = teclado.nextFloat();

        System.out.println("Digite o 3º valor: ");
        c = teclado.nextFloat();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("Valores em ordem crescente:");
        System.out.println(a + " - " + b + " - " + c);

    }
}