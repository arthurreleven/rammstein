package TrabalhoParaSemanaQueVem.Dominio;

public class Pessoa {

    private String nome;
    private int idade;
    private double renda;
    private int quantidadeFilhos;

    public Pessoa(String nome, int idade, double renda, int quantidadeFilhos) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void pagarContas() {
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }
}
