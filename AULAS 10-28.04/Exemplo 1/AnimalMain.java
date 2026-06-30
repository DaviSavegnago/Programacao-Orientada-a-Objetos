package pkg;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		c.nome = "Malu";
		c.idade = 12;
		c.som = "Ela late!!";
		c.setRaça("Perdigueiro");
		c.exibirMensagem();
		c.latir();
		
	}

}
