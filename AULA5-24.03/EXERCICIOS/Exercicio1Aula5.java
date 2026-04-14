package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

//1 - Escreva um programa que solicita ao usuário para digitar um número inteiro e exiba a raiz quadrada desse número. 
//Certifique-se de que o programa trate adequadamente as exceções se o usuário digitar um valor inválido,
//por exemplo, ler um char ou string.

public class Exercicio1Aula5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			
		System.out.println("Digite um número inteiro: ");
		int numero1 = teclado.nextInt();
	    teclado.nextLine();
	    
	    double raiz = Math.sqrt(numero1);
	    System.out.println("A raiz quadrada desse número é: "+raiz);
	    
		} catch (InputMismatchException e) {
			System.out.println("ERRO, apenas números inteiros");
		} catch (Exception e) {
			System.out.println("Exceção: "+e.toString());
		}

	}

}
