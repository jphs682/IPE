public class Professor extends Usuario{
    private String siape;
    private String titulacao;


    public Professor(String siape, String titulacao, String nome, String email, String senha){
        super(nome, email, senha);
        this.siape = siape;
        this.titulacao = titulacao;
    }
        public String getSiape(){
            return this.siape;
        }
        public String getTitulacao(){
            return this.titulacao;
        }
        @Override
        public String toString() {
            return "Professor: " + getNome() + ", SIAPE: " + siape + ", Titulação: " + titulacao + ", Email: " + getEmail();
        }
}
