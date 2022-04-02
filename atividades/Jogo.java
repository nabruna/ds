import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static Scanner input;
    public static void main(String [] args) {
        int numS, numJ;
        Random gerador = new Random();
        input = new Scanner(System.in);
        String quit;

        System.out.printf("\n\nSCRIPT: Jogo de adivinhação \n\n");
        
        do {
            numS = gerador.nextInt(99) + 1;

            System.out.println("Chute um número de 1 a 100!");

            for (int vidas = 10; vidas > 0; vidas--) {
                System.out.printf("\n---\nVocê tem %d vidas.\n---\n", vidas);
                numJ = input.nextInt();

                while (numJ < 0 || numJ > 100) {
                    System.out.println("Número inválido. Digite um número entre 0 e 100.");
                    numJ = input.nextInt();
                }

                if (numJ == numS) {
                    vidas = 0;
                    System.out.println("Você acertou! O número sorteado foi " + numS + ".");
                } else if (numJ < numS) {
                    System.out.println("O número que você chutou é menor que o sorteado. Tente novamente.");
                } else if (numJ > numS) {
                    System.out.println("O número que você chutou é maior que o sorteado. Tente novamente.");
                }
            }
            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();

        } while (!quit.contentEquals("N"));

        input.close();
    }
}

// 🐷