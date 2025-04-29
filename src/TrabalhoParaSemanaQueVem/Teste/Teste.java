package TrabalhoParaSemanaQueVem.Teste;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
    }
    private static int validador(){
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
