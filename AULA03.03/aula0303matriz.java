package aula0303;

import java.util.Scanner;

public class aula0303matriz {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int i=0, j=0;
		
		int [][] matriz = new int[2][2];
		for ( i=0; i<2; i++) {
			for (j=0; j<2; j++) {
				System.out.println("Digite o elemento ["+i+"] ["+j+"]");
				matriz [i][j] = teclado.nextInt();
			}
		}
		
		for ( i=0; i<matriz.length; i++) {
			for (j=0; j<matriz[i].length; j++) {
				System.out.println("Elemento ["+i+"] ["+j+"] = "+matriz[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
