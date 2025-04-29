package TrabalhoParaSemanaQueVem.Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {

    public List<Produto> produtos = new ArrayList<>(List.of(
            new Produto("Iphone", 5000),
            new Produto("Notebook", 3700),
            new Produto("Relogio Casia", 150),
            new Produto("Tv", 7000),
            new Produto("Geladeira", 2500)));

    public Cliente(String nome, int idade, double renda, int quantidadeFilhos) {
        super(nome, idade, renda, quantidadeFilhos);
    }

    @Override
    public void pagarContas() {
        System.out.println("Cliente: " + getNome() + " Pagou as sua contas");
    }

    public int comprarProduto() {
        Scanner entrada = new Scanner(System.in);
        int opcaoProduto = validadorProduto();
        int index = opcaoProduto - 1;
        switch (opcaoProduto) {
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
        return index;


    }

    public void reclamarPreco() {
        System.out.println("O preço tá caro? \n  VOTA NA PORRA DO LULA EM 2026 DE NOVO SEUS FILHOS DA PUTA, FAZ O L");
    }

    public void desconto(int indiceProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoSelecionado = produtos.get(i);
            if (i == indiceProduto) {
                double valorProduto = produtoSelecionado.getValorProduto();
                double valorProdutoDesconto = valorProduto - (valorProduto * 0.10);
                produtoSelecionado.setValorProduto(valorProdutoDesconto);
                System.out.println("Valor do produto com desconto: " + produtoSelecionado.getValorProduto() + " Desconto foi de 10%, pra você que não percebeu!!!");
            }
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
