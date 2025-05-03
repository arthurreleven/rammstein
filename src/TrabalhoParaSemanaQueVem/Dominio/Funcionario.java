package TrabalhoParaSemanaQueVem.Dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    public List<String> funcoes = new ArrayList<>(List.of("Meio Oficial", "Operador A", "Operador B", "Operador C", "Operador Senior", "Lider"));


    private double salario;
    private String funcao;

    public Funcionario(String nome, int idade, double renda, int quantidadeFilhos, double salario, String funcao) {
        super(nome, idade, renda, quantidadeFilhos);
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
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
        System.out.println("Salário com aumento: " + salario + ", aumento de 30%");

    }


    public int mudarFuncao(String funcaoAtual) {
        int novaFuncao;

        try {
            novaFuncao = Integer.parseInt(funcaoAtual);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção invalida, escolha de 1 a 6");
            return -1;
        }

        int index = novaFuncao - 1;

        switch (novaFuncao) {
            case 1:
                funcoes.get(0);
                System.out.println("Sua nova função: " + funcoes.get(0));
                break;

            case 2:
                funcoes.get(1);
                System.out.println("Sua nova função: " + funcoes.get(1));
                break;

            case 3:
                funcoes.get(2);
                System.out.println("Sua nova função: " + funcoes.get(2));
                break;

            case 4:
                funcoes.get(3);
                System.out.println("Sua nova função: " + funcoes.get(3));
                break;

            case 5:
                funcoes.get(4);
                System.out.println("Sua nova função: " + funcoes.get(4));
                break;

            case 6:
                funcoes.get(5);
                System.out.println("Sua nova função: " + funcoes.get(5));
                break;
        }
        return index;
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
