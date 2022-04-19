public class Conversas {
    static Pessoa maria = new Pessoa("Maria");
    static Pessoa jose = new Pessoa("José");
    static Pessoa joao = new Pessoa("João");
    static Pessoa pedro = new Pessoa("Pedro");

    public static void main(String[] args) {
        maria.conversar(jose);
        jose.conversar(joao);
        joao.conversar(pedro);
        pedro.conversar(maria);
    }
}
