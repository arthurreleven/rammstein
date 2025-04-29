package TrabalhoParaSemanaQueVem.Dominio;

public class Gerente extends  Funcionario {

    public Gerente(String nome, int idade, double renda, int quantidadeFilhos, double salario, String funcao) {
        super(nome, idade, renda, quantidadeFilhos, salario, funcao);
    }



    @Override
    public void pagarContas() {
        System.out.println("Gerente: " + getNome() + " Pagou as sua contas");
    }
}
