package pkg;

public class Filmes {

    private String titulo;
    private String diretor;
    private int duracaoEmMinutos;
    private String genero;

    public Filmes(String titulo, String diretor, int duracaoEmMinutos, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }

    public boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }
}