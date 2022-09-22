package br.com.exercicio3;

import javax.swing.JOptionPane;

public final class Caminhao extends Veiculo{
  private int eixos;

  public Caminhao(String placa, int ano, int eixos) {
    super(placa, ano);
    this.eixos = eixos;
  }

  public int getEixos() {
    return eixos;
  }

  public void setEixos(int eixos) {
    this.eixos = eixos;
  }

  @Override
  public void exibirDados(){
    JOptionPane.showMessageDialog(null, "Dados do caminhão: \n\nPlaca: " + getPlaca() + "\nAno: " + getAno(), "Detalhes do veículo", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Número de eixos: " + this.eixos, "Detalhes do veículo", JOptionPane.INFORMATION_MESSAGE);
  }
}
