import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o tipo: ");
        String tipo = sc.nextLine();

        Pessoa p = new Pessoa(tipo, nome, idade);

        System.out.println("\n--- Dados ---");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Tipo: " + p.getTipo());

        System.out.println("\n--- Métodos ---");
        System.out.println(p.falar());
        p.andar();

        sc.close();
    }
}