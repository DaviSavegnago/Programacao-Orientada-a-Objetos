package pkg;

public class Casa {

    public double calcularPreco(int tamanho) {

        double preco = tamanho * 2000;

        return preco;
    }

    public double calcularPreco(int tamanho, int quartos) {

        double preco = (tamanho * 2000) + (quartos * 10000);

        return preco;
    }
}