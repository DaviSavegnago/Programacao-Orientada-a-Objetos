package okg;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    private static final String ARQUIVO = "veiculos.dat";

    // salva a lista inteira no arquivo
    public static void salvar(ArrayList<Veiculo> lista) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO));

            out.writeObject(lista);

            out.close();

        } catch (Exception e) {

            System.out.println("Erro ao salvar.");
        }

    }

    // le lista do arquivo
    public static ArrayList<Veiculo> carregar() {

        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO));

            ArrayList<Veiculo> lista = (ArrayList<Veiculo>) in.readObject();

            in.close();

            return lista;

        } catch (Exception e) {

            // Se não existir arquivo, cria lista vazia
            return new ArrayList<>();
        }

    }

}