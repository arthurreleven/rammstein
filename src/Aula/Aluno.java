package Aula;

public class Aluno {

        public int totalAulas;
        public int faltas;

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

        public void mediaPresenca(){
            double mediaPresenca = (totalAulas - faltas) * 1.0;
            if (mediaPresenca >= 0.75){
            System.out.println("Aprovado: " + mediaPresenca);
            }else {
                System.out.println("Reprovado: " + mediaPresenca);
            }
        }

}
