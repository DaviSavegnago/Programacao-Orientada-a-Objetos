package pkg;

public class execCalculadora {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();

		double resultado;
		resultado = c.somar(4.89, 5.33);
		
		System.out.println("Resultado da soma é: "+resultado);
		

	}

}