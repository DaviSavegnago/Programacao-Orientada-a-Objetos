package pkg;

import java.util.Scanner;

public class Exercicio8Aula2402 {

    public static void main(String[] args) {

        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        idade = teclado.nextInt();

        if (idade < 16) {
            System.out.println("A pessoa não está apta a votar.");
        }
        else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        }
        else {
            System.out.println("O voto é obrigatório.");
        }
        
    }
}