package ReusoClasses;

public class RegistroAcademicoPosGraduacaoDelegacao {
    private String tituloTese;
    private String orientador;
    private RegistroAcademico registro;

    public RegistroAcademicoPosGraduacaoDelegacao(String tituloTese, String orientador, String nome, int mat, String curso) {
        this.tituloTese = tituloTese;
        this.orientador = orientador;
        this.registro = new RegistroAcademico(nome, mat, curso);
    }

    @Override
    public String toString() {
        return "RegistroAcademicoPosGraduacao{" +
                "tituloTese='" + tituloTese + '\'' +
                ", orientador='" + orientador + '\'' +
                ", registro=" + registro +
                '}';
    }
}
