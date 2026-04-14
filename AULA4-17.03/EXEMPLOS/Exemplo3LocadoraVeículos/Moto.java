package pkg;

public class Moto {
	
	public String marca;
	public String modelo;
	public int cilindradas;
	
	public void atribuirValores(String ma, String mod, int cili){
		marca = ma;
		modelo = mod;
		cilindradas = cili;
	}
	
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
	public int retornaCilindradas() {
		return cilindradas;
	}

}
