package pkg;

import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circulo c = new Circulo();

        System.out.print("Digite o raio do círculo: ");
        c.setRaio(sc.nextDouble());

        double area = c.calculaArea();

        System.out.println("Área do círculo: " + area);

        sc.close();
    }
}