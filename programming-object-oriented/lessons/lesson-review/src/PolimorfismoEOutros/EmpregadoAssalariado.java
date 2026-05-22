package PolimorfismoEOutros;

public class EmpregadoAssalariado extends Empregado{
    private int salario;

    public EmpregadoAssalariado(int salario) {
        this.salario = salario;
    }

    @Override
    public double getPagamento() {
        return salario;
    }
}
