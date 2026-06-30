package pkg;

/*
7) Crie uma classe Produto com os atributos:
nome (String)
preco (double)
quantidade (int)
Implemente:
Um método exibirInformacoes() que exibe os dados do produto
Um método calcularValorTotal() que retorna o valor total em estoque (preço x quantidade)
Na Main:
Crie dois produtos, sendo um com valores informados via teclado e outro com valores definidos no código
Exiba as informações e o valor total de cada produto
*/

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		
	}

	public void exibirInformacoes() {
		System.out.println("Nome do Produto: "+nome);
		System.out.println("Preço: "+preco);
		System.out.println("Quantidade: "+quantidade);
	}
	
	public double calcularValorTotal() {
		return preco * quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
