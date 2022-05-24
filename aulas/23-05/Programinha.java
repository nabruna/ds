import java.util.Scanner;

public class Programinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número");
        int n = input.nextInt();
        try {
            int fat = Fatorial.calcularFatorial(n);
            System.out.printf("O fatorial de %d é %d.", n, fat);
        } catch (ExcecaoFatorial e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
