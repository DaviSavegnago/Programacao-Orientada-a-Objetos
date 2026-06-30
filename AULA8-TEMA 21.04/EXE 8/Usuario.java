package pkg;

/*
8) Crie uma classe Usuario com os atributos:
nomeUsuario (String)
senha (String)
logado (boolean, inicialmente false)
Implemente:
Um método login(String usuario, String senha) que valida os dados e muda o valor de logado para true se estiver correto
Um método logout() que define logado como false
Um método exibirStatus() que mostra se o usuário está logado ou não
Na Main:
Crie um usuário com nome e senha definidos no código
Peça que o usuário digite os dados via teclado para fazer login
Mostre se o login foi bem-sucedido e permita o logout
*/

public class Usuario {
	
	private String nomeUsuario;
	private String senha;
	private boolean logado = false; // começa false
	
	 public Usuario(String nomeUsuario, String senha) {
	        this.nomeUsuario = nomeUsuario;
	        this.senha = senha;
	 }
	
	public void login(String usuario, String senha) {
		if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
			logado = true;
		} else {
			logado = false;
		}
	}
	
	public void logout() {
		logado = false;
	}
	
	public void exibirStatus() {
		if (logado) {
			System.out.println("O usuário está logado");
		} else {
			System.out.println("O usuário não está logado");
		}
	}

}