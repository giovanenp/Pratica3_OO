package br.com.exercicio1;

public class Normal extends Ingresso {

  public Normal(double valor) {
    super(valor);
  }

  public String printIngressoNormal() {
    return "Valor do ingresso: " + getValor() + ".\nIngresso Normal!";
  }
}
