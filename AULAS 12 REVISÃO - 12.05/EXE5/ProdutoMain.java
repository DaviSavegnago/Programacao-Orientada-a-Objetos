package ppkg;

public class ProdutoMain {

	public static void main(String[] args) {
		
		Produto p = new Produto("Mesa de Pebolim");
		Cliente c = new Cliente ("Eusébio", 0.15);
		
		double precoBase = 1000.0;
		
        double precoNormal = p.calcularPrecoFinal(precoBase);
        System.out.println("Preço normal para clientela geral: R$ " + precoNormal);

        double precoClienteEspecial = p.calcularPrecoFinal(precoBase, c);
        System.out.println("Preço final para o cliente de longa data " + c.getNome() + ": R$ " + precoClienteEspecial);

	}

}
