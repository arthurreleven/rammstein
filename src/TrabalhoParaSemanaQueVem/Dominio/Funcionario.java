package TrabalhoParaSemanaQueVem.Dominio;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private double salario;
    private String funcao;

    public Funcionario(String nome, int idade, double renda, int quantidadeFilhos, double salario, String funcao) {
        super(nome, idade, renda, quantidadeFilhos);
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{"+
                "Nome = " + getNome() +
                ", salario = " + salario +
                ", funcao = '" + funcao + '\'' +
                '}';
    }

    @Override
    public void pagarContas() {
        System.out.println("Funcionario: " + getNome() + " Pagou as sua contas");
    }

    public void aumentoSalario() {

        System.out.println("Salário sem aumento: " + salario);
        salario = salario + (salario * 0.30);
        System.out.println("Salário com aumento:" + salario);

    }


    public String mudarFuncao(String novaFuncao) {
        this.funcao = novaFuncao;
        System.out.println(novaFuncao);
        return novaFuncao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
