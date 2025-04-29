package TrabalhoParaSemanaQueVem.Dominio;

public class Cliente extends Pessoa {

    public Cliente(String nome, int idade, double renda, int quantidadeFilhos) {
        super(nome, idade, renda, quantidadeFilhos);
    }

    @Override
    public void pagarContas() {
        System.out.println("Cliente: " + getNome() + " Pagou as sua contas");
    }
}
