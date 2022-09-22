package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de ingresso: \n\n(1) Ingresso Normal \n(2) VIP \n(3) Camarote \n\n"));    
    switch (opcao) {
      case 1:
        Normal ingressoNormal = new Normal(100);
        JOptionPane.showMessageDialog(null, ingressoNormal.printIngressoNormal(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
        break;
      case 2:
        Vip ingressoVip = new Vip(100, 25);
        JOptionPane.showMessageDialog(null, ingressoVip.printIngressoVip(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
        break;
      case 3:
        Camarote ingressoCamarote = new Camarote(100, 85, "Front Stage");
        JOptionPane.showMessageDialog(null, ingressoCamarote.printCamarote(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
        break;
      default:
      JOptionPane.showMessageDialog(null, "Opção inválida!", "Detalhes do ingresso", JOptionPane.ERROR_MESSAGE);
        break;
    }
  }
}
