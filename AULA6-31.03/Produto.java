package pkg;

import java.util.Scanner;


//1 - Crie uma classe chamada Produto com os atributos nome, preco e quantidade. 
//Crie um construtor que inicialize esses atributos. Implemente os métodos calcularValorTotalEstoque(), 
//que deve retornar o valor total do estoque (preço multiplicado pela quantidade), temEstoque(), 
//que retorna true se a quantidade for maior que zero, adicionarEstoque(int quantidade), que adiciona produtos ao estoque, 
//e vender(int quantidade), que diminui a quantidade em estoque apenas se houver produtos suficientes, 
//retornando true caso a venda seja realizada e false caso contrário.

public class Produto {
	
		String nome;
		double preco;
		int quantidade;
		
		// construtor
	    public Produto(String nome, double preco, int quantidade) {
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidade = quantidade;
	    }

	    public double calcularValorTotalEstoque() {
	        return preco * quantidade;
	    }

	    public boolean temEstoque() {
	        return quantidade > 0;
	    }

	    public void adicionarEstoque(int quantidade) {
	        this.quantidade += quantidade;
	    }

	    public boolean vender(int quantidade) {
	        if (this.quantidade >= quantidade) {
	            this.quantidade -= quantidade;
	            return true;
	        } else {
	            return false;
	        }

	
	    }
}
