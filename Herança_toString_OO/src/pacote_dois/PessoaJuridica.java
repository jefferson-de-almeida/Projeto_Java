/*
 *  Autor : jefferson de almeida
 */
package pacote_dois;

public class PessoaJuridica extends Contribuentes {
	
	private String cnpj;
	
	

	public PessoaJuridica(String nome , double renda , String cnpj) {
		super();
		this.cnpj = cnpj;
		this.setNome(nome);
		this.setRenda(renda);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		// pronto feito a renda bruta
		return this.getRenda() * 0.1;
	}

	@Override
	public String toString() {
		return "Pessoa Jurídica CNPJ : " + cnpj + ", Nome : " + getNome() + ", Renda : " + getRenda() + " Imposto : " + this.calcularImposto();
	}
	
	
}
