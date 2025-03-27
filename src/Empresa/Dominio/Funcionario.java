package Empresa.Dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public int filhos;
    public double salario;
    public int tempoServico;

    public void aumentoSalario() {
        if (salario >= 1500 && idade > 27) {
            salario = salario * 0.25;
            System.out.println(nome + " teve um aumento de: R$" + salario);
        } else {
            System.out.println(nome + " Não teve aumento...");
        }
    }

    public void promoverFuncionario() {

        if (tempoServico > 5 && idade > 32) {
            System.out.println(nome + " agora é gerente do setor...");
        } else {
            System.out.println(nome + " não conseguiu a promoção...");
        }
    }

    public void demitirFuncionario() {
        if (idade > 55 & filhos < 2 && tempoServico < 10) {
            System.out.println("Demitir funcionario: " + nome);
        } else {
            System.out.println(nome + " Não foi demitido...");
        }
    }


}
