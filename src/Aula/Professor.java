package Aula;

public class Professor {

    public double totalAlunos;
    public double alunosAprovados;
    public double totalAulas;

    public void promocao() {
        double mediaAprovados = (  alunosAprovados / totalAlunos) * 100;
        if (mediaAprovados >= 75) {
            System.out.println("Professor promovido...");
        } else {
            System.out.println("Não promovido");
        }
    }

    public void bonificacao() {
        if (totalAulas >= 30) {
            System.out.println("Direito a bonificação...");
        } else {
            System.out.println("Sem direito a bonificação...");
        }
    }


}
