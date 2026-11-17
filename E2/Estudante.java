public class Estudante extends Usuario implements Resumivel {
    private String matricula;
    private String curso;

    public Estudante(String nome, String email, String senha,
                     String matricula, String curso) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String resumo() {
        return "Estudante: " + getNome()
                + ", Matrícula: " + matricula
                + ", Curso: " + curso;
    }

    @Override
    public String toString() {
        return resumo();
    }
}