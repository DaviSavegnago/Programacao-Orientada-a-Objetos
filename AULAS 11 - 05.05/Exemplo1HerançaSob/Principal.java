package wee;

public class Principal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.fazerSom();
		
		System.out.println("\n\tCachorro!! ");
		a = new Cachorro();
		a.fazerSom();
		
		System.out.println("\n\tPeixeeee!!!");
		Peixe p = new Peixe();
		p.fazerSom();
		
		System.out.println("\n\tPassarinho!");
		Passarinho pa = new Passarinho();
		pa.fazerSom();
		
		//Cachorro c = new Cachorro();
		//c.fazerSom();
		
		
		
	}

}
