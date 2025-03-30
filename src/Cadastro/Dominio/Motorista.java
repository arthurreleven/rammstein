package Cadastro.Dominio;

//A classe Motorista deve ter os seguintes métodos:
//Verificar Idade para Dirigir: O motorista deve ter sua idade informada.

//O programa deve verificar se a idade do motorista é maior ou igual a 18 anos para que ele possa dirigir.

//Verificar Pontuação da Carteira: O motorista deve ter a pontuação de sua carteira de habilitação informada.
//Se a pontuação for maior ou igual a 12 pontos, o motorista estará suspenso e não poderá dirigir.



public class Motorista {
    public int idade;
    public int pontosCarteira;

    public void carteiraPontos(){
        if (pontosCarteira >= 12){
            System.out.println("Carteira de motorista suspensa, não poderá dirigir...");
        }else {
            System.out.println("Apto para dirigir...");
        }
    }

    
}
