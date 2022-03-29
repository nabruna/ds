import java.util.Scanner;
import java.lang.Math;

public class Polinomial {
    public static long potencia(int v, int p) {
        int i = 1;
        while (i <= p) {
            v = v * v;
            i++;
        }

        return v;
    }

    public static void main(String[] args) {
        int n, a, x, y = 0, yD = 0;
        double pot, pot2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o grau da função:");
        
        n = input.nextInt();
        int[] coeficiente = new int[n];

        System.out.println("Digite os " + n + " coeficiente(s) da função:");
        
        for (int i = 0; i < coeficiente.length; i++) {
            a = input.nextInt();
            coeficiente[i] = a;

        }

        System.out.println("Digite o valor de X:");
        x = input.nextInt();

        for (int i = 0; i < coeficiente.length; i++) {
            pot = Math.pow(x, n);
            pot2 = Math.pow(x, (n-1));
            y += coeficiente[i] * pot;
            yD += n * coeficiente[i] * pot2;
            n--;
        }
        
        System.out.println("O valor f(x) da sua função é: " + y);
        System.out.println("O valor f'(x) da sua função é: " + yD);

    }
}
