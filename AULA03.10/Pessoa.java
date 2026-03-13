package pkg;

import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int idade;
		String genero;
		
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite seu gênero: ");
		genero = teclado.nextLine();
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Gênero: "+genero);
		

	}

}
