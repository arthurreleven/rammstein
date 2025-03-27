package Empresa.Dominio;

public class Cliente {

    public String nome;
    public int idade;
    public int filhos;
    public double renda;

    public void fidelizar() {
        if (renda > 2500 && filhos > 3) {
            System.out.println(nome + " Cliente fidelizado...");
        } else {
            System.out.println(nome + " Cliente não fidelizado...");
        }
    }

    public void desconto() {
        if (idade > 35 && filhos > 2){
            System.out.println("Desconto para o Sr(a): " + nome);
        }
    }


}
