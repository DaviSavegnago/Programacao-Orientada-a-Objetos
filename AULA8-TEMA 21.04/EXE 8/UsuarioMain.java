package pkg;
import java.util.Scanner;

public class UsuarioMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Usuario u1 = new Usuario("Davi", "J2#J3");
		
		System.out.println("Digite o usuário:");
        String usuario = teclado.nextLine();

        System.out.println("Digite a senha:");
        String senha = teclado.nextLine();

        u1.login(usuario, senha);
        
        if (usuario.equals("Davi") && senha.equals("J2#J3")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login inválido!");
        }

        u1.exibirStatus();

        System.out.println("Deseja fazer logout? (digite: Sim ou Não)");
        String op = teclado.nextLine();

        if (op.equals("Sim")) {
            u1.logout();
            u1.exibirStatus();
        }
		
	}

}
