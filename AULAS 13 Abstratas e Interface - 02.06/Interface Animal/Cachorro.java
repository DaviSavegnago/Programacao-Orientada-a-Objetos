package aulainterf;

public class Cachorro implements Animal {
	
	String nome;
	String raca;
	int idade;
	
	public void emitirSom() {
		System.out.println("AAUAUAUAUAUAUAUAUAAU");
	}
	
	public void exibirInfos() {
		System.out.println("Cachorro: ");
		System.out.println("Nome: "+nome);
		System.out.println("Raça: "+raca);
		System.out.println("Idade: "+idade);
	}

	@Override
	public boolean verficarVacinacao() {
		System.out.println("VERICANDO VACINA");
		return false;
	}

}