package br.com.exercicio1;

public class Camarote extends Ingresso {
  private double valorAdicional;
  private String localizacao;

  public Camarote(double valor, double valorAdicional, String localizacao) {
    super(valor);
    this.valorAdicional = valorAdicional;
    this.localizacao = localizacao;
  }

  public double getValorAdicional() {
    return valorAdicional;
  }

  public void setValorAdicional(double valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public String imprimeIngresso() {
    return "Valor do ingresso: " + (getValorIngresso() + this.valorAdicional) + ".\nLocalização: " + this.localizacao
        + ".\nIngresso Camarote!";
  }
}
