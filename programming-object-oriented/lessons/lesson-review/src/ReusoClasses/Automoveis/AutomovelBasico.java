package ReusoClasses.Automoveis;

public class AutomovelBasico extends Automovel{
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(boolean airbag, boolean radio, int ano, String cor) {
        super(ano, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    @Override
    public double quantoCusta(){
        double acrescimo = 0;

        if (airbag) acrescimo += 250;
        if (radio) acrescimo += 100;

        return super.quantoCusta() + acrescimo;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }
}
