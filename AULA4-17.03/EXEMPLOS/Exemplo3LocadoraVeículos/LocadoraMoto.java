package pkg;

import java.util.Scanner;

public class LocadoraMoto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String marca,modelo;
		int c;
		Moto m = new Moto();
		
		System.out.println("Digite a marca da moto: ");
		marca = teclado.nextLine();
		
		System.out.println("Digite o modelo da moto: ");
		modelo = teclado.nextLine();
		
		System.out.println("Digite as cilindradas da moto: ");
		c = teclado.nextInt();
		
		m.atribuirValores(marca, modelo, c);
		System.out.println("Marca: "+m.retornaMarca());
		System.out.println("Modelo: "+m.retornaModelo());
		System.out.println("Cilindradas: "+m.retornaCilindradas());
		
		
	}

}