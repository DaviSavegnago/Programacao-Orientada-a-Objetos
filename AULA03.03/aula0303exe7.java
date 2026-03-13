package aula0303;

import java.util.Scanner;

public class aula0303exe7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		float notaAluno = 0;
		
		while (notaAluno != -1) {
			System.out.println("Digite a nota do seu aluno: ");
			notaAluno = teclado.nextFloat();
			
			if (notaAluno == -1) {
				System.out.println("Nota -1 lida, código encerrado!");
			}
			
			else {
				System.out.println("Escreva outra nota abaixo");
			}
			
		}

	}

}