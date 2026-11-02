/**
 * Representa a inscrição de um estudante em uma oportunidade.
 */
public class Inscricao {
    public static final String PENDENTE = "Pendente";

    private Estudante estudante;
    private Oportunidade oportunidade;
    private String situacao;

    public Inscricao(Estudante estudante, Oportunidade oportunidade) {
        this.estudante = estudante;
        this.oportunidade = oportunidade;
        this.situacao = PENDENTE;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public Oportunidade getOportunidade() {
        return this.oportunidade;
    }

    public String getSituacao() {
        return this.situacao;
    }

    @Override
    public String toString() {
        return "Inscrição: estudante=" + estudante.getNome()
                + ", oportunidade=" + oportunidade.getTitulo()
                + ", situação=" + situacao;
    }
}
