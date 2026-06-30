abstract class Pessoa {

    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public abstract void efetuarCompra();
}

class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra() {
        System.out.println(nome + " realizou uma compra usando CPF " + cpf);
    }
}

class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    @Override
    public void efetuarCompra() {
        System.out.println(nome + " realizou uma compra usando CNPJ " + cnpj);
    }
}

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica(
                "João",
                "Santa Maria",
                "123.456.789-00"
        );

        PessoaJuridica pj = new PessoaJuridica(
                "Empresa XYZ",
                "Porto Alegre",
                "12.345.678/0001-99"
        );

        pf.efetuarCompra();
        pj.efetuarCompra();
    }
}