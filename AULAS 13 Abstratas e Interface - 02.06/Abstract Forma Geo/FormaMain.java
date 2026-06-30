package aula0206;

public class FormaMain {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(3.4);
		System.out.println("Área do círculo: "+c.area());
		System.out.println("Perímetro do círculo: "+c.perimetro());
		
		System.out.println("\n");
		
		Retangulo r = new Retangulo(22, 4);
		System.out.println("Área do retângulo: "+r.area());
		System.out.println("Perímetro do retângulo: "+r.perimetro());
		
		

	}

}
