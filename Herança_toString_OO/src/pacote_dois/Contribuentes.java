/*
 *  Autor : jefferson de almeida
 */
package pacote_dois;

public abstract class Contribuentes {
	
	private String nome;
	private double renda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract double calcularImposto();
	
}
