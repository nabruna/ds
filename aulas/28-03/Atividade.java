import java.util.Scanner;

public class Atividade {
    public static Scanner input;

    public static String verificarParImpar(int n) {
        String resp = "";
        if (n <= 0) {
            resp = "Número inválido, tente novamente.";
        } else if (n % 2 == 0) {
            resp = "Número é par! 👯‍️";
        } else {
            resp = "Número é ímpar! 💃";
        }

        return resp;
    }

    public static int lerNumero() {
        int num;
        System.out.println("Digite um número inteiro para descobrir se é par ou ímpar:");
        num = input.nextInt();
        return num;
    }
    public static void main(String[] args){
        int num;
        input = new Scanner(System.in);
        do {
            num = lerNumero();
            System.out.println(verificarParImpar(num));
        } while (num >= 0);      
        input.close();
    }

}