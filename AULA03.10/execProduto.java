package pkg;

import java.util.Scanner;

public class execProduto {

	public static void main(String[] args) {
		
		float valorTotal;
		
		Scanner teclado = new Scanner(System.in);
		
		
		Produto p1 = new Produto();
		System.out.println("Digite o nome do Produto: ");
		p1.nome = teclado.nextLine();
		System.out.println("Digite o preço do produto, em reais: ");
		p1.preço = teclado.nextFloat();
		System.out.println("Digite a quantidade em estoque desse produto");
		p1.quantidadeEmEstoque = teclado.nextFloat();
		
		valorTotal = p1.preço * p1.quantidadeEmEstoque;
		
		System.out.println("Nome do Produto: "+p1.nome);
		System.out.println("Preço do Produto: R$"+p1.preço);
		System.out.println("Quantidade em Estoque: "+p1.quantidadeEmEstoque);
		System.out.println("Valor total em Estoque: R$"+valorTotal);
		
	}

}
