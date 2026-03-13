package aula0303;

import java.util.Scanner;

public class aula0303exe6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numeroEscolhido = 1;
		
		
		while (numeroEscolhido != 0) {
			System.out.println("Digite um número: ");
			numeroEscolhido = teclado.nextInt();		
			
			if (numeroEscolhido == 0) {
				System.out.println("Número 0, código encerrado!");
			}
			
			else {
				System.out.println("Escreva outro número abaixo");
			}
			
		}
	}
}