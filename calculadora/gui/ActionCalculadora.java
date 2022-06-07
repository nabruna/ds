package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import calculadora.Soma;
import calculadora.Subtracao;
import calculadora.Multiplicacao;
import calculadora.Divisao;

public class ActionCalculadora extends AbstractAction {
    private JTextField valorX, valorY;
    private JComboBox<String> operacaoSelecionada;

    public ActionCalculadora() {
    }

    public ActionCalculadora(JComboBox<String> operacaoSelecionada, JTextField valorX, JTextField valorY) {
        this.operacaoSelecionada = operacaoSelecionada;
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public JComboBox<String> getOperacao() {
        return operacaoSelecionada;
    }

    public void setOperacao(JComboBox<String> operacaoSelecionada) {
        this.operacaoSelecionada = operacaoSelecionada;
    }

    public JTextField getValorX() {
        return valorX;
    }

    public void setValorX(JTextField valorX) {
        this.valorX = valorX;
    }

    public JTextField getValorY() {
        return valorY;
    }

    public void setValorY(JTextField valorY) {
        this.valorY = valorY;
    }

    @Override
    public void actionPerformed(ActionEvent calc) {
        try {
            if (operacaoSelecionada.getSelectedItem().equals("Soma")) {
                double x = Double.parseDouble(valorX.getText());
                double y = Double.parseDouble(valorY.getText());
                Soma soma = new Soma(x, y);
                JOptionPane.showMessageDialog(null,
                        String.format("%.2f + %.2f = %.2f", x, y, soma.operacao()),
                        "Resultado da soma", JOptionPane.INFORMATION_MESSAGE);
            } else if (operacaoSelecionada.getSelectedItem().equals("Subtração")) {
                double x = Double.parseDouble(valorX.getText());
                double y = Double.parseDouble(valorY.getText());
                Subtracao subtracao = new Subtracao(x, y);
                JOptionPane.showMessageDialog(null,
                        String.format("%.2f - %.2f = %.2f", x, y, subtracao.operacao()),
                        "Resultado da subtração", JOptionPane.INFORMATION_MESSAGE);
            } else if (operacaoSelecionada.getSelectedItem().equals("Multiplicação")) {
                double x = Double.parseDouble(valorX.getText());
                double y = Double.parseDouble(valorY.getText());
                Multiplicacao multiplicacao = new Multiplicacao(x, y);
                JOptionPane.showMessageDialog(null,
                        String.format("%.2f x %.2f = %.2f", x, y, multiplicacao.operacao()),
                        "Resultado da multiplicação", JOptionPane.INFORMATION_MESSAGE);
            } else if (operacaoSelecionada.getSelectedItem().equals("Divisão")) {
                double x = Double.parseDouble(valorX.getText());
                double y = Double.parseDouble(valorY.getText());
                Divisao divisao = new Divisao(x, y);
                JOptionPane.showMessageDialog(null,
                        String.format("%.2f / %.2f = %.2f", x, y, divisao.operacao()),
                        "Resultado da divisão", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (NumberFormatException notNum) {
            JOptionPane.showMessageDialog(null,
                        String.format("Valor inserido é inválido."),
                        "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
