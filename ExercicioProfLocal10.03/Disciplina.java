package pkg;

public class Disciplina {

	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.nome = "Ricardo";
		
		Laboratorio l1 = new Laboratorio();
		l1.local = "Sala 108";
		
		System.out.println("O nome do professor é: "+p1.nome);
		System.out.println("O local da aula é: "+l1.local);
		
	}

}
