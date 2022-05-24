public class ExcecaoFatorial extends Exception {
    private int n;
    public ExcecaoFatorial(int n) {
        this.n = n;
    }

    @Override
    public String getMessage() {
        return String.format("O número precisa ser positivo: %d", n);
    }
}
