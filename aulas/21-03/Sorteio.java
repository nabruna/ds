import java.util.Random;

public class Sorteio {
    public static void main (String[] args) {
        Random gerador = new Random();
        int c = 1, num;
        double somaMedia = 0, media;

        while (c <= 1000) {
            num = gerador.nextInt(100) + 1; // sorteia um valor de 1 a 100
            somaMedia += num;
            c++;
        }
        
        media = somaMedia / 1000;

        System.out.println("A média dos números é de: " + media);
    }
}