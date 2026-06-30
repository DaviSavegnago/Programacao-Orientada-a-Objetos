package ppkg;

public class Gerente extends Funcionario {
	
	
	private double bonusAnual;
	
	public Gerente(String nome, double salario, double bonusAnual) {
		super(nome, salario);
		this.bonusAnual = bonusAnual;
	}

	public double aumentarSalario() {
		return setSalarioTotal(getSalario() + (getSalario() * porcentagemFixa) * bonusAnual);
	}

	@Override
	public String toString() {
		return "Gerente [bonusAnual=" + bonusAnual + "] Salário: \" + salario +\r\n" + "               \" | Bônus: \" + bonusAnual";
	}
	
}
