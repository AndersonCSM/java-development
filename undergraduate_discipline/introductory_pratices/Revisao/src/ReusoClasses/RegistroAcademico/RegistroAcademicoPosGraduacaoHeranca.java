package ReusoClasses.RegistroAcademico;

public class RegistroAcademicoPosGraduacaoHeranca extends RegistroAcademico{
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacaoHeranca(String tituloTese, String orientador, String nome, int mat, String curso) {
        super(nome, mat, curso); // construtor da super classe
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "RegistroAcademicoPosGraduacao{" +
                "tituloTese='" + tituloTese + '\'' +
                ", orientador='" + orientador + '\'' +
                ", registro=" + super.toString()+
                '}';
    }
}
