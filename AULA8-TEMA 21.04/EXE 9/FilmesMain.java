package pkg;

import java.util.Scanner;

public class FilmesMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o título:");
        String titulo = teclado.nextLine();

        System.out.println("Digite o diretor:");
        String diretor = teclado.nextLine();

        System.out.println("Digite a duração em minutos:");
        int duracao = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o gênero:");
        String genero = teclado.nextLine();

        Filmes f1 = new Filmes(titulo, diretor, duracao, genero);

        f1.exibirDetalhes();

        if (f1.ehLongo()) {
            System.out.println("O filme é considerado longo.");
        } else {
            System.out.println("O filme não é considerado longo.");
        }
    }
}