package ppkg;

public class Reserva {
    protected String codigo;

    public Reserva(String codigo) {
        this.codigo = codigo;
    }

    public void adicionar() {
        System.out.println("Criando uma reserva genérica.");
    }

    public void cancelar() {
        System.out.println("Cancelando uma reserva genérica.");
    }
}

// Classe derivada para Hotel
class ReservaDeHotel extends Reserva {
    private String nomeHotel;

    public ReservaDeHotel(String codigo, String nomeHotel) {
        super(codigo);
        this.nomeHotel = nomeHotel;
    }

    @Override
    public void adicionar() {
        System.out.println("Reserva de quarto no hotel " + nomeHotel + " confirmada! (Código: " + codigo + ")");
    }

    // Sobrescreve com a política de cancelamento do hotel
    @Override
    public void cancelar() {
        System.out.println("Cancelando reserva no " + nomeHotel + " (Código: " + codigo + ").");
        System.out.println("-> Política: Cancelamento gratuito em até 24h antes do check-in.");
    }
}

class ReservaDeVoo extends Reserva {
    private String numeroVoo;

    public ReservaDeVoo(String codigo, String numeroVoo) {
        super(codigo);
        this.numeroVoo = numeroVoo;
    }

    @Override
    public void adicionar() {
        System.out.println("Voo " + numeroVoo + " reservado! (Código: " + codigo + ")");
    }

    public void adicionar(String classeAssento) {
        System.out.println("Voo " + numeroVoo + " reservado na classe [" + classeAssento + "]! (Código: " + codigo + ")");
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando voo " + numeroVoo + " (Código: " + codigo + ").");
        System.out.println("-> Política: Sujeito a multa de 15% do valor da passagem.");
    }
}

public class RMain {
    public static void main(String[] args) {
        System.out.println("--- Criação das Reservas --- \n");

        ReservaDeHotel hotel = new ReservaDeHotel("H1020", "Hotel Copacabana");
        hotel.adicionar();

        ReservaDeVoo vooExecutivo = new ReservaDeVoo("V777", "A320-LATAM");
        vooExecutivo.adicionar("Executiva"); 

        System.out.println("\n--- Cancelamento usando Polimorfismo --- \n");

        Reserva[] minhasReservas = new Reserva[2];
        minhasReservas[0] = hotel;
        minhasReservas[1] = vooExecutivo;

        for (int i = 0; i < minhasReservas.length; i++) {
            minhasReservas[i].cancelar();
            System.out.println();
        }
    }
}
