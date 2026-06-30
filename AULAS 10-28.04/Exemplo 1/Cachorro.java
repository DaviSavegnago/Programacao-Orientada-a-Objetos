package pkg;

public class Cachorro extends Animal {
	
	private String raça;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public void latir() {
		System.out.println("AUAUAUAUAUAU");
	}
	
	//@Override //não necessário
	//public void exibirMensagem() {
	//	System.out.println("Raça: "+raça);
	//}

}
