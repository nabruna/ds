// Bruna Negrelli de Ana Vitória Valois
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa[] vetPessoa = new Pessoa[7];
        
        double compatibilidadeFinal = 1010010100;
        Pessoa pessoaCompativel = new Pessoa();

        vetPessoa[0] = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        vetPessoa[1] = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        vetPessoa[2] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        vetPessoa[3] = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        vetPessoa[4] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        vetPessoa[5] = new Pessoa("Jéssica", 45, 'F', 85, 60, 70, 50, 60);

        System.out.printf("\n---------- Insira seus dados ----------\n\n");

        System.out.printf("Nome: ");
        String nome = input.next();

        System.out.printf("Idade: ");
        int idade = input.nextInt();

        if (idade < 18) {
            System.out.println("Você é muito jovem para participar dessa seleção. 👶");
        } else {
            System.out.printf("Gênero: ");
            char genero = input.next().charAt(0);

            if (genero == 'M' || genero == 'F') {
                System.out.printf("Gosta de viajar: ");
                int gostaViajar = input.nextInt();

                while (gostaViajar < 0 || gostaViajar > 100) {
                    System.out.printf("Favor inserir apenas numeros entre 0 e 100: ");
                    gostaViajar = input.nextInt();
                }
        
                System.out.printf("Gosta de cozinhar: ");
                int gostaCozinhar = input.nextInt();
        
                while (gostaCozinhar < 0 || gostaCozinhar > 100) {
                    System.out.printf("Favor inserir apenas numeros entre 0 e 100: ");
                    gostaCozinhar = input.nextInt();
                }

                System.out.printf("Gosta de cinema: ");
                int gostaCinema = input.nextInt();

                while (gostaCinema < 0 || gostaCinema > 100) {
                    System.out.printf("Favor inserir apenas numeros entre 0 e 100: ");
                    gostaCinema = input.nextInt();
                }
        
                System.out.printf("Gosta de balada: ");
                int gostaBalada = input.nextInt();

                while (gostaBalada < 0 || gostaBalada > 100) {
                    System.out.printf("Favor inserir apenas numeros entre 0 e 100: ");
                    gostaBalada = input.nextInt();
                }
        
                System.out.printf("Gosta de ficar em casa: ");
                int gostaFicarEmCasa = input.nextInt();

                while (gostaFicarEmCasa < 0 || gostaFicarEmCasa > 100) {
                    System.out.printf("Favor inserir apenas numeros entre 0 e 100: ");
                    gostaFicarEmCasa = input.nextInt();
                }

                vetPessoa[6] = new Pessoa(nome, idade, genero, gostaViajar, gostaCozinhar, gostaCinema, gostaBalada, gostaFicarEmCasa);
                
                for (int i = 0; i < vetPessoa.length; i++) {
                    if (vetPessoa[i].getGenero() != vetPessoa[6].getGenero()) {
                        double compatibilidade = vetPessoa[6].calcularCompatibilidade(vetPessoa[i]);
                        
                        if (compatibilidade < compatibilidadeFinal) {
                            compatibilidadeFinal = compatibilidade;
                            pessoaCompativel = vetPessoa[i];
                        }
                    }
                }
                
                System.out.printf("A pessoa mais compatível com " + vetPessoa[6].getNome() + " é " + pessoaCompativel.getNome() + ".");
                System.out.printf("\n\nDados da pessoa informada: \n");
                System.out.println(vetPessoa[6].toString());

                System.out.printf("\n\nDados da pessoa compatível: \n");
                System.out.println(pessoaCompativel.toString());

            } else {
                System.out.println("Essa seleção não é compatível com seu gênero. 😭");
            }           
        }       

    input.close();
    }
}
