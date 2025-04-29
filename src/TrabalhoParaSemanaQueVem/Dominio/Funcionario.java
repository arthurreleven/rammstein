package TrabalhoParaSemanaQueVem.Dominio;

public class Funcionario extends Pessoa {

    private double salario;


    public void aumentoSalario() {

        System.out.println("Salario sem aumento: " + salario);
        salario = salario + (salario * 0.30);
        System.out.println("Salario com aumento:" + salario);


    }


}
