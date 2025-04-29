package TrabalhoParaSemanaQueVem.Teste;

import TrabalhoParaSemanaQueVem.Dominio.Cliente;
import TrabalhoParaSemanaQueVem.Dominio.Funcionario;
import TrabalhoParaSemanaQueVem.Dominio.Gerente;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario("Alex", 29, 2000, 1, 2000,"Pião de fabrica");
        Gerente gerente = new Gerente("Alex", 29, 3000, 5, 3000,"Gerente");
        Cliente cliente = new Cliente("Alex", 29, 7000,14);
//
//        funcionario.aumentoSalario();
//        funcionario.mudarFuncao("Trabaiado");
//        gerente.demitirFuncionario(funcionario.se);
//

        System.out.println("Menu de produtos para ser comprados:\n1 - Iphone\n2 - Notebook\n3 - Relogio Casio\n4 - Tv\n5 - Geladeira");
        int i = cliente.comprarProduto();
        cliente.desconto(i);


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
