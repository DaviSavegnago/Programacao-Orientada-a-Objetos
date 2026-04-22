package pkg;

import java.util.Scanner;

public class TarefaMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarefa[] tarefas = new Tarefa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a descrição da tarefa " + (i + 1) + ":");
            String desc = teclado.nextLine();
            tarefas[i] = new Tarefa(desc);
        }

        tarefas[0].concluirTarefa();

        System.out.println("\nLista de Tarefas:");

        for (int i = 0; i < 3; i++) {
            tarefas[i].exibirTarefa();
            System.out.println();
        }
    }
}