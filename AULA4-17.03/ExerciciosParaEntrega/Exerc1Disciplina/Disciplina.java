package pkg;

public class Disciplina {

    public String nome;
    public int cargaHoraria;
    public String nomeProfessor;

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setCargaHoraria(int novaCargaHoraria) {
        cargaHoraria = novaCargaHoraria;
    }

    public void setNomeProfessor(String novoNomeProfessor) {
        nomeProfessor = novoNomeProfessor;
    }

    public String retornaNome() {
        return nome;
    }

    public int retornaCargaHoraria() {
        return cargaHoraria;
    }

    public String retornaNomeProfessor() {
        return nomeProfessor;
    }
} 