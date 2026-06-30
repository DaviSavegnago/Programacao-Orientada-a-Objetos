package aula0206;

abstract public class Animal { //classe abstrato, não pode ser instanciada
	
	public String especie;
	public int idade;
	
	public abstract void emitirSom();				// método abstrato
	
	public void exibirInfos() {						//método normal
		System.out.println("Espécie: "+especie);		
		System.out.println("Idade: "+idade);
	}
		

}
