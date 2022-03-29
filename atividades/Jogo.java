import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static void main(String [] args) {
        int numS, numJ;
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        numS = gerador.nextInt(99) + 1;

        System.out.println("Chute um número de 1 a 100!");

        for (int vidas = 10; vidas > 0; vidas--) {
            System.out.println("Você tem " + vidas + " vidas.");
            numJ = input.nextInt();

            while (numJ < 0 || numJ > 100) {
                System.out.println("Digite um número entre 0 e 100, poxa!");
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

        input.close();
    }
}
