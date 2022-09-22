package br.com.exercicio3;

import javax.swing.JOptionPane;

public final class Onibus extends Veiculo {
  private int assentos;

  public Onibus(String placa, int ano, int assentos) {
    super(placa, ano);
    this.assentos = assentos;
  }

  public int getAssentos() {
    return assentos;
  }

  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }

  @Override
  public void exibirDados() {
    JOptionPane.showMessageDialog(null, "Dados do ônibus: \n\nPlaca: " + getPlaca() + "\nAno: " + getAno() + "\nAssentos: " + this.assentos, "Detalhes do veículo", JOptionPane.INFORMATION_MESSAGE);
  }
}
