package Aula;

public class Aluno {

        public int presenca;
        public int faltas;

        public double nota1;
        public double nota2;
        public double nota3;
        public double nota4;

        int mediaPresenca = (presenca - faltas)/presenca;
        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        public void mediaNotaFianl() {
            if (mediaNotas >= 7) {
                System.out.println("Média final: " + mediaNotas + " Aprovado");
            } else
                System.out.println("Média fianl: " + mediaNotas + " Reprovado");

            if (mediaPresenca >= mediaPresenca * 0.75) {
                System.out.println("Aprovado: " + mediaPresenca);
            }
        }
}
