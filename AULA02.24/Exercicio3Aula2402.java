package pkg;

import java.util.Scanner;

public class Exercicio3Aula2402 {
	
	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float d;
		float mediaValores;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o valor do 1º número: ");
		a = teclado.nextFloat();
		System.out.println("Escreva o valor do 2º número: ");
		b = teclado.nextFloat();
		System.out.println("Escreva o valor do 3º número: ");
		c = teclado.nextFloat();
		System.out.println("Escreva o valor do 4º número: ");
		d = teclado.nextFloat();
		
		mediaValores = (a + b + c + d) / 4;
		
		System.out.println("A média desses valores foi de: "+mediaValores);
		
		if (a >= mediaValores) {
			System.out.println("O 1º valor, "+a+", é superior a média");
		}
		if (b >= mediaValores) {
			System.out.println("O 2º valor, "+b+", é superior a média");
		}
		if (c >= mediaValores) {
			System.out.println("O 3º valor, "+c+", é superior a média");
		}
		if (d >= mediaValores) {
			System.out.println("O 4º valor, "+d+", é superior a média");
		}
	}

}
