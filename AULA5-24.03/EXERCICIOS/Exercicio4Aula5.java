package pkg;

import java.util.InputMismatchException;

import java.util.Scanner;

//4 - Crie um array de Strings com 5 nomes de pessoas (ex: "Ana", "Carlos", etc.). 
//Peça ao usuário para digitar um número de 0 a 4 para ver quem está naquela posição. 
//Trate a exceção caso o usuário digite um índice que não existe (ex: 10 ou -1), usando ArrayIndexOutOfBoundsException. 
//Trate também se ele digitar uma letra.

public class Exercicio4Aula5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = {"Ana", "Carlos", "Christian Pavon", "Ademar", "Gilson"};
		
		
		try {
		System.out.println("Digite um número de 0 a 4 para descobrir qual nome está nessa posição!");
		int numeroNome = teclado.nextInt();
		
		System.out.println("O número "+numeroNome+" equivale ao nome: "+nomes[numeroNome]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Número Inválido, digite um número de 0 a 4!");
		} catch (InputMismatchException e1) {
			System.out.println("Número Inválido, digite um número de 0 a 4!");
		} catch (Exception e) {
			System.out.println("ERRO!");
		}
	}

}