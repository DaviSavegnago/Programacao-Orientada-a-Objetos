package pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

//2 – Faça o tratamento de exceções em uma calculadora.

public class Exercicio2Aula5 {

	public static void main(String[] args) {

	      Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Digite o primeiro número: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Digite o operador (+, -, *, /): ");
	            char op = scanner.next().charAt(0);

	            System.out.print("Digite o segundo número: ");
	            double num2 = scanner.nextDouble();

	            double resultado = 0;

	            switch (op) {
	                case '+': resultado = num1 + num2; break;
	                case '-': resultado = num1 - num2; break;
	                case '*': resultado = num1 * num2; break;
	                case '/':
	                    if (num2 == 0) {
	                        throw new ArithmeticException("Erro: Divisão por zero não permitida.");
	                    }
	                    resultado = num1 / num2;
	                    break;
	                default:
	                    System.out.println("Operador inválido.");
	                    return;
	            }

	            System.out.println("Resultado: " + resultado);

	        } catch (InputMismatchException e) {
	            System.out.println("Erro: Digite apenas números.");
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("ERRO: " + e.getMessage());
	        }
	    }
	}