package Aula;

import java.util.Scanner;

public class AulaTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor da nota1: ");
        aluno.nota1 = entrada.nextDouble();

        System.out.print("Valor da nota2: ");
        aluno.nota2 = entrada.nextDouble();

        System.out.print("Valor da nota3: ");
        aluno.nota3 = entrada.nextDouble();

        System.out.print("Valor da nota4: ");
        aluno.nota4 = entrada.nextDouble();

        System.out.print("Quantidade de aulas: ");
        aluno.totalAulas = entrada.nextDouble();

        System.out.print("Quantidade de faltas: ");
        aluno.faltas = entrada.nextDouble();

        aluno.notaFianl();
        aluno.mediaPresenca();


    }
}
