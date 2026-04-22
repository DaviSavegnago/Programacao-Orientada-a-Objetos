package pkg;
import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Produto p1 = new Produto();
		Produto p2 = new Produto("Paçoca", 10, 200);
		
		System.out.println("Informe os valores do produto 1");
		
		System.out.println("Nome do Produto: ");
		p1.setNome (teclado.nextLine());
		
		System.out.println("Preço do Produto, em reais: ");
		p1.setPreco (teclado.nextDouble());
		
		System.out.println("Quantidade de produtos: ");
		p1.setQuantidade (teclado.nextInt());
		teclado.nextLine();
		
		System.out.println("\nProduto 1:");
        p1.exibirInformacoes();
        System.out.println("Valor Total: " + p1.calcularValorTotal());
        
        System.out.println("\nProduto 2:");
        p2.exibirInformacoes();
        System.out.println("Valor Total: " + p2.calcularValorTotal());
		
	}

}
