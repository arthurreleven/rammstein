package TrabalhoParaSemanaQueVem.Dominio;

public class Produto {

    private String tipoProduto;
    private double valorProduto;

    public Produto(String tipoProduto, double valorProduto) {
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "tipoProduto='" + tipoProduto + '\'' +
                ", valorProduto=" + valorProduto +
                '}';
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
