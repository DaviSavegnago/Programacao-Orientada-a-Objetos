package pkg;

import java.util.Scanner;

public class execCarro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Carro c1 = new Carro();
		System.out.println("Digite a marca do carro 1: ");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 1: ");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 1: ");
		c1.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		Carro c2 = new Carro();
		System.out.println("Digite a marca do carro 2: ");
		c2.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 2: ");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 2: ");
		c2.anoFabricacao = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("A marca do carro 1 é a "+c1.marca+", o modelo é o "+c1.modelo+" e foi fabricado em "+c1.anoFabricacao);
		System.out.println("A marca do carro 2 é a "+c2.marca+", o modelo é o "+c2.modelo+" e foi fabricado em "+c2.anoFabricacao);
		

	}

}
