import java.util.Scanner;
// Criar uma classe Calculadora com os métodos soma, subtração, multiplicação e divisão.

public class Calculadora {
    public static Scanner input;
    // Cada método deve receber dois inteiros e retornar o resultado: public static int operacao(int a, int b).

    public static int soma(int a, int b) {
        int resultadoSoma = a + b;
        return resultadoSoma;
    }

    public static int subtracao(int a, int b) {       
        int resultadoSubtracao = a - b;
        return resultadoSubtracao;      
    }

    public static int multiplicacao(int a, int b) {
        int resultadoMultiplicacao = a * b;
        return resultadoMultiplicacao;
    }

    public static int divisao(int a, int b) {
        int resultadoDivisao = a / b;
        return resultadoDivisao;
    }

    // No método main, fazer uma chamada a cada um dos métodos desenvolvidos e apresentar o resultado na tela.

    public static void main(String[] arg) {
        int num1, num2;
        input = new Scanner(System.in);
        String quit;

        System.out.printf("\n\nSCRIPT: Calculadora \n\n");
        
        do {
            System.out.printf("Digite o primero valor: ");
            num1 = input.nextInt();

            System.out.printf("Digite o segundo valor: ");
            num2 = input.nextInt();

            // Use o comando System.out.println(...) para mostrar o resultado na tela.
            
            System.out.printf("\nResultado dos cálculos:\n");
            System.out.printf("%d + %d = %d \n", num1, num2, soma(num1, num2));
            System.out.printf("%d - %d = %d \n", num1, num2, subtracao(num1, num2));
            System.out.printf("%d x %d = %d \n", num1, num2, multiplicacao(num1, num2));
            System.out.printf("%d / %d = %d \n\n", num1, num2, divisao(num1, num2));

            System.out.println("Deseja repetir o script? (S/N)");
            quit = input.next();

        } while (!quit.contentEquals("N"));

        input.close();
        
    }
}

// 🐷