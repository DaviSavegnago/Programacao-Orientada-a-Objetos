package aula0303;

import java.util.Scanner;

public class aula0303 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um inteiro: ");
		int n = teclado.nextInt();
		System.out.println("Int digitado: "+n);
		
		double n1 = teclado.nextDouble();
		System.out.println("Double digitado: "+n1);
		teclado.nextLine();
		
		String palavra = teclado.nextLine();
		System.out.println("Palavra digitada: "+palavra);
		palavra = teclado.next();
		System.out.println("Palavra digitada com .next: "+palavra);
		
		for (int i=0; i<10; i++) {
			System.out.println("I vale: "+i);
		}
		
		int i=0;
		while (i<10) {
			System.out.println("I vale com while: "+i);
			i++;
		}
		
		
		
		teclado.close();
		
	}

}
