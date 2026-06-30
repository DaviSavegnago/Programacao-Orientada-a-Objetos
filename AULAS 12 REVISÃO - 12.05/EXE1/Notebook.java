package ppkg;
import java.util.Scanner;

public class Notebook extends Computador {

	public Notebook(String marca ) {
		super(marca, "Portátil");
	}
	
	public String exibeMarca() {
		return getMarca();
	}
	
	  public static void main(String[] args) {
		  
		  Scanner teclado = new Scanner (System.in);
		  
		  System.out.println("Informe a marca do notebook: ");
		  String marca = teclado.nextLine();
		  
		  Notebook n = new Notebook(marca);
		  
		  System.out.println("Marca: "+n.exibeMarca());
		  System.out.println("Modelo: "+n.exibeModelo());
	  }
}
