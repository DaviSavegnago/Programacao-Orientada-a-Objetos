package pkg;

import java.util.Scanner;

public class Exercicio2Aula2402 {
	
	public static void main(String[] args) {
		
		double odometroInicial;
		double odometroFinal;
		double kmTotal;
		double combustivelGasto;
		double mediaConsumo;
		double valorTotalRecebido;
		double lucroDia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quantos quilômetros o odômetro marcava no início da corrida: ");
		odometroInicial = teclado.nextDouble();
		System.out.println("Informe quantos quilômetros o odômetro marcava no final da corrida: ");
		odometroFinal = teclado.nextDouble();
		kmTotal = odometroFinal - odometroInicial;

		System.out.println("Informe quantos litros de combustível foram gastos nesse dia: ");
		combustivelGasto = teclado.nextDouble();
		mediaConsumo = kmTotal / combustivelGasto;
		
		System.out.println("Informe qual foi o valor total, em reais, recebido dos passageiros nesse dia: ");
		valorTotalRecebido = teclado.nextDouble();
		lucroDia = valorTotalRecebido - (combustivelGasto * 4.90);
		
		System.out.println("A média de do consumo em km/l foi de: "+mediaConsumo);
		System.out.println("O lucro líquido do dia foi de: R$"+lucroDia);
		
	}

}
