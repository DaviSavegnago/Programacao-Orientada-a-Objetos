package ppkg;

public class Desenvolvedor extends Funcionario {
	
	
	private double horasExtra;
	
	public Desenvolvedor(String nome, double salario, double horasExtra) {
		super(nome, salario);
		this.horasExtra = horasExtra;
	}

	public double aumentarSalario() {
		return setSalarioTotal(getSalario() + (getSalario() * porcentagemFixa) + (100 * horasExtra));
	}
	
	@Override
    public String toString() {
        return "Desenvolvedor: " + getNome() +
               " | Salário: " + getSalario() +
               " | Horas extras: " + horasExtra;
    }

}
