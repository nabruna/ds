package jogo;

import gui.FrameJogo;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        FrameJogo frame = new FrameJogo();
        frame.setVisible(true);
        frame.mostrarTabuleiro();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        frame.esconderTabuleiro();
    }
}
