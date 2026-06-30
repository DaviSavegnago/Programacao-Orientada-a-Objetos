package pkg;

public class CasaMain {

    public static void main(String[] args) {

        Casa casa1 = new Casa();

        double preco1 = casa1.calcularPreco(120);

        double preco2 = casa1.calcularPreco(120, 3);

        System.out.println("Preço da casa sem considerar quartos: " + preco1);

        System.out.println("Preço da casa considerando quartos: " + preco2);
    }
}