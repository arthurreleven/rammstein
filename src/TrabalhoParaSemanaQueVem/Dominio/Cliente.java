package TrabalhoParaSemanaQueVem.Dominio;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Pessoa {

    public List<Produto> produtos = new ArrayList<>(List.of(
            new Produto("Iphone", 5000),
            new Produto("Notebook", 3700),
            new Produto("Relogio Casia", 150),
            new Produto("Tv", 7000),
            new Produto("Geladeira", 2500),
            new Produto("Ps5", 5700),
            new Produto("Carro", 10_000)));



    public Cliente(String nome, int idade, double renda, int quantidadeFilhos) {
        super(nome, idade, renda, quantidadeFilhos);
    }

    @Override
    public void pagarContas() {
        System.out.println("Cliente: " + getNome() + " Pagou as sua contas");
    }

    public int comprarProduto(String opcao) {
        int opcaoProduto;

        try {
            opcaoProduto = Integer.parseInt(opcao);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Opção invalida, escolha de 1 a 7");
            return -1;
        }

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

            case 6:
                produtos.get(5);
                System.out.println(produtos.get(5));
                break;

            case 7:
                produtos.get(6);
                System.out.println(produtos.get(6));
                break;
        }
        return index;


    }

    public void reclamarPreco() {
        System.out.println("O preço tá caro !!");
    }

    public void desconto(int indiceProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoSelecionado = produtos.get(i);
            if (i == indiceProduto) {
                double valorProduto = produtoSelecionado.getValorProduto();
                double valorProdutoDesconto = valorProduto - (valorProduto * 0.10);
                produtoSelecionado.setValorProduto(valorProdutoDesconto);
                System.out.println("Valor do produto com desconto: " + produtoSelecionado.getValorProduto() + " Desconto foi de 10% !!!");
            }
        }


    }



}
