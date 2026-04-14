package pkg;

import java.util.Scanner;

public class MainDisciplina {

    public static void main(String[] args) {
        
        Disciplina d = new Disciplina();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\tConteúdo Original:");
        System.out.println("Nome da Disciplina: " + d.retornaNome());
        System.out.println("Carga Horária: " + d.retornaCargaHoraria());
        System.out.println("Nome do Professor: " + d.retornaNomeProfessor());
        
        System.out.println("\tAgora insira os valores:");
        
        System.out.println("Nome da Disciplina: ");
        String nome = teclado.nextLine();
        
        System.out.println("Carga horária, em horas: ");
        int cargaHoraria = teclado.nextInt();
        teclado.nextLine(); // limpar buffer
        
        System.out.println("Nome do Professor: ");
        String nomeProfessor = teclado.nextLine();
        
        d.setNome(nome);
        d.setCargaHoraria(cargaHoraria);
        d.setNomeProfessor(nomeProfessor);
        
        System.out.println("\n\tNovo Conteúdo:");
        System.out.println("Nome da Disciplina: " + d.retornaNome());
        System.out.println("Carga Horária: " + d.retornaCargaHoraria());
        System.out.println("Nome do Professor: " + d.retornaNomeProfessor());
        
        teclado.close();
    }
}