package pkg;

import java.util.Scanner;

//3 – Faça o tratamento de exceções em conversões de valores lidos pelo teclado. 
//Por exemplo, ao ler uma string e converter ela para double.

public class Exercicio3Aula5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        String entrada = teclado.nextLine();

        try {
            double valor = Double.parseDouble(entrada.replace(",", ".")); 
            System.out.println("O valor é: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Erro: " + entrada + " não é um número válido.");
        }
    }
}