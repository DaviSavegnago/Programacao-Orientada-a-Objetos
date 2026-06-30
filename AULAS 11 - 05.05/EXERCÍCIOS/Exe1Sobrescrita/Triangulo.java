package wee;

public class Triangulo extends FormaGeometrica {

    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);
    }
}