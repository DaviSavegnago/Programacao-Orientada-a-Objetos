package aula0303;

import java.util.Scanner;

public class aula0303exe5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escolha um número para calcularmos a fatorial: ");
		int num = teclado.nextInt();
		int i;
		int fatorial = 1;
		
		for (i=1; i<=num; i++) {
			fatorial *= i;
		}
		
		System.out.println("A fatorial do número é: "+fatorial);
		
	}

}