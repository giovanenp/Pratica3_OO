package br.com.exercicio1;

public class Vip extends Ingresso {
  private double valorAdicional;

  public Vip(double valor, double valorAdicional) {
    super(valor);
    this.valorAdicional = valorAdicional;
  }

  public double getValorAdicional() {
    return valorAdicional;
  }

  public void setValorAdicional(double valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

  public String imprimeIngresso() {
    return "Ingresso Vip \nValor do ingresso: " + (getValorIngresso() + this.valorAdicional);
  }
}
