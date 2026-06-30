package aula0206;

public class Cachorro extends Animal {
	
	public String raca;

	@Override
	public void emitirSom() {
		System.out.println("AUAUAUAUAUAUAUAUAUAUAUAUAUAUAUA");
	}
	
	public void cuidarPatio() {
		System.out.println("CUIDANDO DO PATIO...");
	}
	
	public void exibirInfos() {	
		System.out.println("Espécie: "+especie);		
		System.out.println("Idade: "+idade);
		System.out.println("Raça: "+raca);
	}
	
	
}
