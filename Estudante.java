public class Estudante extends Usuario{
    private String matricula;
    private String curso;


    public Estudante(String matricula, String curso, String nome, String email, String senha){
        super(nome, email, senha);
        this.matricula = matricula;
        this.curso = curso;
    }
        public String getMatricula(){
            return this.matricula;
        }
        public String getCurso(){
            return this.curso;
        }
        @Override
        public String toString() {
            return "Estudante: " + getNome() + ", Matricula: " + matricula + ", Curso: " + curso + ";
        }
}
