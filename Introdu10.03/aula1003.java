package pkg;

import java.util.Scanner;

public class aula1003 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		 int n;
		 Aluno a1 = new Aluno();
		 a1.nome = "Esthevan";
		 a1.matricula = "102030";
		 a1.cpf = "12134578010";
		 System.out.println ("Aluno instanciado");
		 System.out.println ("Nome: "+a1.nome);
		 System.out.println ("Matricula: "+a1.matricula);
		 System.out.println ("CPF: "+a1.cpf);
		 
		 Aluno a2 = new Aluno();
		 a2.nome = "Leonardo";
		 a2.matricula = "102033";
		 a2.cpf = "12134578034";
		 System.out.println("Aluno 2 instanciado");
		 System.out.println ("Nome: "+a2.nome);
		 System.out.println ("Matrícula: "+a2.matricula);
		 System.out.println ("CPF: "+a2.cpf);
		 
		 Aluno a3 = new Aluno();
		 System.out.println("Digite o nome do Aluno 3");
		 a3.nome = teclado.nextLine();
		 System.out.println("Digite a matrícula do Aluno 3");
		 a3.matricula = teclado.nextLine();
		 System.out.println("Digite o CPF do Aluno 3");
		 a3.cpf = teclado.nextLine();
		 System.out.println("Digite a idade do Aluno 3");
		 a3.idade = teclado.nextInt();
		 teclado.next();
		 System.out.println("Aluno 3 instanciado");
		 System.out.println ("Nome: "+a3.nome);
		 System.out.println ("Matrícula: "+a3.matricula);
		 System.out.println ("CPF: "+a3.cpf);
		 System.out.println ("Idade: "+a3.idade);
		 
		 

	}

}
