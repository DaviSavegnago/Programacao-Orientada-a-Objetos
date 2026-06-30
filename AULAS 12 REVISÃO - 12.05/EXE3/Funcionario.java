package ppkg;

//3 - Crie uma classe Funcionario com um método calcularSalario(). Em seguida, crie uma classe
//Gerente que herda da classe Funcionario e sobrescreve o método calcularSalario() para calcular
//o salário do gerente com base em um bônus e imprimir o resultado.

public class Funcionario {
	
	protected double salario;
	protected double bonus;
	protected double salarioBonificado;
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalarioBonificado() {
		return salarioBonificado;
	}

	public void setSalarioBonificado(double salarioBonificado) {
		this.salarioBonificado = salarioBonificado;
	}

	public void calcularSalario() {
		salarioBonificado = salario + bonus;
		
		System.out.println("Salário: R$"+salario);
		System.out.println("Bônus: "+bonus);
		System.out.println("Salário Bonificado: R$"+salarioBonificado);
		
	}

}
