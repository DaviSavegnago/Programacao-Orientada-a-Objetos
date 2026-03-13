package pkg;

import java.util.Scanner;

public class Exercicio1Aula2402 {
	
	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		double resultadoSoma;
		double resultadoSubtracao;
		double resultadoMultiplicacao;
		double resultadoDivisao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero1 = teclado.nextDouble();
		System.out.println("Digite outro número: ");
		numero2 = teclado.nextDouble();
		
		resultadoSoma = numero1 + numero2;
		resultadoSubtracao = numero1 - numero2;
		resultadoMultiplicacao = numero1 * numero2;
		resultadoDivisao = numero1 / numero2;
		
		System.out.println("O resultado da soma desses números é: "+resultadoSoma);
		System.out.println("O resultado da subtração do 1º Número pelo 2º Número é: "+resultadoSubtracao);
		System.out.println("O resultado da multiplicação desses números é: "+resultadoMultiplicacao);
		System.out.println("O resultado da divisão do 1º Número pelo 2º Número é: "+resultadoDivisao);
		
	}

}