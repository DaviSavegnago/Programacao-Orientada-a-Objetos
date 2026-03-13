package pkg;

import java.util.Scanner;

public class Exercicio5Aula2402 {

    public static void main(String[] args) {

        float a, b, c;
        float maior;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º valor: ");
        a = teclado.nextFloat();

        System.out.println("Digite o 2º valor: ");
        b = teclado.nextFloat();

        System.out.println("Digite o 3º valor: ");
        c = teclado.nextFloat();

        maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior valor digitado foi: " + maior);

    }
}