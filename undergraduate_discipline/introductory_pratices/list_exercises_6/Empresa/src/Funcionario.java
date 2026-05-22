public class Funcionario {
    private String nome;
    private int idFuncionario;
    private float salarioHora;
    private String setor;

    public Funcionario(String nome){
        this.nome = nome;
        this.idFuncionario = 0;
        this.salarioHora = 2;
        this.setor = "ParaAlocar";
    }

    public Funcionario(String nome, float salarioHora){
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.idFuncionario = 0;
        this.setor = "ParaALocar";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idFuncionario=" + idFuncionario +
                ", salarioHora=" + salarioHora +
                ", setor='" + setor + '\'' +
                '}';
    }
}
