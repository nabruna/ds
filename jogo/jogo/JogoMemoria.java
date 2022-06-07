package jogo;

import java.util.Random;

public class JogoMemoria {
    private int[][] tabuleiro;
    private boolean aguardandoCard;
    private int contadorPontos;

    public JogoMemoria() {
        tabuleiro = new int[4][4];
        sortearNums();
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setAguardandoCard(boolean aguardandoCard) {
        this.aguardandoCard = aguardandoCard;
    }
    
    public boolean isAguardandoCard() {
        return aguardandoCard;
    }

    public void aumentarPontos() {
        contadorPontos += 5;
    }

    public void diminuirPontos() {
        contadorPontos -= 3;
    }

    public int getContadorPontos() {
        return contadorPontos;
    }

    private void sortearNums() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                while (true) {
                    int n = random.nextInt(8) + 1;
                    if (seValido(n)) {
                        tabuleiro[i][j] = n;
                        break;
                    }
                }
            }
        }
    }

    private boolean seValido(int n) {
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (n == tabuleiro[i][j]){
                    contador++;
                }
            }
        }
        return contador < 2;
    }
}