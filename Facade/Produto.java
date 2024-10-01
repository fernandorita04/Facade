package Facade;

public class Produto {
    protected String descricao;
    protected double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Preço: R$" + String.format("%.2f", preco);
    }
}