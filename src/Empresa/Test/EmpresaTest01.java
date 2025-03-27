package Empresa.Test;

import Empresa.Dominio.Cliente;
import Empresa.Dominio.Funcionario;

import java.util.Scanner;

public class EmpresaTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu:\n1 - Funcioario\n2 - Cliente");
        int opcao = validador();
        switch (opcao) {
            case 1:
                Funcionario funcionario = new Funcionario();

                System.out.print("Digite o nome do funcioario: ");
                funcionario.nome = entrada.nextLine();

                System.out.print("Digite a idade: ");
                funcionario.idade = entrada.nextInt();

                System.out.print("Digite a quantidade de filhos: ");
                funcionario.filhos = entrada.nextInt();

                System.out.print("Digite a salário: ");
                funcionario.salario = entrada.nextDouble();

                System.out.print("Digite o tempo de serviço: ");
                funcionario.tempoServico = entrada.nextInt();

                funcionario.aumentoSalario();
                funcionario.promoverFuncionario();
                funcionario.demitirFuncionario();
                break;

            case 2:
                Cliente cliente = new Cliente();

                System.out.print("Digite o nome do cliente: ");
                cliente.nome = entrada.nextLine();

                System.out.print("Digite a idade do cliente: ");
                cliente.idade = entrada.nextInt();

                System.out.print("Digite a quantidade de filhos: ");
                cliente.filhos = entrada.nextInt();

                System.out.print("Digite a sua renda: ");
                cliente.renda = entrada.nextDouble();

                cliente.fidelizar();
                cliente.desconto();
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
