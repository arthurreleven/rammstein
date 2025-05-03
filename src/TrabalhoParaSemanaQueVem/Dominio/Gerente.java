package TrabalhoParaSemanaQueVem.Dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    public List<Funcionario> funcionarios = new ArrayList<>(List.of(
            new Funcionario("Luiano", 50, 2500, 1, 2500, "Pião oreia seca"),
            new Funcionario("Alex", 29, 1_000_000, 0, 1_000_000, "O  funcionario maioral. O melhor que já teve"),
            new Funcionario("Wamberto", 34, 4500, 0, 4000, "O lider filósofo"),
            new Funcionario("Julio", 31, 5000, 2, 5000, "O bancario vagabundo"),
            new Funcionario("Daniel", 37, 7000, -10, 7000, "O cara que mexe com madeira"),
            new Funcionario("Rodrigo", 37, 4000, 0, 4000, "Amante do cara que mexe com madeira"),
            new Funcionario("Rafael", 39, 8800, 1, 8000, "Aquele que doou dinheiro pro bolsonaro "),
            new Funcionario("Pedrão", 29, 3500, 0, 4000, "aspirante a lider")
    ));

public List<String> funcoes = new ArrayList<>(List.of("Gerente regional", "Gerente geral", "Diretor", "Presidente"));

    public Gerente(String nome, int idade, double renda, int quantidadeFilhos, double salario, String funcao) {
        super(nome, idade, renda, quantidadeFilhos, salario, funcao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
             "Nome = " + getNome() +
                ", Idade =" + getIdade() +
                ", Renda = " + getRenda() +
                ", Quantidade de filhos = " + getQuantidadeFilhos() +
                ", Salário = " + getSalario() +
                ", Função = " + getFuncao() +
                '}';
    }

    @Override
    public void pagarContas() {
        System.out.println("Gerente: " + getNome() + " Pagou as sua contas");
    }

    public int demitirFuncionario(String funcionario) {
        int funcionarioDemitido;
        try {
            funcionarioDemitido = Integer.parseInt(funcionario);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção invalida, escolha de 1 a 8");
            return -1;
        }

        int index = funcionarioDemitido - 1;
        switch (funcionarioDemitido) {
            case 1:
                funcionarios.get(0);
                System.out.println(funcionarios.get(0) + "Demitido");
                break;

            case 2:
                funcionarios.get(1);
                System.out.println(funcionarios.get(1) + "Demitido");
                break;

            case 3:
                funcionarios.get(2);
                System.out.println(funcionarios.get(2) + "Demitido");
                break;

            case 4:
                funcionarios.get(3);
                System.out.println(funcionarios.get(3) + "Demitido");
                break;

            case 5:
                funcionarios.get(4);
                System.out.println(funcionarios.get(4) + "Demitido");
                break;

            case 6:
                funcionarios.get(5);
                System.out.println(funcionarios.get(5) + "Demitido");
                break;

            case 7:
                funcionarios.get(6);
                System.out.println(funcionarios.get(6) + "Demitido");
                break;

            case 8:
                funcionarios.get(7);
                System.out.println(funcionarios.get(7) + "Demitido");
                break;
        }
        return index;

    }

    @Override
    public void aumentoSalario() {
        double salarioAtual = getSalario();
        double novoSalario = salarioAtual + (salarioAtual * 0.50);
        setSalario(novoSalario);
        System.out.println("Salário com aumento (Gerente): " + getSalario() + ", aumento de 50%");
    }

    @Override
    public int mudarFuncao(String funcaoAtual) {
        int novaFuncao;

        try {
            novaFuncao = Integer.parseInt(funcaoAtual);
        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Opção invalida, escolha de 1 a 4");
            return -1;
        }

        int index  = novaFuncao - 1;
        switch (novaFuncao){
            case 1:
                funcoes.get(0);
                System.out.println("Nova função: " + funcoes.get(0));
                break;

            case 2:
                funcoes.get(1);
                System.out.println("Nova função: " + funcoes.get(1));
                break;

            case 3:
                funcoes.get(2);
                System.out.println("Nova função: " + funcoes.get(2));
                break;

            case 4:
                funcoes.get(3);
                System.out.println("Nova função: " + funcoes.get(3));
                break;
        }
        return index;
    }
}
