package TrabalhoParaSemanaQueVem.Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {

    public Cliente(String nome, int idade, double renda, int quantidadeFilhos) {
        super(nome, idade, renda, quantidadeFilhos);
    }

    @Override
    public void pagarContas() {
        System.out.println("Cliente: " + getNome() + " Pagou as sua contas");
    }

    public void comprarProduto() {
        Scanner entrada = new Scanner(System.in);
        int opcaoProduto = validadorProduto();
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Iphone", 5000));
        produtos.add(new Produto("Notebook", 3700));
        produtos.add(new Produto("Relogio Casia", 150));
        produtos.add(new Produto("Tv", 7000));
        produtos.add(new Produto("Geladeira", 2500));
        System.out.println("Menu de Produtos:\n1 - Iphone\n2 - Notebook\n3 - Relogio Casio\n4 - Tv\n5 - Geladeira");
        switch (opcaoProduto){
            case 1:
                produtos.get(0);
                System.out.println(produtos.get(0));
                break;

            case 2:
                produtos.get(1);
                System.out.println(produtos.get(1));
                break;

            case 3:
                produtos.get(2);
                System.out.println(produtos.get(2));
                break;

            case 4:
                produtos.get(3);
                System.out.println(produtos.get(3));
                break;

            case 5:
                produtos.get(4);
                System.out.println(produtos.get(4));
                break;
        }

    }



    private static int validadorProduto() {
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5) {
            return opcao;
        } else {
            System.out.println("Opção invalida");
        }
        return opcao;

    }
}
