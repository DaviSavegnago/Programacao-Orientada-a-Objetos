package pkg;

public class Livro {
	
	public String titulo;
	public String autor;
	public int anoPublicacao;
	public String genero;
	public boolean emprestado;
	
	public Livro() {
        System.out.println("Livro criado!");
    }

    public void atribuirValores(String t, String a, int ano, String g) {
        titulo = t;
        autor = a;
        anoPublicacao = ano;
        genero = g;
        emprestado = false;
    }

    public String retornaInformacoes() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicacao + "\nGênero: " + genero + "\nStatus: " + status;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não estava emprestado.");
        }
    }
}