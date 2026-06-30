package ppkg;


//• Crie um array de Funcionario que inclua Gerente e Desenvolvedor, e demonstre a
//aplicação dos aumentos de salário e a impressão das informações.


public class Funcionario {
	
	private String nome;
	private double salario;
	private double salarioTotal;
	public double porcentagemFixa = 0.05;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public double aumentarSalario() {
		return setSalarioTotal (salario + (salario * porcentagemFixa));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public double setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
		return salarioTotal;
	}
	

}
