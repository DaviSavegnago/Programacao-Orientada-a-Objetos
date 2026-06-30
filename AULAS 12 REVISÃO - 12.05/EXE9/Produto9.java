package ppkg;
import java.util.ArrayList;

public class Produto9 {
	
	private String nome;
	private double preco;
	private double quantidade;
	
	public Produto9(String nome, double preco, double quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto9 [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	

}
