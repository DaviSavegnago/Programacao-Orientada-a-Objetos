package pkg;

import java.util.Scanner;

public class Exercicio9Aula2402 {

    public static void main(String[] args) {

        double numero1, numero2, resultado;
        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = teclado.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        opcao = teclado.nextInt();

        switch (opcao) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case 4:
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}