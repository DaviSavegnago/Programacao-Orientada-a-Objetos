package wee;

public class CalculadorPrincipal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		int resultado = c.somar(4, 3);
		System.out.println("Soma: "+resultado);
		
		resultado = c.somar(4, 7, 9);
		System.out.println("Soma 2: "+resultado);
		
		double resultado3 = c.somar(3.5, 7);
		System.out.println("Soma 3: "+resultado3);
		
		int resultado4 = c.multiplicar(8, 11);
		System.out.println("Multiplicação 1: "+resultado4);
		
		double resultado5 = c.multiplicar(4.5, 7.25);
		System.out.println("Multiplicação 2: "+resultado5);
		
		
		resultado = c.multiplicar(3,  4);
		System.out.println("1: "+resultado);
		
	}

}
