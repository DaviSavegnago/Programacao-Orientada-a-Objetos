package aulainterf;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		c.nome = "Malu";
		c.idade = 12;
		c.raca = "Pointer";
		c.emitirSom();
		c.exibirInfos();
		System.out.println("Vacina: "+c.verficarVacinacao());
		
		System.out.println("\n");
		
		Gato g = new Gato();
		g.emitirSom();
		g.exibirInfos();
		System.out.println("Vacina: "+g.verficarVacinacao());
		

	}

}
