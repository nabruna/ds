package guicalculadora;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import calculadora.Soma;
import calculadora.Subracao;
import calculadora.Multiplicacao;
import calculadora.Divisao;

public class ActionCalculadora extends AbstractAction {
    private JTextField valorX, valorY;
    private JComboBox<String> operacaoSelecionada;
    // Scanner input = new Scanner();

    public ActionCalcular() { }

    public ActionCalcular(JComboBox<String> cmbForma, JTextField valorX, JTextField valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public JComboBox getOperacao() {
        return operacaoSelecionada;
    }

    public void setOperacao(JComboBox operacaoSelecionada) {
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

    // public static validarNum() {
    //     try {
    //         double num = Integer.parseDouble(n);
    //         return num;
    //     } catch (Exception e) {
    //         System.out.println("Não é um número.");
    //     }
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (operacaoSelecionada.getSelectedItem().equals("Soma")) {
            double x = Double.parseDouble(valorX.getText());
            double y = Double.parseDouble(valorY.getText());

        }        
    }
}
