/**
 * Representa uma oportunidade acadêmica oferecida por um professor.
 */
public class Oportunidade {
    private String titulo;
    private int vagas;
    private int classificados;
    private boolean aberta;
    private Professor responsavel;

    public Oportunidade(String titulo, int vagas, Professor responsavel) {
        this.titulo = titulo;
        this.vagas = Math.max(1, vagas);
        this.classificados = 0;
        this.aberta = true;
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

    /**
     * Cria uma inscrição enquanto a oportunidade estiver aberta.
     * Retorna null quando a oportunidade estiver encerrada.
     */
    public Inscricao inscrever(Estudante estudante) {
        if (!aberta || estudante == null) {
            return null;
        }
        return new Inscricao(estudante, this);
    }

    /**
     * Registra uma classificação se ainda houver vaga disponível.
     */
    public boolean registrarClassificacao() {
        if (classificados >= vagas) {
            return false;
        }
        classificados++;
        return true;
    }

    @Override
    public String toString() {
        String nomeResponsavel = responsavel == null
                ? "Não informado"
                : responsavel.getNome();

        return "Oportunidade: " + titulo
                + ", Vagas: " + vagas
                + ", Classificados: " + classificados
                + ", Aberta: " + aberta
                + ", Responsável: " + nomeResponsavel;
    }
}
