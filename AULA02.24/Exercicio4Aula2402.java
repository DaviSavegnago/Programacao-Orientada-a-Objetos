package pkg;

import java.util.Scanner;

public class Exercicio4Aula2402 {

    public static void main(String[] args) {

        float x, y;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = teclado.nextFloat();

        System.out.println("Digite o valor de Y: ");
        y = teclado.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está na origem.");
        }
        else if (x == 0) {
            System.out.println("O ponto está sobre o eixo Y.");
        }
        else if (y == 0) {
            System.out.println("O ponto está sobre o eixo X.");
        }
        else if (x > 0 && y > 0) {
            System.out.println("O ponto está no 1º quadrante.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("O ponto está no 2º quadrante.");
        }
        else if (x < 0 && y < 0) {
            System.out.println("O ponto está no 3º quadrante.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("O ponto está no 4º quadrante.");
        }
    }
}