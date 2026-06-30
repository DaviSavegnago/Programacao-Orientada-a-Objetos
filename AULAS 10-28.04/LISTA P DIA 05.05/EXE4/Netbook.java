import java.util.Scanner;

public class Netbook extends Computador {

    public Netbook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return getMarca();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do Netbook: ");
        String marca = sc.nextLine();

        Netbook n = new Netbook(marca);

        System.out.println("Marca: " + n.exibeMarca());
        System.out.println("Modelo: " + n.exibeModelo());

        sc.close();
    }
}