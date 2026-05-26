package ppkg;
import java.util.ArrayList;

public class ReservaMain {
	
	public static void main(String[] args) {
		
		ArrayList<Object> reservas = new ArrayList<>();
		
		
		//LISTA COM AS RESERVAS COM ARRAYLIST
		reservas.add(new ReservaOnline("Davi", 911, 1000, "ATIVA", "CUPOM: ONLINEVALE"));
		reservas.add(new ReservaPresencial ("Thiago", 415, 1200, "ATIVA"));
		reservas.add(new ReservaOnline("Weverton", 901, 1000, "ATIVA", "CUPOM: ONLINEVALE"));
		reservas.add(new ReservaPresencial ("Augusto", 45, 1200, "CANCELADA"));
		reservas.add(new ReservaOnline("Marcelo", 931, 1000, "ATIVA", "CUPOM: ONLINEVALE"));
		reservas.add(new ReservaPresencial ("Breno", 445, 1200, "CANCELADA"));
		reservas.add(new ReservaOnline("Julio", 951, 1000, "ATIVA", "CUPOM: ONLINEVALE"));
		reservas.add(new ReservaPresencial ("Paulo", 475, 1200, "CANCELADA"));
		reservas.add(new ReservaOnline("Thiago G", 981, 1000, "ATIVA", "CUPOM: ONLINEVALE"));
		reservas.add(new ReservaPresencial ("Caique", 475, 1200, "ATIVA"));
		reservas.add(new ReservaPresencial ("David", 485, 1200, "ATIVA"));
		
		for (Object r : reservas) {
			System.out.println(r);
		}
		
		System.out.println("\n\n\n"); //Não sei se precisava disso, fiz pra testar
		ReservaOnline o = new ReservaOnline("Davi", 123, 1000, "ATIVA", "CUPOM = ONLINEVALE");
		o.realizarReserva();
		System.out.println("\n Se quiser cancelar:");
		o.cancelarReserva();
		
		System.out.println("\n\n\n"); //Não sei se precisava disso, fiz pra testar
		ReservaPresencial p = new ReservaPresencial("Leandro", 113, 1100, "ATIVA");
		p.realizarReserva();
		System.out.println("\n Se quiser cancelar:");
		p.cancelarReserva();


	}

}
