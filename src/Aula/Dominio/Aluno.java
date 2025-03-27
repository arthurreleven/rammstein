package Aula.Dominio;

public class Aluno {

    public double totalAulas;
    public double faltas;

    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;


    public void notaFianl() {
        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        if (mediaNotas >= 7) {
            System.out.println("Média final: " + mediaNotas + " Aprovado");
        } else
            System.out.println("Média fianl: " + mediaNotas + " Reprovado");

    }

    public void mediaPresenca() {
        double mediaPresenca = (faltas / totalAulas) * 100;
        if (mediaPresenca <= 75) {
            System.out.println("Reprovado: " + mediaPresenca);
        } else {
            System.out.println("Aprovado: " + mediaPresenca);
        }
    }

}
