package pkg3;

public class PessoaJuridica extends Pessoa {
	
	protected String CNPJ;
	protected String socio;
	protected String dtAbertura;
	
	public PessoaJuridica(String nome, int idade, String CNPJ, String socio, String dtAbertura) {
		super(nome, idade);
		
	}
	
	
}
