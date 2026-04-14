package pkg;

import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Digite o nome: ");
        p.setNome(sc.nextLine());

        System.out.print("Digite a idade: ");
        p.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite o CPF: ");
        p.setCpf(sc.nextLine());

        if (p.verificaMaiorDeIdade()) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}