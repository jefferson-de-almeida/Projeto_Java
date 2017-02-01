/* 
 *  Autor : jefferson de almeida
 *  
 */
package Exer3;

import java.lang.reflect.Array;

public class TesteMain {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setAmbiente("Terra");
		camelo.setComprimento(1.5);
		camelo.setCorAnimal("Amarelo");
		camelo.setNumPatas(4);
		camelo.setVelocidade(6.3);
		
		Peixe peixe = new Peixe("Tubarão", 200);
		
		Mamifero urso = new Mamifero();
		urso.setComprimento(200);
		urso.setNome("Urso");
		urso.setNumPatas(4);
		urso.setVelocidade(2.3);
		
		String[] mat = new String[3];
		mat[0] = camelo.toString();
		mat[1] = peixe.toString();
		mat[2] = urso.toString();
		
		for (String c : mat) {
			System.out.println("------------------------");
			System.out.println(c);
		}
		/*
		System.out.println(camelo.toString());
		System.out.println(peixe.toString());
		System.out.println(urso.toString());*/
		System.out.println("Fim do programa");
		

	}
	

}
