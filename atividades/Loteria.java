import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static int[] numSorteados, numEscolhidos;
    public static Random randomizador;
    public static Scanner input;
    public static int count;

    public static int[] sorteio(){
        randomizador = new Random();
        numSorteados = new int[6];

        for (int i = 0; i < numSorteados.length; i++) {
            numSorteados[i] = randomizador.nextInt(60) + 1;
        }

        return numSorteados;
    }

    public static void main (String [] args){
        count = 0;
        numEscolhidos = new int[6];
        input = new Scanner(System.in);
        String quit;

        System.out.printf("\n\nSCRIPT: Loteria! \n\n");
        
        do {
            sorteio();
            System.out.println("Insira os 6 numeros para jogar na loteria!");

            for (int i = 0; i < numEscolhidos.length; i++) {
                System.out.printf("Número %d: ", i+1);
                numEscolhidos[i] = input.nextInt();
                while (numEscolhidos[i] > 60 || numEscolhidos[i] < 1) {
                    System.out.printf("Favor inserir apenas numeros entre 1 e 60: ");
                    numEscolhidos[i] = input.nextInt();
                }
            }

            for (int i = 0; i < numSorteados.length; i++) {
                for (int j = 0; j < numEscolhidos.length; j++) {
                    if (numSorteados[i] == numEscolhidos[j]) {
                        count++;
                    }
                }
            }

            System.out.println("Você escolheu os números: " + Arrays.toString(numEscolhidos));
            System.out.println("Os números sorteados foram: " + Arrays.toString(numSorteados));

            switch (count) {
                case 1:
                case 2:
                case 3:
                System.out.printf("\nVocê acertou %d números. Seu prêmio será: nada.\n\n", count);
                    break;
                case 4:
                System.out.printf("\nVocê acertou 4 números. Seu prêmio será: R$ 50.000!\n\n");
                    break;
                case 5:
                System.out.printf("\nVocê acertou 5 números. Seu prêmio será: R$ 250.000!\n\n");
                    break;
                case 6:
                System.out.printf("\nVocê acertou todos os 6 números! Seu prêmio será: R$ 1.000.000!!!\n\n");
                    break;
                default: 
                System.out.printf("\nVocê não acertou nenhum número.\n\n");
                    break;
            }

            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();

        } while (!quit.contentEquals("N"));

        input.close();
    }
}
