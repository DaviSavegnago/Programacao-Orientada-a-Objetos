package aula0303;

import java.util.Scanner;

public class aula0303vmExe5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int [] vetor = new int [10];
		int maior, menor;
		int i;
		
		for (i=0; i<10; i++) {
			System.out.println("Digite o número "+(i+1)+": ");
			vetor[i] = teclado.nextInt();
		}
		
		maior = vetor[0];
		menor = vetor[0];
		
		for (i=1; i<10; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("O maior valor é: "+maior);
		System.out.println("O menor valor é: "+menor);

	}

}
