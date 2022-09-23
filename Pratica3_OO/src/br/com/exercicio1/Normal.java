package br.com.exercicio1;

public class Normal extends Ingresso {

  public Normal(double valor) {
    super(valor);
  }

  public String imprimeIngresso() {
    return "Ingresso Normal \nValor do ingresso: " + getValorIngresso();
  }
}
