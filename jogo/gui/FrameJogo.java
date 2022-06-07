package gui;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Dimension;

import jogo.ActionBtnCard;
import jogo.JogoMemoria;

public class FrameJogo extends JFrame {
    private BtnCard[][] tabuleiroCards;
    public JogoMemoria jogo;

    public FrameJogo() {
        jogo = new JogoMemoria();
        tabuleiroCards = new BtnCard[4][4];
        setLayout(new GridLayout(4, 4, 10, 10));

        ActionBtnCard action = new ActionBtnCard(tabuleiroCards, jogo);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                BtnCard button = new BtnCard(jogo.getTabuleiro()[i][j]);
                add(button);
                tabuleiroCards[i][j] = button;
                button.addActionListener(action);
            }
        }

        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setTitle("Jogo da Memória");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiroCards[i][j].mostrarCard();
            }
        }
    }

    public void esconderTabuleiro() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiroCards[i][j].esconderCard();
            }
        }
    }
}
