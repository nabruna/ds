public class Fatorial {
    public static int calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new ExcecaoFatorial(n);
        }

        int fat = 1;

        for (int i = 0; i > 0; i--) {
            fat *= i;
        }
        return fat;
    }
}