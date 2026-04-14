package pkg;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.print("Digite a marca: ");
        carro.setMarca(sc.nextLine());

        System.out.print("Digite o modelo: ");
        carro.setModelo(sc.nextLine());

        System.out.print("Digite o ano: ");
        carro.setAno(sc.nextInt());

        System.out.println("\nDetalhes do carro:");
        carro.exibeDetalhes();

        sc.close();
    }
}