import java.util.Scanner;

public class Programa {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno alunos[] = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("\n---------- Aluno %d ----------\n\n", i+1);

            System.out.println("Inserir RGM:");
            int RGM = input.nextInt();

            System.out.println("Inserir nome:");
            String nome = input.next();

            System.out.println("Inserir ano de ingresso:");
            int anoIngresso = input.nextInt();

            alunos[i] = new Aluno(RGM, nome, anoIngresso);
        }

        System.out.printf("\n---------- Lista de alunos ----------\n\n");

        for (int j = 0; j < 5; j++) {
            System.out.println("RGM: " + alunos[j].getRGM());
            System.out.println("Nome: " + alunos[j].getNome());
            System.out.println("Ano de ingresso: " + alunos[j].getAnoIngresso());
            System.out.println("-------");
        }

        input.close();
    }
}