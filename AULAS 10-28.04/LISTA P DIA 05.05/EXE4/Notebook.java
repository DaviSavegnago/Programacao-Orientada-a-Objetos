import java.util.Scanner;

public class Notebook extends Computador {

    public Notebook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return getMarca();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do Notebook: ");
        String marca = sc.nextLine();

        Notebook n = new Notebook(marca);

        System.out.println("Marca: " + n.exibeMarca());
        System.out.println("Modelo: " + n.exibeModelo());

        sc.close();
    }
}