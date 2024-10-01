package Facade;

public class Burguer extends Produto {
    private int gramas;

    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gramas: " + gramas;
    }
}