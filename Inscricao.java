public class Inscricao {
    private Estudante estudante;
    private Oportunidade oportunidade;
    private String situacao;

    public Inscricao (String estudante, String oportunidade, String situacao) {
        this.estudante = estudante;
        this.oportunidade = oportunidade;
        this.situacao = "pendente";
    }

    public Estudante getEstudante(){
        return this.estudante;
    }

    public Oportunidade getOportunidade(){
        return this.oportunidade;
    }

    public String getSituacao() {
        return this.situacao;
    }

    
}