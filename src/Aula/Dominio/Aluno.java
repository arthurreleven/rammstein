package Aula.Dominio;

public class Aluno {

    public double totalAulas;
    public double faltas;

    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;


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

//    public void mediaPresenca() {
//        double mediaPresenca = ((totalAulas - faltas)/totalAulas) * 100;
//        if (mediaPresenca <= 75) {
//            System.out.println("Reprovado: " + mediaPresenca);
//        } else {
//            System.out.println("Aprovado: " + mediaPresenca);
//        }
//    }

}
