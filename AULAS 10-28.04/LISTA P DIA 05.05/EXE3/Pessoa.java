public class Pessoa extends SerHumano {
    private String nome;
    private int idade;

    public Pessoa(String tipo, String nome, int idade) {
        super(tipo);
        this.nome = nome;
        this.idade = idade;
    }

    public String falar() {
        return "Nem todos falam";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}