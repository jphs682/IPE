import java.util.Objects;

/**
 * Classe base para os usuários da plataforma IPE.
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Verifica as credenciais sem expor a senha em métodos de consulta.
     */
    public boolean autenticar(String email, String senha) {
        return Objects.equals(this.email, email)
                && Objects.equals(this.senha, senha);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, E-mail: %s", nome, email);
    }
}
