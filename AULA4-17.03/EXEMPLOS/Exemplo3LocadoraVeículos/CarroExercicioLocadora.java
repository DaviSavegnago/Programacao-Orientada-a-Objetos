package pkg;

public class CarroExercicioLocadora {
	
		public String marca;
		public String modelo;
		
		public CarroExercicioLocadora () {
			System.out.println("Estou no construtor");
		}
		
		
		public void atribuirValores(String ma, String mod) {
			marca = ma;
			modelo = mod;
	}
		
		public String retornaMarca () {
			return marca;
		}
		
		public String retornaModelo () {
			return modelo;
		}
	
}