import java.util.Scanner;
// Faça um programa que calcule o fatorial de um número inteiro informado pelo usuário.

public class Fatorial {
    public static Scanner input;

    public static String fatorial(int a) {
        String resp;
        // Validar a entrada pois o número precisa ser positivo.
        if (a < 0) {
            resp = "Favor inserir um número positivo.";
        } else if (a == 0) {
            resp = "O fatorial de " + a + " é 0.";
        } else {
            int num = a;
            int fatorial = a;
            
            while (num != 1) {
                num--;
                fatorial = fatorial * num;
            }
            resp = "O fatorial de " + a + " é " + fatorial + ".";
        }
        return resp;
    }
    public static void main (String[] args) {
        int num;
        input = new Scanner(System.in);
        String quit;

        System.out.printf("\n\nSCRIPT: Cálculo de fatorial \n");
        
        do {
            System.out.printf("\nDigite o número do qual deseja calcular o fatorial: ");
            num = input.nextInt();

            System.out.printf("%s\n\n", fatorial(num));

            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();
        } while (!quit.contentEquals("N"));
        
        input.close();
    }
}

