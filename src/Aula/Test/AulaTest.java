package Aula.Test;

import Aula.Dominio.Aluno;
import Aula.Dominio.Professor;

import java.util.Scanner;

public class AulaTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu:\n1 - Aluno\n2 - Professor");
        int opcao = validador();


        switch (opcao) {
            case 1:
                Aluno aluno = new Aluno();
                System.out.print("Valor da nota1: ");
                aluno.setNota1(entrada.nextDouble());

                System.out.print("Valor da nota2: ");
                aluno.setNota2(entrada.nextDouble());

                System.out.print("Valor da nota3: ");
                aluno.setNota3(entrada.nextDouble());

                System.out.print("Valor da nota4: ");
                aluno.setNota4(entrada.nextDouble());

                System.out.print("Quantidade de aulas: ");
                aluno.setTotalAulas(entrada.nextDouble());

                System.out.print("Quantidade de faltas: ");
                aluno.setFaltas(entrada.nextDouble());

                aluno.media();
                break;

            case 2:
                Professor professor = new Professor();

                System.out.print("Digite a quantidade total de alunos: ");
                professor.setTotalAlunos(entrada.nextDouble());

                System.out.print("Digite a aquantidade de alunos aprovados:");
                professor.setAlunosAprovados(entrada.nextDouble());

                System.out.print("Digite a quantidade de aulas: ");
                professor.setTotalAulas(entrada.nextDouble());

                professor.promocao();
                professor.bonificacao();
                break;




        }


    }

    public static int validador() {
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        if (opcao == 1 || opcao == 2) {
            return opcao;
        } else {
            System.out.println("Opção invalida");
        }
        return opcao;

    }


}
