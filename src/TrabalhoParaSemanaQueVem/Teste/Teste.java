package TrabalhoParaSemanaQueVem.Teste;

import TrabalhoParaSemanaQueVem.Dominio.Cliente;
import TrabalhoParaSemanaQueVem.Dominio.Funcionario;
import TrabalhoParaSemanaQueVem.Dominio.Gerente;


import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


        System.out.println("Menu:\n1 - Funcionario\n2 - Gerente\n3 - Cliente ");
        int opcao = validador();

        switch (opcao) {
            case 1:
                Funcionario funcionario = new Funcionario("Alex de um universo parelelo", 29, 4500, 3, 4500, "Pião de fabrica");
                System.out.println(funcionario);
                funcionario.aumentoSalario();
                String a = JOptionPane.showInputDialog("Lisa de funções Funcionario:\n1 - Meio Oficial\n2 - Operador A\n3 - Operador B\n4 - Operador C\n5 - Operador Senior\n6 - Lider");
                funcionario.mudarFuncao(a);
                funcionario.pagarContas();
                break;

            case 2:
                Gerente gerente = new Gerente("Alex de outro universo paralelo", 47, 30000, 4, 25000, "Gerente");
                System.out.println(gerente);
                gerente.aumentoSalario();
                String b = JOptionPane.showInputDialog("Lisa de funções Gerente:\n1 - Gerente regional\n2 - Gerente geral\n3 - Diretor\n4 - Presidente");
                gerente.mudarFuncao(b);
                String c = JOptionPane.showInputDialog("Lista de funcionarios a ser demitidos:\n1 - Luiano\n2 - Alex\n3 - Wamberto\n4 - Julio\n5 - Daniel\n6 - Rodrigo\n7 - Rafael\n8 - Pedro");
                gerente.demitirFuncionario(c);
                gerente.pagarContas();
                break;

            case 3:
                Cliente cliente = new Cliente("Alex Tavares de oliveira", 29, 2500, 0);
                System.out.println(cliente);
                String s = JOptionPane.showInputDialog("Menu de produtos para ser comprados:\n1 - Iphone\n2 - Notebook\n3 - Relogio Casio\n4 - Tv\n5 - Geladeira\n6 - Ps5\n7 - Carro");
                int i = cliente.comprarProduto(s);
                cliente.desconto(i);
                cliente.reclamarPreco();
                cliente.pagarContas();
                break;

        }

            
    }

    private static int validador() {
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        if (opcao == 1 || opcao == 2 || opcao == 3) {
            return opcao;
        } else {
            System.out.println("Opção invalida");
        }
        return opcao;

    }
}
