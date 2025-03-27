package Empresa.Test;

import java.util.Scanner;

public class EmpresaTest01 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int opcao = validador();




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
