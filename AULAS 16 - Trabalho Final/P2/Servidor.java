package okg;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) {

        ArrayList<Veiculo> lista = Arquivo.carregar();

        try {

            // Servidor escutando na porta 12345
            ServerSocket servidor = new ServerSocket(12345);

            System.out.println("Servidor aguardando cliente...");

            while (true) {

                // Espera um cliente conectar
                Socket socket = servidor.accept();

                // Recebe o objeto enviado
                ObjectInputStream entrada =
                        new ObjectInputStream(socket.getInputStream());

                Veiculo veiculo = (Veiculo) entrada.readObject();

                lista.add(veiculo);

                Arquivo.salvar(lista);

                // Envia resposta
                ObjectOutputStream saida =
                        new ObjectOutputStream(socket.getOutputStream());

                saida.writeObject("Cadastro realizado com sucesso!");

                entrada.close();
                saida.close();
                socket.close();

                System.out.println("Veículo cadastrado.");
            }

        } catch (Exception e) {

            System.out.println("Erro no servidor.");

        }

    }

}