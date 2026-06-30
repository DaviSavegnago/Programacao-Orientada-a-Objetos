package okg;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {

            try {

                // Conecta ao servidor
                Socket socket = new Socket("localhost", 12345);

                System.out.print("Placa: ");
                String placa = teclado.nextLine();

                System.out.print("Modelo: ");
                String modelo = teclado.nextLine();

                System.out.print("Marca: ");
                String marca = teclado.nextLine();

                System.out.print("Ano: ");
                int ano = teclado.nextInt();

                System.out.print("Quilometragem: ");
                double km = teclado.nextDouble();
                teclado.nextLine(); // Limpa o Enter

                Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);

                // Envia o objeto ao servidor
                ObjectOutputStream saida =
                        new ObjectOutputStream(socket.getOutputStream());

                saida.writeObject(veiculo);

                // Recebe a resposta do servidor
                ObjectInputStream entrada =
                        new ObjectInputStream(socket.getInputStream());

                String resposta = (String) entrada.readObject();

                System.out.println(resposta);

                entrada.close();
                saida.close();
                socket.close();

            } catch (Exception e) {

                System.out.println("Erro ao conectar ao servidor.");

            }

            System.out.println("\n1 - Cadastrar outro veículo");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

        } while (opcao == 1);

        teclado.close();

        System.out.println("Cliente encerrado.");

    }

}