package Aula;

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
                break;
            case 2:


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
