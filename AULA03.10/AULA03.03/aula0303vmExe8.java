package aula0303;

import java.util.Scanner;

public class aula0303vmExe8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] vetor = new int [10];
		int pares = 0;
		int impares = 0;
		int i;
		
		for (i=0; i<10; i++) {
			System.out.println("Digite o número "+(i+1)+": ");
			vetor[i] = teclado.nextInt();
			
			if (vetor[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Quantidade de números pares: "+pares);
		System.out.println("Quantidade de números ímpares: "+impares);

	}

}