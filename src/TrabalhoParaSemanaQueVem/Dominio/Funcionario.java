package TrabalhoParaSemanaQueVem.Dominio;

public class Funcionario extends Pessoa {

    private double salario;
    private String funcao;

    public Funcionario(double salario, String funcao) {
        this.salario = salario;
        this.funcao = funcao;
    }

    public void aumentoSalario() {

        System.out.println("Salario sem aumento: " + salario);
        salario = salario + (salario * 0.30);
        System.out.println("Salario com aumento:" + salario);

    }

    public String mudarFuncao(String novaFuncao){
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
