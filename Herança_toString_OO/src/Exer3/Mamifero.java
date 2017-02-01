/* 
 *  Autor : jefferson de almeida
 *  
 */
package Exer3;

public class Mamifero extends Animal{
	private String alimento;

	public Mamifero() {
		this.alimento = "Mel";
		this.setAmbiente("Terra");
		this.setCorAnimal("Castanho");
	}	
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Nome : " + this.getNome() + "\n"
				+ "Comprimento : " + this.getComprimento() + " cm \n "
				+ "Ambiente: " + this.getAmbiente() + "\n"
				+ "Número de patas : "+ this.getNumPatas() + "\n"
				+ "Cor do animal : " + this.getCorAnimal() + "\n"
				+ "Velocidade : " + this.getVelocidade()+ "\n" 
				+ "Alimento : " + this.getAlimento();
	}
	
	
	
}
