package ppkg;

//2 - Crie uma classe Produto com um método desconto(). Em seguida, crie uma classe
//ProdutoComDesconto que herda da classe Produto e sobrescreve o método desconto() para
//calcular o desconto do produto com base em um valor predefinido e imprimir o preço com desconto.

public class Produto {
	
	double precoComDesconto;
	double preco;
	
	public double getPrecoComDesconto() {
		return precoComDesconto;
	}

	public void setPrecoComDesconto(double precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void desconto() {
		precoComDesconto = preco * 0.9;
		
		System.out.println("Preço original: R$"+preco);
		System.out.println("Preço com desconto de 10%: R$"+precoComDesconto);
		
	}
	
	

}
