import java.util.Random;
import java.util.Scanner;

public class Sorteio2 {
    public static int geradorSorteio(int num) {
        Random gerador = new Random();
        int i = 1;

        while (i <= 6) {
            num = gerador.nextInt(60) + 1;
            System.out.println(num);
            i++;
        }

        return num;
    }

    public static void main (String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os valores: ");
        a = input.nextInt();
        b = input.nextInt();

        
    }


}