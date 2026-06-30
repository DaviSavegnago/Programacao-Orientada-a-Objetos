package ppkg;
import java.util.Scanner;

public class Netbook extends Computador {

	public Netbook(String marca) {
		super(marca, "Portátil");
	}
	
	public String exibeMarca() {
		return getMarca();
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe a marca do netbook: ");
		String marca = teclado.nextLine();
		
		Netbook n1 = new Netbook(marca);
		
		System.out.println("Marca: "+n1.exibeMarca());
		System.out.println("Modelo: "+n1.exibeModelo() );
		
	}

}
