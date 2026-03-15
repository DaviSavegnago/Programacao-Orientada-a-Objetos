package aula0303;

import java.util.Scanner;

public class aula0303vmExe6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String [] cidades = new String [5];
		int [] populacao = new int [5];
		int maior = 0;
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println("Digite o nome da cidade "+(i+1)+": ");
			cidades[i] = teclado.next();
			
			System.out.println("Digite a população da cidade "+(i+1)+": ");
			populacao[i] = teclado.nextInt();
		}
		
		for (i=1; i<5; i++) {
			if (populacao[i] > populacao[maior]) {
				maior = i;
			}
		}
		
		System.out.println("A cidade mais populosa é: "+cidades[maior]);

	}

}
