/*
 *  Autor : jefferson de almeida
 */
public class AgendaExer07 {
	private String nome;
	private String email;
	private TelefoneExer07 tell;
	
	public TelefoneExer07 getTell() {
		return tell;
	}

	public void setTell(TelefoneExer07 tell) {
		this.tell = tell;
	}

	public AgendaExer07() {
		this.nome = "Exemple Name";
		this.email = "Exemple@Email.com";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
