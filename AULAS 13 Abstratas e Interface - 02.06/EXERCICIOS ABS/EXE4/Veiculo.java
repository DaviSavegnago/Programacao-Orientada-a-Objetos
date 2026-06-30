abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void acelerar();

    public abstract void frear();
}

class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2024);
        Moto moto = new Moto("Honda", "CG 160", 2023);

        carro.acelerar();
        carro.frear();

        System.out.println();

        moto.acelerar();
        moto.frear();
    }
}