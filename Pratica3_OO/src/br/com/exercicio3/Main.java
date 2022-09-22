package br.com.exercicio3;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    String placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
    int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo"));

    Onibus onibus = new Onibus(placa, ano, 44);
    onibus.exibirDados();

    Caminhao caminhao = new Caminhao(placa, ano, 2);
    caminhao.exibirDados();
  }
}
