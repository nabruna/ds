import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n) {
        int f0 = 0, f1 = 1, valorFibo = 1;

        if (n == 1) {
            valorFibo = 0;
        } else if (n == 2) {
            valorFibo = 1;
        } else {
            int i = 3;
            while (n >= i) {
                valorFibo = f1 + f0;
                f0 = f1;
                f1 = valorFibo;
                i++;
            }
        }

        return valorFibo;
    }

    public static void main (String [] args){
        int n, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("## NÚMEROS FIBONACCI ##");

        System.out.println("Digite a posição de Fibonacci que você busca:");
        n = input.nextInt();

        resultado = fibo(n);

        System.out.println("A posição " + n + " na sequência Fibonacci representa o número " + resultado + ".");

        input.close();
    }
}
