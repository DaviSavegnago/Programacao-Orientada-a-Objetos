package ppkg;

import java.util.ArrayList;

public class AlunoMain {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Carlos", 7, 8));
        alunos.add(new Aluno("Marina", 5, 4));
        alunos.add(new Aluno("Lucas", 10, 9));
        alunos.add(new Aluno("Ana", 6, 6));

        for (Aluno a : alunos) {

            System.out.println(a);

        }
    }
}