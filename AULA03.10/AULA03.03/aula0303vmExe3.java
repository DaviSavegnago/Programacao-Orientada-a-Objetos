package aula0303;

import java.util.Scanner;

public class aula0303vmExe3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double [] vetor = new double [5];
		double notas = 0;
		double media=0;
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println("Digite a nota do aluno "+(i+1)+": ");
			vetor[i] = teclado.nextDouble();
			notas += vetor[i];
		}
		
		media = notas / 5;
		System.out.println("A média dos alunos foi de: "+media);

	}

}
