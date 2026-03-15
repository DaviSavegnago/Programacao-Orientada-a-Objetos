package pkg;

import java.util.Scanner;

public class execAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float mediaNotas;
		
		Aluno a1 = new Aluno();
		System.out.println("DADOS DO ALUNO");
		System.out.println("Digite seu nome: ");
		a1.nome = teclado.nextLine();
		System.out.println("Digite sua matrícula: ");
		a1.matricula = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Informe sua nota 1: ");
		a1.nota1 = teclado.nextFloat();
		System.out.println("Informe sua nota 2: ");
		a1.nota2 = teclado.nextFloat();
		System.out.println("Informe sua nota 3: ");
		a1.nota3 = teclado.nextFloat();
		
		mediaNotas = (a1.nota1 + a1.nota2 + a1.nota3) / 3;
		
		System.out.println("Nome: "+a1.nome);
		System.out.println("Matrícula: "+a1.matricula);
		System.out.println("Nota 1: "+a1.nota1);
		System.out.println("Nota 2: "+a1.nota2);
		System.out.println("Nota 3: "+a1.nota3);
		System.out.println("Média das notas: "+mediaNotas);
		
		if (mediaNotas >= 6) {
			System.out.println("APROVADO!!");
		}
		else {
			System.out.println("REPROVADO!!");
		}
		
		
		

	}

}
