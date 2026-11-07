public class Inscricao {

    private Estudante estudante;
    private Oportunidade oportunidade;
    private String situacao;

    public Inscricao(Estudante estudante, Oportunidade oportunidade) {
        this.estudante = estudante;
        this.oportunidade = oportunidade;
        this.situacao = "pendente";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public boolean classificar() {
        if (!situacao.equals("pendente")) {
            return false;
        }

        if (!oportunidade.registrarClassificacao()) {
            return false;
        }

        situacao = "classificada";
        return true;
    }

    public void desclassificar() {
        if (situacao.equals("classificada")) {
            oportunidade.cancelarClassificacao();
        }

        situacao = "desclassificada";
    }

    @Override
    public String toString() {
        return "Inscrição: estudante=" + estudante.getNome()
                + ", oportunidade=" + oportunidade.getTitulo()
                + ", situação=" + situacao;
    }
}
