import java.util.Scanner;

public class Fatorial {
    public static String fatorial(int a) {
        String res;

        if (a < 0) {
            res = "Favor inserir um número positivo";
        } else if (a == 0) {
            res = "Seu fatorial é 0";
        } else {
            int num = a;
            int fatorial = a;
            
            while (num != 1) {
                num--;
                fatorial = fatorial * num;
            }
            res = "Seu fatorial é " + fatorial + ".";
        }
        return res;
    }
    public static void main (String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do número que deseja calcular o fatorial: ");
        num = input.nextInt();

        System.out.println(fatorial(num));

        input.close();
    }
}

