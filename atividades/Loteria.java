import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Faça um jogo de loteria!

public class Loteria {
    public static void main (String[] args) {
        int acerto = 0, i = 0, contador = 1, valor;
        String resultado = "";
        int[] loteria = new int[6], valores = new int[6];
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Iniciar loteria! Digite 6 números de 1 a 60.");
        //  O programa sorteia 6 números (chamadas dezenas) de 1 a 60 e pede para o jogador escolher 6 números de 1 a 60.
        
        for (i = 0; i < 6; i++) {
            System.out.println("Digite o " + contador + " número: ");

            valor = input.nextInt();

            if (valor > 60) {
                System.out.println("ATENÇÃO: insira um valor entre 1 e 60!");
                valor = input.nextInt();
                System.out.println("Digite o " + contador + " número: ");
            } else {
                valores[i] = valor;
                contador++;
            }

        }

        for (int j = 0; j < 6; j++) {
            loteria[j] = gerador.nextInt(59) + 1;
        }

        System.out.println("Os valores sorteados foram: " + Arrays.toString(loteria));
        System.out.println("Os valores que você digitou foram: " + Arrays.toString(valores));

        switch (acerto) {
            case 4:
                resultado = "Prêmio: R$ 50.000,00!";
                break;
            case 5:
                resultado = "Prêmio: R$ 250.000,00!";
                break;
            case 6:
                resultado = "Prêmio: R$ 1.000.000,00!";
                break;
            default:
                resultado = "Prêmio: nada... Boa sorte da próxima vez!";
                break;       
        }

        System.out.println(resultado);
        
        input.close();
    }

}