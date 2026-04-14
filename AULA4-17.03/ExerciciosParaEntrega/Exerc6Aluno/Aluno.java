package pkg;

public class Aluno {

    public String nome;
    public String matricula;
    public String dataNascimento;
    public int anoIngresso;

    public Aluno(String n, String m) {
        nome = n;
        matricula = m;
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }

    public Aluno(String dataNasc) {
        dataNascimento = dataNasc;
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public Aluno(String n, String dataNasc, int ano) {
        nome = n;
        dataNascimento = dataNasc;
        anoIngresso = ano;
        System.out.println("Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Ano de Ingresso: " + anoIngresso);
    }
}