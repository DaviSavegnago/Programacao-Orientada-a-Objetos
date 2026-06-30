package aula0206;

public class Circulo extends Forma {
	
	public double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	public double area() {
		return 2 * Math.PI * Math.pow(raio, 2);
	}
	
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

}
