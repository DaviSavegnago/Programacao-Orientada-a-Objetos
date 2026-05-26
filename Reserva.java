package ppkg;

public class Reserva { //Classe Reserva
	
	private String nomeCliente;
	private int numeroQuarto;
	private double valorDiaria;
	private String statusReserva;
	
	public Reserva(String nomeCliente, int numeroQuarto, double valorDiaria, String statusReserva) {
	this.nomeCliente = nomeCliente;
	this.numeroQuarto = numeroQuarto;
	this.valorDiaria = valorDiaria;
	this.statusReserva = statusReserva;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	
	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	
	public String getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(String statusReserva) {
		this.statusReserva = statusReserva;
	}

	////
	
	public void realizarReserva() {
		System.out.println("Reserva Realizada, informações: ");
		System.out.println("Nome: "+nomeCliente);
		System.out.println("Número do Quarto: "+numeroQuarto);
		System.out.println("Valor da Diária: "+valorDiaria);
		System.out.println("Status da Reserva: "+statusReserva);
	}
	
	public void cancelarReserva() {
		System.out.println("RESERVA CANCELADA");
	}

	@Override
	public String toString() {
		return "Reserva [Nome do Cliente = " + nomeCliente + ", Numero do Quarto = " + numeroQuarto + ", Valor da Diaria = " + valorDiaria
				+ ", Status da Reserva = " + statusReserva + "]";
	}
	
}
