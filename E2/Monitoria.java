public class Monitoria extends Oportunidade {
    private String disciplina;

    public Monitoria(String titulo, int vagas, Professor responsavel,
                     String disciplina) {
        super(titulo, vagas, responsavel);
        this.disciplina = disciplina;
    }

    // Construtor sobrecarregado: quando as vagas não são informadas,
    // a oportunidade começa com 1 vaga.
    public Monitoria(String titulo, Professor responsavel, String disciplina) {
        this(titulo, 1, responsavel, disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public int cargaHorariaSemanal() {
        return 12;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Monitoria, Disciplina: " + disciplina;
    }
}