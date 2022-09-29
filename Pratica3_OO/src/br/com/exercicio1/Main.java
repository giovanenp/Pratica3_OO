package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    double valorPadrao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor padrão para o ingresso"));
    double valorAdicional = 0;
    int opcao;

    Normal ingressoNormal = null;
    Vip ingressoVip = null;
    Camarote ingressoCamarote = null;

    do {
      opcao = Integer.parseInt(JOptionPane.showInputDialog(
          "Informe o tipo de ingresso: \n\n(1) Ingresso Normal \n(2) VIP \n(3) Camarote \n(4) Sair \n "));

      switch (opcao) {
        case 1:
          ingressoNormal = new Normal(valorPadrao);
          JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
          break;

        case 2:
          valorAdicional = Double
              .parseDouble(JOptionPane.showInputDialog("Informe o valor adicional para a area VIP"));
          ingressoVip = new Vip(valorPadrao, valorAdicional);
          JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
          break;

        case 3:
          valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor adicional para o Camarote"));
          String localizacao = JOptionPane.showInputDialog("Informe a localização do Camarote");
          ingressoCamarote = new Camarote(valorPadrao, valorAdicional, localizacao);
          JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
          break;

        case 4:
          JOptionPane.showMessageDialog(null, "Quantidade de ingressos Normal vendidos: " + ingressoNormal.getQtd(), "Quantidade VIP", JOptionPane.INFORMATION_MESSAGE);
          JOptionPane.showMessageDialog(null, "Quantidade de ingressos VIP vendidos: " + ingressoVip.getQtd(), "Quantidade VIP", JOptionPane.INFORMATION_MESSAGE);
          JOptionPane.showMessageDialog(null, "Quantidade de ingressos Camarote vendidos: " + ingressoCamarote.getQtd(), "Quantidade VIP", JOptionPane.INFORMATION_MESSAGE);
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida!", "Detalhes do ingresso", JOptionPane.ERROR_MESSAGE);
          break;
      }
    } while (opcao != 4);
  }
}
