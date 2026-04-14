package pkg;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		
		CarroExercicioLocadora c = new CarroExercicioLocadora();
		
		c.atribuirValores ("VW", "Gol");
		System.out.println("Dados do carro: "+c.retornaMarca()+" e "+c.retornaModelo());
		CarroExercicioLocadora e = new CarroExercicioLocadora ();
		
	}


}