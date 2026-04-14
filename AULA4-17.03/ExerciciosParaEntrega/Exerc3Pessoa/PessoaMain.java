package pkg;

import java.util.Scanner;

public class PessoaMain {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        System.out.println("\tInsira os dados da primeira pessoa:");
        System.out.println("Nome: ");
        String nome1 = teclado.nextLine();
        System.out.println("Email: ");
        String email1 = teclado.nextLine();
        System.out.println("Data de nascimento: ");
        String data1 = teclado.nextLine();
        System.out.println("Endereço: ");
        String endereco1 = teclado.nextLine();
        boolean admin1 = true;
        
        p1.atribuirValores(nome1, email1, data1, endereco1, admin1);
        
        System.out.println("\tInsira os dados da segunda pessoa:");
        System.out.println("Nome: ");
        String nome2 = teclado.nextLine();
        System.out.println("Email: ");
        String email2 = teclado.nextLine();
        System.out.println("Data de nascimento: ");
        String data2 = teclado.nextLine();
        System.out.println("Endereço: ");
        String endereco2 = teclado.nextLine();
        boolean admin2 = false;
        
        p2.atribuirValores(nome2, email2, data2, endereco2, admin2);
    
        System.out.println("\n\tInformações da primeira pessoa:");
        System.out.println(p1.retornaInformacoes());
        
        System.out.println("\n\tInformações da segunda pessoa:");
        System.out.println(p2.retornaInformacoes());
        
        System.out.println("\nPromovendo a segunda pessoa a administrador...");
        p2.promoverAdmin();
        
        System.out.println("\n\tInformações atualizadas da segunda pessoa:");
        System.out.println(p2.retornaInformacoes());
        
        teclado.close();
    }
}