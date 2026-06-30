package ppkg;

public class Produto {
	
	private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public double calcularPrecoFinal(double preco) {
        double imposto = preco * 0.05; 
        return preco + imposto;
    }

    public double calcularPrecoFinal(double preco, Cliente cliente) {
        double precoComImposto = this.calcularPrecoFinal(preco);
        double valorDesconto = precoComImposto * cliente.getDesconto();
        return precoComImposto - valorDesconto;
    }
}
