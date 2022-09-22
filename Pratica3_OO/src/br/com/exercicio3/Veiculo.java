package br.com.exercicio3;

import javax.swing.JOptionPane;

public abstract class Veiculo {
  private String placa;
  private int ano;

  public Veiculo() {
  }
  
  public Veiculo(String placa, int ano) {
    this.placa = placa;
    this.ano = ano;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
  
  public void exibirDados(){
    JOptionPane.showMessageDialog(null, "Dados do veículo: \n\nPlaca: " + this.placa + "\nAno: " + this.ano, "Detalhes do veículo", JOptionPane.INFORMATION_MESSAGE);
  }
  
}
