import java.util.Scanner;
// Criar uma classe Calculadora com os métodos soma, subtração, multiplicação e divisão.

public class Calculadora {
    // Métodos
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
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primero valor: ");
        a = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = input.nextInt();

        // Use o comando System.out.println(...) para mostrar o resultado na tela.
        
        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("Divisão: " + divisao(a, b));

        input.close();
    }
}

// 🐷