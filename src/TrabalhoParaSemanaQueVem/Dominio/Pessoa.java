package TrabalhoParaSemanaQueVem.Dominio;

public abstract class Pessoa {

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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", renda=" + renda +
                ", quantidadeFilhos=" + quantidadeFilhos +
                '}';
    }

    public void pagarContas() {
        System.out.println();
    }

    public void imprime(){

    }

    public String getNome() {
        return nome;
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
