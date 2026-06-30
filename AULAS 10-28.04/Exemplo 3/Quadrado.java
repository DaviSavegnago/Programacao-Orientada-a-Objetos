package pkg3;

public class Quadrado extends Desenho2D{
	
	protected String desc ;

	public Quadrado(int largura, int altura, String nomeAutor, String desc) {
		super(largura, altura, nomeAutor);
		this.desc = desc;
	}
	
	public void exibirDados() {
		
		System.out.println("Largura: "+this.largura);
		System.out.println("Altura: "+this.altura);
		System.out.println("Descrição: "+this.desc);
		System.out.println("Nome Autor: "+this.nomeAutor);
		
	}
	

}
