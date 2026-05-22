package ReusoClasses.RegistroAcademico;

public class RegistroAcademico {
    private String nomeDoAluno;
    private int matricula;
    private String curso;

    public RegistroAcademico(String nomeDoAluno, int matricula, String curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "RegistroAcademico{" +
                "nomeDoAluno='" + nomeDoAluno + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
