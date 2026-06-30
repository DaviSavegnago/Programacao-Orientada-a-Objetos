package okg;

import java.io.Serializable;

//Serializable para salvar objetos em arquivo
public class Veiculo implements Serializable {

 private String placa;
 private String modelo;
 private String marca;
 private int anoFabricacao;
 private double quilometragem;

 // Construtor para criar o veículo
 public Veiculo(String placa, String modelo, String marca, int anoFabricacao, double quilometragem) {
     this.placa = placa;
     this.modelo = modelo;
     this.marca = marca;
     this.anoFabricacao = anoFabricacao;
     this.quilometragem = quilometragem;
 }

 // Apenas métodos get para leitura
 public String getPlaca() {
     return placa;
 }

 public String getModelo() {
     return modelo;
 }

 public String getMarca() {
     return marca;
 }

 public int getAnoFabricacao() {
     return anoFabricacao;
 }

 public double getQuilometragem() {
     return quilometragem;
 }

 // Apenas quilometragem pode ser alterada
 public void setQuilometragem(double quilometragem) {
     this.quilometragem = quilometragem;
 }

 // Exibe os dados do veículo
 @Override
 public String toString() {
     return "Placa: " + placa +
             " | Modelo: " + modelo +
             " | Marca: " + marca +
             " | Ano: " + anoFabricacao +
             " | KM: " + quilometragem;
 }
}