package ppkg;

import java.util.Scanner;

public class ProdutoComDesconto extends Produto {
	
	public void desconto() {
		precoComDesconto = preco * 0.8;
		
		System.out.println("Preço original: R$"+preco);
		System.out.println("Preço com desconto de 20%: R$"+precoComDesconto);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ProdutoComDesconto pcd = new ProdutoComDesconto();
		
		System.out.println("Qual o preço deste produto: ");
		pcd.setPreco(teclado.nextDouble());
		
		pcd.desconto();
	}

}
