public class Estudante extends Usuario{
    private String matricula;
    private String curso;


    public Professor(String matricula, String curso, String nome, String email, String senha){
        super(nome, email, senha);
        this.matricula = matricula;
        this.curso = curso;
    }
        public String getMatricula(){
            return this.Matricula;
        }
        public String getCurso(){
            return this.curso;
        }
        @Override
        public String toString() {
            return "Estudante: " + getNome() + ", Matricula: " + matricula + ", Curso: " + curso + ";
        }
}
