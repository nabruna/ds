package jogo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import gui.BtnCard;

public class ActionBtnCard extends AbstractAction {
    private BtnCard[][] tabuleiroCard;
    private JogoMemoria jogo;
    private BtnCard cardAnterior;

    public ActionBtnCard(BtnCard[][] tabuleiroCard, JogoMemoria jogo) {
        this.tabuleiroCard = tabuleiroCard;
        this.jogo = jogo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BtnCard cardSelecionado = (BtnCard) e.getSource();
        if (jogo.isAguardandoCard()) {
            cardSelecionado.mostrarCard();
            if (cardSelecionado.getNum() == cardAnterior.getNum()) {
                jogo.aumentarPontos();
                int contador = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (tabuleiroCard[i][j].isSelected()) {
                            contador++;
                        }
                    }
                }

                cardSelecionado.setEnabled(false);
                cardAnterior.setEnabled(false);

                if (contador == 16) {
                    JOptionPane.showMessageDialog(null, String.format("Pontuação: %d", jogo.getContadorPontos()), "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                jogo.diminuirPontos();
                cardSelecionado.esconderCard();
                cardAnterior.esconderCard();
            }
            jogo.setAguardandoCard(false);
        } else {
            cardSelecionado.mostrarCard();
            cardAnterior = cardSelecionado;
            jogo.setAguardandoCard(true);
        }
    }
}
