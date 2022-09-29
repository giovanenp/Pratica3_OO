package br.com.exercicio1;

public class Normal extends Ingresso {
  private static int count;

  public Normal(double valor) {
    super(valor);
    count++;
  }

  public String imprimeIngresso() {
    return "Ingresso Normal \nValor do ingresso: " + getValorIngresso();
  }

  @Override
  public int getQtd() {
    return count;
  }
}
