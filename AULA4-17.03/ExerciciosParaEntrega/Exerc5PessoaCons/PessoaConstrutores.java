package pkg;

import java.util.Scanner;

public class PessoaConstrutores {

    public String nome;
    public int idade;

    public PessoaConstrutores(String n, int i) {
        nome = n;
        idade = i;
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public PessoaConstrutores(int i) {
        nome = "Não informado";
        idade = i;
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o construtor: 1 para Nome e Idade, 2 para Idade apenas");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if (opcao == 1) {
            System.out.println("Digite o nome: ");
            String n = teclado.nextLine();
            System.out.println("Digite a idade: ");
            int i = teclado.nextInt();
            PessoaConstrutores p1 = new PessoaConstrutores(n, i);
        } else if (opcao == 2) {
            System.out.println("Digite a idade: ");
            int i = teclado.nextInt();
            PessoaConstrutores p2 = new PessoaConstrutores(i);
        } else {
            System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}