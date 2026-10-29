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
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public boolean autenticar(String email, String senha) {
		return this.email.equals(email) && this.senha.equals(senha);
	}

	@Override
	public String toString() {
		return String.format("Nome: %s, E-mail: s%, Senha: s%", this.nome, this.email, this.senha);
	}
}