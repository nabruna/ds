public class Aluno
{
    private String nome;
    private int RGM;
    private int anoIngresso;

    public Aluno(int RGM, String nome, int anoIngresso)
    {
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }
    public int getRGM() {
        return this.RGM;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAnoIngresso() {
        return this.anoIngresso;
    }
    public void setRGM(int RGM) {
        this.RGM = RGM;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
