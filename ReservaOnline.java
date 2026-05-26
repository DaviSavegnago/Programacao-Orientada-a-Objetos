package ppkg;

public class ReservaOnline extends Reserva { //Subclasse
	
	private String cupom;
	
	public ReservaOnline(String nomeCliente, int numeroQuarto, double valorDiaria, String statusReserva, String cupom) {
		super(nomeCliente, numeroQuarto, valorDiaria, statusReserva);
		this.cupom = cupom;
	}
	

	//OVERRIDE
	public void realizarReserva() {
		System.out.println("Reserva Online Realizada, informações: ");
		System.out.println("Nome: "+getNomeCliente());
		System.out.println("Número do Quarto: "+getNumeroQuarto());
		System.out.println("Valor da Diária: "+getValorDiaria());
		System.out.println("Status da Reserva: "+getStatusReserva());
		System.out.println("Cupom de Desconto: "+cupom);;
	}
	
	//OVERLOAD
	public void realizarReserva(String nomeCliente, String cupom) { 
		System.out.println("Nome: "+nomeCliente);
		System.out.println("Cupom de Desconto: "+cupom);
		System.out.println("Como você fez uma reserva online, pode apenas informar seu nome, se preferir: ");
		System.out.println("Demais dados serão apresentados na chegada ao Hotel");
	}
	
	public void cancelarReserva() {
		System.out.println("Cancelamento só pode ser feito até 24 horas antes da hospedagem.");
	}

	public String toString() {
		return "Reserva feita de Forma Online [Nome do Cliente = " + getNomeCliente() + ", Numero do Quarto = " + getNumeroQuarto() + ", Valor da Diaria = " + getValorDiaria()
				+ ", Status da Reserva = " + getStatusReserva() + ", Cupom de Desconto Online: " +cupom+ "]";
	}

}
