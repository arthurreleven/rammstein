package Cadastro.Test;

import Cadastro.Dominio.Carro;
import Cadastro.Dominio.Motorista;

import java.util.Scanner;

public class CadastroTest01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu:\n1 - Motorista\n2 - Carro");
        int opcao =validador();

        Motorista motorista = new Motorista();
        Carro carro = new Carro();

        switch (opcao){
            case 1:
                System.out.print("Digite a idade: " );
                motorista.idade = entrada.nextInt();

                System.out.print("Digite quantos pontos na carteira de habilitação: ");
                motorista.pontosCarteira = entrada.nextInt();

                motorista.carteiraPontos();
                break;

            case 2:
                System.out.print("Digite o modelo do veiculo: ");
                carro.modelo = entrada.nextLine();

                System.out.print("Digite o ano de fabricação do veiculo: ");
                carro.anoFabricacao = entrada.nextInt();

                System.out.print("Digite a quilometragem do veiculo: ");
                carro.quilometragem = entrada.nextDouble();

                System.out.print("Digite a distancia percorrida: ");
                carro.distanciaPercorrida = entrada.nextDouble();

                System.out.print("Digite a quantidade de combustivel: ");
                carro.combustivel = entrada.nextDouble();

                carro.consumoMedio();
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
