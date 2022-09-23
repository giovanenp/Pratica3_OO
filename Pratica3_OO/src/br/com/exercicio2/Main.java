package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do funcionário"));
    String nome = JOptionPane.showInputDialog("Informe o nome do Funcionário");
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionário " + nome + ""));
    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de provento \n\n(1) Salário Fixo \n(2) Comissão \n(3) Produtividade \n\n"));    

    switch (opcao) {
      case 1:
        FPadrao fPadrao = new FPadrao(matricula, nome, salario);
        JOptionPane.showMessageDialog(null, fPadrao.calcularProventos(), "Detalhes do funcionário", JOptionPane.INFORMATION_MESSAGE);
        break;
      case 2:
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a % base para cálculo"));
        double vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de vendas"));
        FComissionado fComissionado = new FComissionado(matricula, nome, salario, porcentagem, vendas);
        JOptionPane.showMessageDialog(null, fComissionado.calcularProventos(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
        break;
      case 3:
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago por produção"));
        int producao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade total produzida pelo funcionário"));
        FProdutividade fProdutividade = new FProdutividade(matricula, nome, salario, valor, producao);
        JOptionPane.showMessageDialog(null, fProdutividade.calcularProventos(), "Detalhes do ingresso", JOptionPane.INFORMATION_MESSAGE);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida!", "Detalhes do ingresso", JOptionPane.ERROR_MESSAGE);
        break;
    }
  }
}
