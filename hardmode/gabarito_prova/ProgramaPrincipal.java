import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[6];        
        pessoas[0] = new Pessoa();
        pessoas[1] = new Pessoa();
        pessoas[2] = new Pessoa();
        pessoas[3] = new Pessoa();
        pessoas[4] = new Pessoa();
        pessoas[5] = new Pessoa();
        
        Pessoa pessoaTeste = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Nome:");
            pessoaTeste.setNome(teclado.nextLine());

            System.out.println("RG:");
            pessoaTeste.setRg(teclado.nextInt());

            System.out.println("Data de nascimento (AAAA/MM/DD):");
            pessoaTeste.setNascimento(teclado.next());

            System.out.println("Gosta de viajar (deve ser entre 0 e 100):");
            pessoaTeste.setGostaViajar(teclado.nextInt());

            do {
                System.out.println("Gosta de cozinhar (deve ser entre 0 e 100):");
                pessoaTeste.setGostaCozinhar(teclado.nextInt());
            } while (pessoaTeste.getGostaCozinhar() < 0 || pessoaTeste.getGostaCozinhar() > 100);


            do {
                System.out.println("Gosta de cinema (deve ser entre 0 e 100):");
                pessoaTeste.setGostaCinema(teclado.nextInt());
            } while (pessoaTeste.getGostaCinema() < 0 || pessoaTeste.getGostaCinema() > 100);

            do {
                System.out.println("Gosta de balada (deve ser entre 0 e 100):");
                pessoaTeste.setGostaBalada(teclado.nextInt());
            } while (pessoaTeste.getGostaBalada() < 0 || pessoaTeste.getGostaBalada() > 100);

            do {
                System.out.println("Gosta de ficar em casa (deve ser entre 0 e 100):");
                pessoaTeste.setGostaFicarEmCasa(teclado.nextInt());
            } while (pessoaTeste.getGostaFicarEmCasa() < 0 || pessoaTeste.getGostaFicarEmCasa() > 100);

            double menorDistancia = Double.MAX_VALUE;
            Pessoa pessoaMaisCompativel = null;

            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i].calcularDistancia(pessoaTeste) < menorDistancia) {
                    menorDistancia = pessoas[i].calcularDistancia(pessoaTeste);
                    pessoaMaisCompativel = pessoas[i];
                }
            }

            System.out.printf("A pessoa mais compatível com %s é %s.\n", pessoaTeste.getNome(), pessoaMaisCompativel.getNome());
            System.out.printf("Dados da pessoa lida: %s\nDados da pessoa mais compatível: %s\n", pessoaTeste, pessoaMaisCompativel);        
            
            do {
                System.out.println("Dejesa testar outra pessoa (Sim ou Não)?");
                resposta = teclado.nextLine();
            } while (!resposta.equals("Sim") && !resposta.equals("Nao"));
        } while (resposta.equals("Sim"));
        teclado.close();
    }
}
