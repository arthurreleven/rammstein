package Aula;

public class Professor {

    public double totalAlunos;
    public double alunosAprovados;
    public Aluno aluno;

    public void promocao() {
        double mediaAprovados = ((totalAlunos - alunosAprovados) / totalAlunos) * 100;
        if (mediaAprovados >=75){
            System.out.println("Professor promovido...");
        }else {
            System.out.println("Não promovido");
        }
    }

    public void bonificacao(){
        if (aluno.totalAulas >=30){
            System.out.println("Direito a bonificação...");
        }else {
            System.out.println("Sem direito a bonificação...");
        }
    }



}
