package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    double valorPadrao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor padrão para o ingresso"));
    double valorAdicional = 0;
    int opcao = 0;

    do {
      opcao = Integer.parseInt(JOptionPane.showInputDialog(
          "Informe o tipo de ingresso: \n\n(1) Ingresso Normal \n(2) VIP \n(3) Camarote \n(4) Sair \n "));

      switch (opcao) {
        case 1:
          Normal ingressoNormal = new Normal(valorPadrao);
          JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Detalhes do ingresso",
              JOptionPane.INFORMATION_MESSAGE);
          break;
        
        case 2:
          valorAdicional = Double
              .parseDouble(JOptionPane.showInputDialog("Informe o valor adicional para a area VIP"));
          Vip ingressoVip = new Vip(valorPadrao, valorAdicional);
          JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Detalhes do ingresso",
              JOptionPane.INFORMATION_MESSAGE);
          break;
        
        case 3:
          valorAdicional = Double
              .parseDouble(JOptionPane.showInputDialog("Informe o valor adicional para o Camarote"));
          String localizacao = JOptionPane.showInputDialog("Informe a localização do Camarote");
          Camarote ingressoCamarote = new Camarote(valorPadrao, valorAdicional, localizacao);
          JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(), "Detalhes do ingresso",
              JOptionPane.INFORMATION_MESSAGE);
          break;
        
        case 4:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida!", "Detalhes do ingresso", JOptionPane.ERROR_MESSAGE);
          break;
      }
    } while (opcao != 4);
  }
}
