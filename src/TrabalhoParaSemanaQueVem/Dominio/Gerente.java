package TrabalhoParaSemanaQueVem.Dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double renda, int quantidadeFilhos, double salario, String funcao) {
        super(nome, idade, renda, quantidadeFilhos, salario, funcao);
    }


    @Override
    public void pagarContas() {
        System.out.println("Gerente: " + getNome() + " Pagou as sua contas");
    }

    public void demitirFuncionario(Funcionario funcionario) {
        System.out.println(funcionario + " DEMITIDO");
    }

    @Override
    public void aumentoSalario() {
        double salarioAtual = getSalario();
        System.out.println("Salário sem aumento (Gerente): " + salarioAtual);
        double novoSalario = salarioAtual + (salarioAtual * 0.50);
        setSalario(novoSalario);
        System.out.println("Salário com aumento (Gerente): " + getSalario() + ", aumento de 50%");
    }

    @Override
    public String mudarFuncao(String novaFuncao) {
        String funcaoAtual = getFuncao();
        System.out.println("Função atual: " + funcaoAtual);
        funcaoAtual = novaFuncao;
        System.out.println("nova função: " + novaFuncao);
        return novaFuncao;
    }
}
