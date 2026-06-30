abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularSalario();
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + (salario * 0.20);
    }
}

class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario + (salario * 0.10);
    }
}

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000);
        Vendedor vendedor = new Vendedor("Pedro", 3000);

        System.out.println("Salário do gerente: R$ " +
                gerente.calcularSalario());

        System.out.println("Salário do vendedor: R$ " +
                vendedor.calcularSalario());
    }
}