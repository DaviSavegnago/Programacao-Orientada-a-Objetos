package okg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Carrega os veículos já salvos no arquivo
        ArrayList<Veiculo> lista = Arquivo.carregar();

        int opcao;

        do {

            System.out.println("\n\t MENU ");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

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
                    teclado.nextLine();

                    Veiculo v = new Veiculo(placa, modelo, marca, ano, km);

                    lista.add(v);

                    Arquivo.salvar(lista);

                    System.out.println("Veículo cadastrado.");

                    break;

                case 2:

                    System.out.print("Informe a placa: ");
                    String placaAlterar = teclado.nextLine();

                    boolean encontrou = false;

                    // procura o veículo pela placa
                    for (Veiculo veiculo : lista) {

                        if (veiculo.getPlaca().equalsIgnoreCase(placaAlterar)) {

                            System.out.print("Nova quilometragem: ");
                            double novaKm = teclado.nextDouble();
                            teclado.nextLine();

                            veiculo.setQuilometragem(novaKm);

                            Arquivo.salvar(lista);

                            System.out.println("Quilometragem alterada.");

                            encontrou = true;

                            break;
                        }

                    }

                    // caso a placa não exista
                    if (!encontrou) {

                        System.out.println("Veículo não encontrado.");

                    }

                    break;

                case 3:

                    System.out.print("Informe a placa: ");
                    String placaExcluir = teclado.nextLine();

                    boolean removido = false;

                    // Percorre a lista procurando a placa
                    for (int i = 0; i < lista.size(); i++) {

                        if (lista.get(i).getPlaca().equalsIgnoreCase(placaExcluir)) {

                            lista.remove(i);

                            Arquivo.salvar(lista);

                            removido = true;

                            System.out.println("Veículo removido.");

                            break;
                        }

                    }

                    // caso não encontre a placa
                    if (!removido) {

                        System.out.println("Veículo não encontrado.");

                    }

                    break;

                case 4:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                	System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

        teclado.close();

    }

}