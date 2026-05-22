package ReusoClasses.Empresa;

public class ChefeDeDepartamento extends  Funcionario{
    private String departamento;

    public ChefeDeDepartamento(String nome, int identidade, double salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "ChefeDeDepartamento{" +
                "departamento='" + departamento + '\'' +
                "nome='" + super.getNome() + '\'' +
                "identidade='" + super.getIdentidade() + '\'' +
                "salario='" + super.getSalario() + '\'' +
                '}';
    }
}

