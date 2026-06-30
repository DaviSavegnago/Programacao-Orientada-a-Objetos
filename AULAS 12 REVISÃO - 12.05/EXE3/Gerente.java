package ppkg;

import java.util.Scanner;

public class Gerente extends Funcionario {
	
	public void calcularSalario() {
		salarioBonificado = salario + bonus;
		
		System.out.println("Salário: R$"+salario);
		System.out.println("Bônus: R$"+bonus);
		System.out.println("Salário Bonificado: R$"+salarioBonificado);
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Gerente g = new Gerente();
		
		System.out.println("Informe o salário base do gerente: ");
		g.setSalario(teclado.nextDouble());
		teclado.nextLine();
		System.out.println("Informe o bônus recebido pelo gerente: ");
		g.setBonus(teclado.nextDouble());
		
		g.calcularSalario();
		
	}

}