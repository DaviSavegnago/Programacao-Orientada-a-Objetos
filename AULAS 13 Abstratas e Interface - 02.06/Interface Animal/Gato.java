package aulainterf;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU MIAU MIAU MIAU");
	}

	@Override
	public void exibirInfos() {
		System.out.println("Gato: ");
	}

	@Override
	public boolean verficarVacinacao() {
		System.out.println("VERICANDO VACINA");
		return true;
	}

}
