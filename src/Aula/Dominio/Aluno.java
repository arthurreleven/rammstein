package Aula.Dominio;

public class Aluno {

    private double totalAulas;
    private double faltas;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public double getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(double totalAulas) {
        this.totalAulas = totalAulas;
    }

    public double getFaltas() {
        return faltas;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void media() {
        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        double mediaPresenca = ((totalAulas - faltas) / totalAulas) * 100;
        if (mediaNotas >= 7 && mediaPresenca >= 75) {
            System.out.println("Média final: " + mediaNotas +  "\nMedia de presença: " + mediaPresenca + "%, acima dos 75% necessario \nAPROVADO");
        } else if (mediaNotas >= 7 && mediaPresenca < 75) {
            System.out.println("Media final: " + mediaNotas + "\nMedia de presença: " + mediaPresenca + "%, abaixo dos 75% necessario \nREPROVADO POR FALTA");
        } else{
            System.out.println("Media final: " + mediaNotas + "\nMedia de presença: " + mediaPresenca + "% \nREPROVADO");
        }


    }


}
