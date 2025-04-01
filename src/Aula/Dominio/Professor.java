package Aula.Dominio;

public class Professor {

    private double totalAlunos;
    private double alunosAprovados;
    private double totalAulas;

    public double getTotalAlunos() {
        return totalAlunos;
    }

    public void setTotalAlunos(double totalAlunos) {
        this.totalAlunos = totalAlunos;
    }

    public double getAlunosAprovados() {
        return alunosAprovados;
    }

    public void setAlunosAprovados(double alunosAprovados) {
        this.alunosAprovados = alunosAprovados;
    }

    public double getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(double totalAulas) {
        this.totalAulas = totalAulas;
    }

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
