// Bruna Negrelli e Ana Vitória Valois

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar, gostaCozinhar, gostaCinema, gostaBalada, gostaFicarEmCasa;
    
    public Pessoa () {}

    public Pessoa(String nome, int idade, char genero, int gostaViajar, int gostaCozinhar, int gostaCinema, int gostaBalada, int gostaFicarEmCasa) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public char getGenero() {
        return genero;
    }
    public int getGostaViajar() {
        return gostaViajar;
    }
    public int getGostaCozinhar() {
        return gostaCozinhar;
    }
    public int getGostaCinema() {
        return gostaCinema;
    }
    public int getGostaBalada() {
        return gostaBalada;
    }
    public int getGostaFicarEmCasa() {
        return gostaFicarEmCasa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setGostaViajar(int gostaViajar) {
        this.gostaViajar = gostaViajar;
    }
    public void setGostaCozinhar(int gostaCozinhar) {
        this.gostaCozinhar = gostaCozinhar;
    }
    public void setGostaCinema(int gostaCinema) {
        this.gostaCinema = gostaCinema;
    }
    public void setGostaBalada(int gostaBalada) {
        this.gostaBalada = gostaBalada;
    }
    public void setGostaFicarEmCasa (int gostaFicarEmCasa) {
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nIdade: %d \nGênero: %s \nGosta de viajar: %d \nGosta de cozinhar: %d \nGosta de balada: %d \nGosta de cinema: %d \nGosta de ficar em casa: %d", nome, idade, genero, gostaViajar, gostaCozinhar, gostaBalada, gostaCinema, gostaFicarEmCasa);
    }

    public double calcularCompatibilidade(Pessoa pessoa) {
        double A = Math.pow(pessoa.gostaViajar - this.gostaViajar, 2);
        double B = Math.pow(pessoa.gostaCozinhar - this.gostaCozinhar, 2);
        double C = Math.pow(pessoa.gostaCinema - this.gostaCinema, 2);
        double D = Math.pow(pessoa.gostaBalada - this.gostaBalada, 2);
        double E = Math.pow(pessoa.gostaFicarEmCasa - this.gostaFicarEmCasa, 2);

        double F = Math.sqrt(A + B + C + D + E);
        return F;
    }

    public static void main(String[] args) {
        Pessoa joao = new Pessoa();


        System.out.printf(joao.toString());
    }

}