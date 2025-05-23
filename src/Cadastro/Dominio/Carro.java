package Cadastro.Dominio;


//A classe Carro deve ter os seguintes métodos:
//Registrar Carro: O usuário deve informar as características do carro, como modelo, ano e o número de quilômetro1s rodados.

//Calcular Consumo: O carro deve ter um método para calcular o consumo médio de combustível.
//O usuário deve fornecer a quantidade de combustível consumido e a distância percorrida,
//e o programa deve calcular o consumo médio em km/l.


public class Carro {


    public String modelo;
    public int anoFabricacao;
    public double quilometragem;
    public double distanciaPercorrida;
    public double combustivel;


    public String consumoMedio( ) {
        double resultado = distanciaPercorrida / combustivel;
        String kmLitro = String.format("%.2f",resultado);
        System.out.println("Distancia percorrida: " + distanciaPercorrida + "\nQuantidade de compustivel: " + "\n" +kmLitro+"KM/L");
        return kmLitro;
    }
}
