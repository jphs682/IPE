public abstract class Oportunidade implements Resumivel {

    private String titulo;
    private int vagas;
    private int classificados = 0;
    private boolean aberta = true;
    private Professor responsavel;

    public Oportunidade(String titulo, int vagas, Professor responsavel) {
        this.titulo = titulo;
        this.vagas = vagas < 1 ? 1 : vagas;
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVagas() {
        return vagas;
    }

    public int getClassificados() {
        return classificados;
    }

    public boolean isAberta() {
        return aberta;
    }

    public Professor getResponsavel() {
        return responsavel;
    }

    public void encerrar() {
        aberta = false;
    }

    public Inscricao inscrever(Estudante estudante) {
        if (!aberta) {
            return null;
        }

        return new Inscricao(estudante, this);
    }

    public boolean registrarClassificacao() {
        if (classificados >= vagas) {
            return false;
        }

        classificados++;
        return true;
    }

    public abstract int cargaHorariaSemanal();

    @Override
    public String resumo() {
        return titulo + " - " + cargaHorariaSemanal() + " horas semanais";
    }

    @Override
    public String toString() {
        return "Oportunidade{" +
                "titulo='" + titulo + '\'' +
                ", vagas=" + vagas +
                ", classificados=" + classificados +
                ", aberta=" + aberta +
                ", responsavel=" + responsavel.getNome() +
                '}';
    }
}
