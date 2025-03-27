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
        }else {
            System.out.println("Não teve aumento...");
        }
    }

    public void  promoverFuncionario(){

        if (tempoServico >5 && idade>32){
            System.out.println();
        }
    }


}
