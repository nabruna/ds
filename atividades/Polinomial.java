import java.util.Scanner;
import java.lang.Math;

public class Polinomial {
    public static Scanner input;

    public static long potencia(int v, int p) {
        int i = 1;
        while (i <= p) {
            v = v * v;
            i++;
        }

        return v;
    }

    public static void main(String[] args) {
        // Faça um programa que leia os coeficientes de uma função polinomial, armazene em um vetor e calcule o valor de y e y' dado x.

        int n, a, x, y = 0, yD = 0;
        double pot, pot2;
        input = new Scanner(System.in);
        String quit;

        System.out.printf("\n\nSCRIPT: Cálculo de função polinomial \n");
        
        do {
            // O programa pergunta o grau da função (n).
            System.out.println("Digite o grau da função:");
            
            n = input.nextInt();
            int[] coeficiente = new int[n];

            // Pede para o usuário digitar os coeficientes.
            System.out.println("Digite os " + n + " coeficiente(s) da função:");
            
            // Armazena os coeficientes em um vetor.
            for (int i = 0; i < coeficiente.length; i++) {
                a = input.nextInt();
                coeficiente[i] = a;

            }

            // Pede para o usuário digitar um valor de x.
            System.out.println("Digite o valor de X:");
            x = input.nextInt();

            // Calcula o valor de y e y' na abscissa x.
            for (int i = 0; i < coeficiente.length; i++) {
                pot = Math.pow(x, n);
                pot2 = Math.pow(x, (n-1));
                y += coeficiente[i] * pot;
                yD += n * coeficiente[i] * pot2;
                n--;
            }
            
            System.out.println("O valor f(x) da função é: " + y);
            System.out.println("O valor f'(x) da função é: " + yD);

            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();
        } while (!quit.contentEquals("N"));

        input.close();

    }
}

// 🐷