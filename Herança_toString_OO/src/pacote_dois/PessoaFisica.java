/*
 *  Autor : jefferson de almeida
 */
package pacote_dois;

public class PessoaFisica extends Contribuentes{
	private String cpf;
	
	
	public PessoaFisica(String nome , double renda ,String cpf) {
		super();
		this.cpf = cpf;
		this.setNome(nome);
		this.setRenda(renda);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		
		double imposto = 0;
		if (this.getRenda() <= 1400.0) {
			return 0.0;
		}else if (this.getRenda() > 1400 && this.getRenda() < 2100) {
			imposto = this.getRenda() * 0.1;
			return imposto;
		}else if (this.getRenda() > 2100.01 && this.getRenda() < 2800) {
			imposto = this.getRenda() * 0.15;
			return imposto;
		}else if (this.getRenda() > 2800.01 && this.getRenda() < 3600) {
			imposto = this.getRenda() * 0.25;
			return imposto;
		}else if (this.getRenda() > 3600.01) {
			imposto = this.getRenda() * 0.30;
			return imposto;
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Pessoa Fisica cpf=" + cpf + ", Nome : " + getNome() + ", Renda : " + getRenda() + " Imposto : " + this.calcularImposto();
	}
	
	
}
