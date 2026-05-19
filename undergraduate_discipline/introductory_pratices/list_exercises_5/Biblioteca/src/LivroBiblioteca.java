public class LivroBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean statusEmprestado = false;
    private String localizacao;
    private String descricao;

    public LivroBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    @Override
    public boolean estaEmprestado() {
        return statusEmprestado;
    }

    @Override
    public void empresta() {
        statusEmprestado = true;
    }

    @Override
    public void devolve() {
        statusEmprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", statusEmprestado=" + (statusEmprestado?"Indisponivel":"Disponivel") +
                ", localizacao='" + localizacao + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
