package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    double valorPadrao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor padrão para o ingresso"));
    int opcao = Integer.parseInt(JOptionPane
        .showInputDialog("Informe o tipo de ingresso: \n\n(1) Ingresso Normal \n(2) VIP \n(3) Camarote \n\n"));
    switch (opcao) {
      case 1:
        Normal ingressoNormal = new Normal(valorPadrao);
        JOptionPane.showMessageDialog(null, ingressoNormal.printIngressoNormal(), "Detalhes do ingresso",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      case 2:
        Vip ingressoVip = new Vip(valorPadrao, 25);
        JOptionPane.showMessageDialog(null, ingressoVip.printIngressoVip(), "Detalhes do ingresso",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      case 3:
        Camarote ingressoCamarote = new Camarote(valorPadrao, 85, "Front Stage");
        JOptionPane.showMessageDialog(null, ingressoCamarote.printCamarote(), "Detalhes do ingresso",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida!", "Detalhes do ingresso", JOptionPane.ERROR_MESSAGE);
        break;
    }
  }
}
