package aula0303;

import java.util.Scanner;

public class aula0303exe8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String cidadeEscolhida;
		
		while (true) {
			System.out.println("Digite a cidade escolhida");
			cidadeEscolhida = teclado.nextLine();
			
			if (cidadeEscolhida.equals ("São Paulo")) {
				System.out.println("Código encerrado, São Paulo foi a escolhida!");
			}
			
			else {
				System.out.println("Escreva outra cidade abaixo");
			}
			
		}
	}

}
