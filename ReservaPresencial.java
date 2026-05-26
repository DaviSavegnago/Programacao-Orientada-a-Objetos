package ppkg;

public class ReservaPresencial extends Reserva { //Subclasse
	
	
	public ReservaPresencial(String nomeCliente, int numeroQuarto, double valorDiaria, String statusReserva) {
		super(nomeCliente, numeroQuarto, valorDiaria, statusReserva);
	}
	
	public void realizarReserva() {
		System.out.println("Reserva Presencial Realizada, informações: ");
		System.out.println("Nome: "+getNomeCliente());
		System.out.println("Número do Quarto: "+getNumeroQuarto());
		System.out.println("Valor da Diária: "+getValorDiaria());
		System.out.println("Status da Reserva: "+getStatusReserva());	
	}
	
	public void cancelarReserva() {
		System.out.println("Cancelamento deve ser realizado diretamente na recepção.");
	}
	
	public String toString() {
		return "Reserva feita de Forma Presencial [Nome do Cliente = " + getNomeCliente() + ", Numero do Quarto = " + getNumeroQuarto() + ", Valor da Diaria = " + getValorDiaria()
				+ ", Status da Reserva = " + getStatusReserva() + "]";
	}

}
