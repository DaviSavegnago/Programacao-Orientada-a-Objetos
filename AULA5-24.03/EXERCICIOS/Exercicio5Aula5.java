package pkg;

import java.util.Scanner;

//5 - Escreva um programa que leia uma temperatura em String do teclado (ex: "25.5") 
//e a converta para double para realizar um cálculo (ex: converter para Fahrenheit). 
//Use Double.parseDouble() para a conversão. Trate a exceção NumberFormatException, 
//que ocorre se o usuário digitar algo como "25,5" (com vírgula) ou "vinte graus", impedindo a conversão.

public class Exercicio5Aula5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		try {
		System.out.println("Digite um temperatura (ex: 25.5): ");
		String temperatura = teclado.nextLine();
		
		double celsius = Double.parseDouble(temperatura);
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("Temperatura em Fahrenheit: "+fahrenheit);
		
		}catch (NumberFormatException e) {
			System.out.println("ERRO, esse formato de número não existe siga os exemplos, 20 ou 13.5 ou -6!");
		}catch (Exception e) {
			System.out.println("ERRO!");
		}
			
	}

}