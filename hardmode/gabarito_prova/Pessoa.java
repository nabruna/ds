import java.util.Date;
import java.util.HashMap;

public class Pessoa {
    private String nome;
    private int rg;
    private Date nascimento;
    private HashMap<String, String> email;
    private HashMap<String, String> telefone;
    private Endereco<String, String> endereco;

    public Pessoa() {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public HashMap<String, String> getEmail() {
        return email;
    }
    public void setEmail(HashMap<String, String> email) {
        this.email = email;
    }
    public HashMap<String, String> getTelefone() {
        return telefone;
    }
    public void setTelefone(HashMap<String, String> telefone) {
        this.telefone = telefone;
    }
    public Endereco<String, String> getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco<String, String> endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa(String nome, int rg, Date nascimento, 
        HashMap<String, String> email, HashMap<String, String> telefone, Endereco<String, String> endereco) {
            this.nome = nome;
            this.rg = rg;
            this.nascimento = nascimento;
            this.email = email;
            this.telefone = telefone;
            this.endereco = endereco;
    }
    
    @Override
    public String toString() {        
        return String.format(
            "Nome: %s\n" +
            "RG: %d\n" +
            "Nascimento: %c\n" +
            "Email: %d\n" +
            "Telefone: %d\n" +
            "Endereco: %d\n" +
            nome,
            rg,
            nascimento,
            email,
            telefone,
            endereco
        );
    }   
}