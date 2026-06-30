package pkg;

public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.nome = "Fusca";
		c.exibirMensagem();
		
		Onibus o = new Onibus();
		o.nome = "Efal";
		o.setModelo("OM-1519");
		o.exibirMensagem();
		
		
		
	}

}
