/*
 *  Autor : jefferson de almeida
 */
public class ContatoExer06 {
	private String nome;
	//private String endereco; // Bom aqui haverá um classe endereço
	
	
	private TelefoneExer06 telefone;
	
	
	private EnderecoExer06 endereco;
	
	public EnderecoExer06 getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoExer06 endereco) {
		this.endereco = endereco;
	}
	
	
	public ContatoExer06() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}*/

	public TelefoneExer06 getTelefone() {
		
		return telefone;
	}

	public void setTelefone(TelefoneExer06 telefone) {
		this.telefone = telefone;
	}
	
	/*
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}*/
	
}
