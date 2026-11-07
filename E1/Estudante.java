public class Estudante extends Usuario {
    private String matricula;
    private String curso;

    public Estudante(String nome, String email, String senha, String matricula, String curso) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    @Override
    public String toString() {
        return "Estudante: " + getNome() + ", Matrícula: " + getMatricula() + ", Curso: " + getCurso();
    }
}
