package pkg;

public class Onibus extends Carro{
	
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override //não necessário
	public void exibirMensagem() {
		System.out.println("Estou na classe ônibus");
		System.out.println("O ônibus é: "+nome);
		System.out.println("Modelo: "+modelo);
	}

}
