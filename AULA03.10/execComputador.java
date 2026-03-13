package pkg;

import java.util.Scanner;

public class execComputador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Computador c1 = new Computador();

        System.out.print("Marca: ");
        c1.marca = sc.nextLine();

        System.out.print("Modelo: ");
        c1.modelo = sc.nextLine();

        System.out.print("Tipo: ");
        c1.tipo = sc.nextLine();

        System.out.print("Preço: ");
        c1.preco = sc.nextDouble();

        Computador c2 = new Computador();
        c2.marca = "Dell";
        c2.modelo = "Inspiron";
        c2.tipo = "Notebook";
        c2.preco = 3500;

        System.out.println("\nComputador 1:");
        c1.mostrarDados();

        System.out.println("Computador 2:");
        c2.mostrarDados();

        sc.close();
    }
}