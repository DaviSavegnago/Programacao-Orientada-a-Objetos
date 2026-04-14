package pkg;

import java.util.Scanner;

//7 – Pesquise quais são as Exceções existentes que já possuem tratamento e explique brevemente como cada uma funciona. 
//Teste duas exceções.

public class Exercicio7Aula5 {
	
	//SÓ PESQUISEI!!!!!!!!!!!

	public static void main(String[] args) {

		        // 1. Testando StringIndexOutOfBoundsException
		        try {
		            String curso = "Java";
		            // Tentando pegar do índice 0 ao 10, mas a palavra só tem 4 letras
		            String parte = curso.substring(0, 10); 
		        } catch (StringIndexOutOfBoundsException e) {
		            System.err.println("Erro de String: Você tentou cortar um texto além do tamanho dele.");
		        }

		        // 2. Testando NullPointerException
		        try {
		            String nomeUsuario = null; // O objeto existe, mas está vazio (nulo)
		            
		            // Tentar medir o tamanho de algo que é 'null' gera erro
		            if (nomeUsuario.equals("Admin")) { 
		                System.out.println("Acesso liberado.");
		            }
		        } catch (NullPointerException e) {
		            System.err.println("Erro de Nulo: Você tentou usar um objeto que não foi inicializado.");
		        }

		        System.out.println("Programa finalizado com sucesso!");
		    }
		}