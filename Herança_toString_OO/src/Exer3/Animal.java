/*
 *  Autor : jefferson de almeida
 */
package Exer3;

public class Animal {
	
	private String nome;
	private double comprimento ;
	private String ambiente;
	private byte numPatas;
	private String corAnimal;
	private double velocidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public byte getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = (byte )numPatas;
	}
	public String getCorAnimal() {
		return corAnimal;
	}
	public void setCorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade =  velocidade;
	}
	@Override
	public String toString() {
		return "Nome : " + nome + "\n"
				+ "Comprimento : " + comprimento + " cm \n "
				+ "Ambiente: " + ambiente + "\n"
				+ "Número de patas : "+ numPatas + "\n"
				+ "Cor do animal : " + corAnimal + "\n"
				+ "Velocidade : " + velocidade ;
	}
	
	
	
	
	
	
}
