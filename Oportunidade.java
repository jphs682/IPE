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
        return this.titulo;
    }

    public int getVagas() {
        return this.vagas;
    }

    public int getClassificados() {
        return this.classificados;
    }

    public boolean isAberta() {
        return this.aberta;
    }

    public Professor getResponsavel() {
        return this.responsavel;
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
