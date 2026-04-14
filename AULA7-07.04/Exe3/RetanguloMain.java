package pkg;

import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.print("Digite a base: ");
        r.setBase(sc.nextDouble());

        System.out.print("Digite a altura: ");
        r.setAltura(sc.nextDouble());

        double area = r.calculaArea();

        System.out.println("Área do retângulo: " + area);

        sc.close();
    }
}