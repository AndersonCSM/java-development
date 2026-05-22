package ReusoClasses.Automoveis;

public class AutomovelDeLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(boolean airbag, boolean radio, int ano, String cor, boolean arCondicionado, boolean direcaoHidraulica) {
        super(airbag, radio, ano, cor);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    @Override
    public double quantoCusta(){
        double acrescimo = 0;

        if (arCondicionado) acrescimo += 500;
        if (direcaoHidraulica) acrescimo += 2500;

        return super.quantoCusta() + acrescimo;
    }

    @Override
    public String toString() {
        return "AutomovelDeLuxo{" +
                "arCondicionado=" + arCondicionado +
                ", direcaoHidraulica=" + direcaoHidraulica +
                ", Airbag=" + super.isAirbag() +
                ", Radio=" + super.isRadio() +
                ", Cor=" + super.getCor() +
                ", Ano=" + super.getAno() +
                ", Valor= R$" + quantoCusta() +
                '}';
    }
}
