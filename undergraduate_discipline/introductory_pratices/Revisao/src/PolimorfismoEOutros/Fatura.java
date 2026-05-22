package PolimorfismoEOutros;

public class Fatura implements Pagavel{
    private double preco;
    private int qtdItem;

    public Fatura(double preco, int qtdItem) {
        this.preco = preco;
        this.qtdItem = qtdItem;
    }

    @Override
    public double getPagamento() {
        return preco * qtdItem;
    }
}
