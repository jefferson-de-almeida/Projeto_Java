
public class EnderecoExer06 {
	private String nomeRua;
	private String complemento;
	private String cidade;
	private String Estado;
	private String numero;
	
	private String cep;
	
	public EnderecoExer06() {
		this.nomeRua = "N�o Definodo";
		this.complemento ="N�o Definodo";
		this.cidade = "N�o Definodo";
		this.numero = "N�o Definodo";
		this.Estado = "N�o definodo";
		this.cep ="N�o Definodo";
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
