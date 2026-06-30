package aula0206;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Cachorro c = new Cachorro();
		Tigre t = new Tigre();
		
		c.emitirSom();
		t.emitirSom();
		
		System.out.println("\n");
		
		//instanciando pela classe animal
		
		int op;
		
		System.out.println("Digite 1 para instanciar um cachorro ou 2 para instanciar um tigre: ");
		op = teclado.nextInt();
		
		if(op == 1) {
			Cachorro a = new Cachorro();
			a.especie = "Cuscus";
			a.idade = 13;
			a.raca = "Pointer";
			a.exibirInfos();
			a.emitirSom();
			a.cuidarPatio();
		} else {
			Animal a = new Tigre();
			a.especie = "Bengaludos";
			a.idade = 43;
			a.exibirInfos();
			a.emitirSom();
		}

		
	}

}
