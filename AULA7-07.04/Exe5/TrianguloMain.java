package pkg;

import java.util.Scanner;

public class TrianguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo t = new Triangulo();

        System.out.print("Digite o lado A: ");
        t.setLadoA(sc.nextDouble());

        System.out.print("Digite o lado B: ");
        t.setLadoB(sc.nextDouble());

        System.out.print("Digite o lado C: ");
        t.setLadoC(sc.nextDouble());

        if (t.verificaEquilatero()) {
            System.out.println("Triângulo equilátero");
        } else {
            System.out.println("Não é equilátero");
        }

        sc.close();
    }
}