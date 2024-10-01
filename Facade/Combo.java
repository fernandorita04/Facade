package Facade;

public class Combo {
    private Produto burguer;
    private Produto sobremesa;
    private Produto bebida;

    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            // Combo Master
            this.burguer = new Burguer("Hambúrguer Duplo", 15.90, 200);
            this.sobremesa = new Sobremesa("Sorvete", 7.50, "Médio");
            this.bebida = new Bebida("Refrigerante", 5.00, 500);
        } else if (tipo == 2) {
            // Super Combo
            this.burguer = new Burguer("Hambúrguer Triplo", 20.90, 300);
            this.sobremesa = new Sobremesa("Torta de Maçã", 10.00, "Grande");
            this.bebida = new Bebida("Suco", 6.00, 400);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    @Override
    public String toString() {
        if (burguer != null && sobremesa != null && bebida != null) {
            return "Combo:\n" + burguer.toString() + "\n" + sobremesa.toString() + "\n" + bebida.toString();
        } else {
            return "Combo não foi criado.";
        }
    }
}