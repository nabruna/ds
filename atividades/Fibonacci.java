import java.util.Scanner;
import java.util.Arrays;
// Nesse exercício, você deve fazer um programa que calcula o n-ésimo termo da sequência de Fibonacci

public class Fibonacci {
    public static Scanner input;
    public static int[] sequenciaFibo;

    // O programa lê o valor de n e calcula o valor de f(n).
    public static int fibonacci(int n) {
        sequenciaFibo = new int[n];
        sequenciaFibo[0] = 0;
        sequenciaFibo[1] = 1;
        sequenciaFibo[2] = 1;

        for (n = 3; n < sequenciaFibo.length; n++) {
            sequenciaFibo[n] = sequenciaFibo[n--] + sequenciaFibo[n-2];
        }

        return sequenciaFibo[n];
    }

    public static void main (String [] args){
        int n;
        input = new Scanner(System.in);

        String quit;

        System.out.printf("\n\nSCRIPT: Posição em Fibonacci \n");
        
        do {
            System.out.printf("\nDigite a posição de Fibonacci que você busca: ");
            n = input.nextInt();

            // O valor de n deve ser inteiro positivo e o programa deve validar a entrada. 
            // Casos em que n = 0 ou n = 1 devem ser tratados.
            while (n <= 0) {
                System.out.println("O valor que você digitou é inválido. Digite um número inteiro positivo que representa a posição de um número dentro da sequência Fibonacci.");
                n = input.nextInt();
            }

            System.out.printf("A posição %d na sequência Fibonacci representa o número %d.\n\n", n, fibonacci(n));
            System.out.println(Arrays.toString(sequenciaFibo));
            
            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();
        } while (!quit.contentEquals("N"));

        input.close();
    }
}

// 🐷