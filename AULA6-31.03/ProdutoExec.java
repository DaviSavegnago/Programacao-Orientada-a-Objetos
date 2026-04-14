package pkg;

import java.util.Scanner;

public class ProdutoExec {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do seu produto: ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe o preço do seu produto, em reais: ");
		double preco = teclado.nextDouble();
		
		System.out.println("Informe a quantidade que você tem do seu produto: ");
		int quantidade = teclado.nextInt();
		
		Produto p = new Produto(nome, preco, quantidade);

	    System.out.println("Valor total em estoque: R$ " + p.calcularValorTotalEstoque());

	    System.out.println("Tem estoque? " + p.temEstoque());

	    // adicionar estoque
	    System.out.println("Quanto deseja adicionar?");
	    int add = teclado.nextInt();
	    p.adicionarEstoque(add);

	    System.out.println("Nova quantidade: " + p.quantidade);
	    
	    // vender
	    System.out.println("Quanto deseja vender?");
	    int venda = teclado.nextInt();

	    boolean resultado = p.vender(venda);

	    if (resultado) {
	    	System.out.println("Venda realizada");
	    } else {
	    	System.out.println("Estoque insuficiente");
	        }

	    System.out.println("Quantidade final: " + p.quantidade);
	    }

	}
