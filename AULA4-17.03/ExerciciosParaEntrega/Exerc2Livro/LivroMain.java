package pkg;

import java.util.Scanner;

public class LivroMain {

    public static void main(String[] args) {
        
        Livro l = new Livro();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\tConteúdo Original:");
        System.out.println(l.retornaInformacoes());
        
        System.out.println("\n\tInsira os valores:");
        
        System.out.println("Título: ");
        String titulo = teclado.nextLine();
        
        System.out.println("Autor: ");
        String autor = teclado.nextLine();
        
        System.out.println("Ano de publicação: ");
        int ano = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Gênero: ");
        String genero = teclado.nextLine();
        
        l.atribuirValores(titulo, autor, ano, genero);
        
        System.out.println("\n\tNovo Conteúdo:");
        System.out.println(l.retornaInformacoes());
        
        System.out.println("\nTestando empréstimo e devolução:");
        l.emprestar();
        l.emprestar(); 
        l.devolver();    
        l.devolver();   
        
        teclado.close();
    }
}