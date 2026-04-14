package pkg;

import java.util.InputMismatchException;

import java.util.Scanner;

//6 - Escreva um programa que tenha um valor fixo de premiação (ex: double premio = 5000.0). 
//Peça ao usuário para digitar quantos ganhadores dividirão esse prêmio.
//Tratamento 1: Use ArithmeticException para o caso de o usuário digitar 0 (divisão por zero).
//Tratamento 2: Use InputMismatchException para garantir que ele digitou um número inteiro.

public class Exercicio6Aula5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double premio = 5000.0;
		
		try {
		System.out.println("Informe quantos ganhadores terão que dividir esse prêmio: ");
		int numeroGanhadores = teclado.nextInt();
		teclado.nextLine();
		
		if (numeroGanhadores == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
		
		double premioCada = premio / numeroGanhadores;
		System.out.println("Cada um ficará com R$"+premioCada);
		
		} catch (ArithmeticException e) {
			System.out.println("Alguém vai ganhar, não pode 0!");
		} catch (InputMismatchException e) {
			System.out.println("ERRO!!!! Informe um número inteiro!!!!!");
		}
		
	}

}