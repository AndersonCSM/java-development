package ReusoClasses.Automoveis;

public class Automovel {
    private int ano;
    private String cor;

    public Automovel(int ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    public double quantoCusta(){
        double valor = 0;
        if (ano < 2000){
            return 10000;
        } else {
            return 15000;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
