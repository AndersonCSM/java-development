package ReusoClasses.Empresa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int identidade, double salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario='" + salario + '\'' +
                "nome='" + super.getNome() + '\'' +
                "identidade='" + super.getIdentidade() + '\'' +
                '}';
    }
}
