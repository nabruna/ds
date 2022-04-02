import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Atividade3 {
    public static Scanner input;
    public static int[] numSorteados = new int[20];
    public static int contador, pos;

    public static void jogoSorteio() {
        Random sorteio = new Random();
        
        for (int i = 0; i < 20; i++) {
            numSorteados[i] = sorteio.nextInt(100) + 1;
        }
    }

    public static int lerNumero(int num) {
        for (int i = 0; i < 20; i++) {
            if (num == numSorteados[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int num;
        input = new Scanner(System.in);
        jogoSorteio();

        do {
            System.out.println("Insira um número:");
            num = input.nextInt();
            pos = lerNumero(num);

            if (pos > 0) {
                System.out.println("Número encontrado na posição " + pos + "! ✨");
            } else {
                System.out.println("Número não encontrado. 😭");
            }

            System.out.println(Arrays.toString(numSorteados));

        } while (pos <= 0);

        input.close();
    }
}