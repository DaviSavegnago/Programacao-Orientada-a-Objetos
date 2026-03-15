package pkg;

import java.util.Scanner;

public class Livro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String titulo;
		int anoPublicacao;
		String autor;
		
		System.out.println("Digite o título do livro: ");
		titulo = teclado.nextLine();
		System.out.println("Digite seu ano de publicação: ");
		anoPublicacao = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o autor do livro: ");
		autor = teclado.nextLine();
		
		System.out.println("Título: "+titulo);
		System.out.println("Ano de Publicação: "+anoPublicacao);
		System.out.println("Autor: "+autor);
		

	}

}