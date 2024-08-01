package Classes;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String novoNome, int novaIdade) {
        nome = novoNome;
        idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
