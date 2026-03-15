package pkg;

import java.util.Scanner;

public class Aula1Program {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal!");
		System.out.print("Olá Pessoal!\n");
		int idade;
		idade = 18;
		System.out.println("A idade é: "+idade);
		System.out.println("O indivíduo tem "+idade+" anos");
		
		char c = 'r';
		System.out.println("O char é: "+c);
		
		float f = 3.14f;
		System.out.println("O float é: "+f);
		
		double d = 3.1415;
		System.out.println("O double é: "+d);
		
		String nome; //o que vou ler 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = teclado.nextLine();
		System.out.println("O nome digitado: "+nome);
		
		int n;
		System.out.println("Digite um inteiro: ");
		n = teclado.nextInt();
		System.out.println("Foi digitado: "+n);
		
		float h;
		System.out.println("Digite um float");
		h = teclado.nextFloat();
		System.out.println("Foi digitado: "+h);
		
		double i;
		System.out.println("Digite um double");
		i = teclado.nextDouble();
		System.out.println("Foi digitado: "+i);
		
		int idd;
		System.out.println("Digite uma idade");
		idd = teclado.nextInt();
		System.out.println("Idade digitada: "+idd);
		if(idade>=18) {
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}
		
		int opcao;
		System.out.println("Digite uma opção: ");
		System.out.println("Digite 1 para cadastrar");
		System.out.println("Digite 2 para consultar");
		System.out.println("Digite 3 para sair");
		opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Aqui vou cadastrar");
			break;
		case 2:
			System.out.println("Aqui vou consultar");
			break;
		case 3:
			System.out.println("Aqui vou consultar");
			break;
		default:
			System.out.println("Digite uma operação válida!!!");
			break;
		}
	
		
		
		// sysout + ctrl + espaço + enter = puxa o System.out...
		//alt shift r = troca a palavra em todas linhas
		// ctrl d = apaga a linha do mouse
		// ctrl  + shift + /
		
	}

}
