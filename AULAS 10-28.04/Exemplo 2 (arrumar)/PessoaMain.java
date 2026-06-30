package pkg3;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Davi", 21);
		p.exibirDados();
		
		PessoaJuridica pj1 = new PessoaJuridica("Empresa", 40);
		pj1.exibirDados();
		
		PessoaJuridica pj2 = new PessoaJuridica("Empresa 2", 40, "123456789-0", "José", "28/04/2026");
		pj1.exibirDados();
		
		
		
	}

}
