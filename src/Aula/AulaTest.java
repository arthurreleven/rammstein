package Aula;

import java.util.Scanner;

public class AulaTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

//        System.out.print("Valor da nota1: ");
//        aluno.nota1 = entrada.nextInt();
//
//        System.out.print("Valor da nota2: ");
//        aluno.nota2 = entrada.nextInt();
//
//        System.out.print("Valor da nota3: ");
//        aluno.nota3 = entrada.nextInt();
//
//        System.out.print("Valor da nota4: ");
//        aluno.nota4 = entrada.nextInt();

        System.out.print("Quantidade de aulas: ");
        aluno.totalAulas = entrada.nextInt();

        System.out.print("Quantidade de faltas: ");
        aluno.faltas = entrada.nextInt();

//        aluno.notaFianl();
        aluno.mediaPresenca();




    }
}
