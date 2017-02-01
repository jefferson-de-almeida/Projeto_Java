/* 
 *  Autor : jefferson de almeida
 *  
 */
package Exer3;

public class Peixe extends Animal{
	
	private String caracteristica;
	
	

	public Peixe() {
		super();
		this.setAmbiente("Água");
		this.setCaracteristica("Barbatana e calda");
		this.setCorAnimal("Cinza");
		this.setNumPatas(0);
	}

	public Peixe(String nome, double comprimento) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setAmbiente("Água");
		this.setCaracteristica("Barbatana e calda");
		this.setCorAnimal("Cinza");
		this.setNumPatas(0);

	}

	

	private String getCaracteristica() {
		return caracteristica;
	}

	private void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		
		return "Nome : " + this.getNome() + "\n"
				+ "Comprimento : " + this.getComprimento() + " cm\n"
				+ "Ambiente: " + this.getAmbiente() + "\n"
				+ "Número de patas : "+ this.getNumPatas() + "\n"
				+ "Cor do animal : " + this.getCorAnimal() + "\n"
				+ "Velocidade : " + this.getVelocidade() + "\n" 
				+ "Característica : " + this.getCaracteristica();
	}

}
